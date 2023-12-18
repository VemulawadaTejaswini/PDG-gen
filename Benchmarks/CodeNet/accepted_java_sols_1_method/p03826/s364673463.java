// package app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String a = sc.next();
        // final String b = sc.next();

        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int C = sc.nextInt();
        final int D = sc.nextInt();
        // final int b = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();

        System.out.println(Math.max((A * B), (C * D)));

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}