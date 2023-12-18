//package Beginner122;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        if(str.charAt(0) == 'A') {
            System.out.println("T");
        } else if(str.charAt(0) == 'T') {
            System.out.println("A");
        } else if(str.charAt(0) == 'G') {
            System.out.println("C");
        } else {
            System.out.println("G");
        }
    }
}
