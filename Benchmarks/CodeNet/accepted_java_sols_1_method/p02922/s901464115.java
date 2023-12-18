// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // long N = sc.nextLong();
        // long K = sc.nextLong();
        int B = sc.nextInt();
        int A = sc.nextInt();

        System.out.println((A - 1) % (B - 1) != 0 ? (A - 1) / (B - 1) + 1 : (A - 1) / (B - 1));

    }
}