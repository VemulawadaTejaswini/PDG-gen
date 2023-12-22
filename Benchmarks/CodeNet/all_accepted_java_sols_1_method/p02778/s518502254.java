// package app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        // final long N = sc.nextLong();
        // final long A = sc.nextLong();
        // final long B = sc.nextLong();
        // final String s = sc.next();
        // final String b = sc.next();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < S.length(); i++) {
            sb.append('x');
        }

        System.out.println(sb.toString());

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}