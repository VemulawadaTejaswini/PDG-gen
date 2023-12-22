// package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();

        int result = a <= b ? a : a - 1;

        System.out.println(result);

    }
}