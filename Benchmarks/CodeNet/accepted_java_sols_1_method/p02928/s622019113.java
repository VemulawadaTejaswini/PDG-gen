import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        final long MOD = 1_000_000_007;
        long inner = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    inner++;
                }
            }
        }
        inner *= k;
        inner %= MOD;
        long outer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] > a[j]) {
                    outer++;
                }
            }
        }
        outer *= (k * (k - 1) / 2) % MOD;
        System.out.println((inner + outer) % MOD);
    }
}
