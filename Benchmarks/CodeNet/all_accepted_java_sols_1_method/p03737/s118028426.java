// package app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String x = sc.next();
        // final String y = sc.next();

        final String s1 = sc.next();
        final String s2 = sc.next();
        final String s3 = sc.next();
        // final int N = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();

        StringBuffer result = new StringBuffer().append(s1.charAt(0)).append(s2.charAt(0)).append(s3.charAt(0));

        System.out.println(result.toString().toUpperCase());

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}