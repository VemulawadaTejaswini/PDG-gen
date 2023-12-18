import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long ans = 0;
        long twoFactor = 1;
        int MOD = 1_000_000_007;
        for (int i = 0; i < 60; i++) {
            long odd = 0;
            long even = 0;
            for (int j = 0; j < n; j++) {
                if ((a[j] >>> i & 1) == 1) {
                    odd++;
                } else {
                    even++;
                }
            }
            ans += (odd * even) % MOD * twoFactor % MOD;
            ans %= MOD;
            twoFactor *= 2;
            twoFactor %= MOD;
        }
        System.out.println(ans);
    }

}
