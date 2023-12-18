/*
    Author: Anthony Ngene
    Created: 19/09/2020 - 13:00
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char ch = word.charAt(word.length() - 1);
        word = word + ((ch == 's') ? "es" : "s");
        System.out.println(word);
    }
}
