// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String N = sc.next();

        final int X = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        // final int N = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();

        String msg = "delicious";
        if (A < B) {
            msg = (B - A) > X ? "dangerous" : "safe";
         }

        System.out.println(msg);

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}