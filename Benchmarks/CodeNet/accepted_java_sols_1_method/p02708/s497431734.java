import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long least = sc.nextLong();
        long total = 0;
        long mod = 1000000007;

        for (long k = least; k < n + 2; k++) {
            long first = (k * (k - 1)) / 2;
            long last = (k * (2 * n - k + 1)) / 2;
            total = (total + (last - first + 1)) % mod;
        }
        System.out.println(total);
    }
}