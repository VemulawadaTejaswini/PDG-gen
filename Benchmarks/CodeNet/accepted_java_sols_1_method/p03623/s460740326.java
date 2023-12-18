// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String N = sc.next();

        final int x = sc.nextInt();
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        // final int N = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();

        int xa = Math.abs(x - a);
        int xb = Math.abs(x - b);

        System.out.println(xa < xb ? "A" : "B");

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}