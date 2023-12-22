import java.util.stream.DoubleStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = n % k;
        long b = k - a;
        System.out.println(a < b ? a : b);
    }
}