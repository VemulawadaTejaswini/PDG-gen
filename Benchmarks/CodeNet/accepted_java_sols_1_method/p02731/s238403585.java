// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String S = sc.next();

        final long L = sc.nextLong();
        // final int A = sc.nextInt();
        // final long B = sc.nextLong();
        // final String s = sc.next();
        // final String b = sc.next();

        // double l = L / 3.0;
        BigDecimal l = new BigDecimal(( L / 3.0 ) * ( L / 3.0 ) * ( L / 3.0 ));

        System.out.println(l.toPlainString());

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}