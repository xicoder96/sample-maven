package com.xicoder.random;


import org.junit.jupiter.api.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomGeneratorTest {

    @DisplayName("Checking whether the random string length is given length")
    @Test
    public void lengthTest() {
        int length = 12;
        String randomString = RandomGenerator.getRandomStringGenerated(length);
        Assertions.assertEquals(randomString.length(), length);
    }

    @DisplayName("Checking whether the random string contains only alphanumeric characters")
    @Test
    public void alphaNumericTest() {
        String randomString = RandomGenerator.getRandomStringGenerated(12);
        // Regex to check string is alphanumeric or not.
        String regex = "^[a-zA-Z0-9]+$";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        // Pattern class contains matcher() method
        // to find matching between given string
        // and regular expression.
        Matcher m = p.matcher(randomString);
        // Should return true
        Assertions.assertTrue(m.matches());
    }
}
