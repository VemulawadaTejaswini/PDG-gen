// package app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String s = sc.next();
        final int A = sc.nextInt();
        final String op = sc.next();
        final int B = sc.nextInt();
        // final String s = sc.next();
        // final String b = sc.next();

        // final int b = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();

        int result = op.equals("+") ? A + B : A - B;

        System.out.println(result);

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}