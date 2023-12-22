import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int gcd(int a, int b) {
        if (a % b != 0) {
            return gcd(b, a % b);
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int max = Integer.MAX_VALUE;
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] nl = new int[n];
        int[] tl = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            nl[i] = sc.nextInt();
            tl[i] = sc.nextInt();
            if (tl[i] <= t && nl[i] < max) {
                max = nl[i];
            }
        }

        if (max == Integer.MAX_VALUE) {
            System.out.println("TLE");
        } else {
            System.out.println(max);
        }

    }
}