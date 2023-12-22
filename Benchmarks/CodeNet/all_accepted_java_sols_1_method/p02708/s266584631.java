import java.util.Scanner;

public class Main {
    static final int mod = 1000000007;
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        long[] a = new long[n + 1];
        for (int i = 1 ; i < n + 1 ; i++) {
            a[i] = (long) a[i - 1] + i;
        }

        for (int i = k ; i <= n ; i++) {
            ans += (a[n] - a[n - i] - a[i - 1] + 1 + mod) % mod;
        }
        System.out.println((ans + 1) % mod);

        }

}