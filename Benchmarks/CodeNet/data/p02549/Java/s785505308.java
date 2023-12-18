import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] L = new int[K];
        int[] R = new int[K];
        for (int i = 0; i < K; i++) {
            L[i] = scan.nextInt();
            R[i] = scan.nextInt();
        }
        long mod = 998244353;
        long[] dp = new long[N+1];
        dp[1] = 1;
        dp[2] = -1;
        for (int i = 1; i <= N; i++) {
            if (1 < i) {
                dp[i] += dp[i - 1];
                dp[i] %= mod;
            }
            for (int j = 0; j < K; j++) {
                if (N < i + L[j]) {
                    continue;
                }
                dp[i + L[j]] += dp[i];
                dp[i + L[j]] %= mod;
                if (i + R[j] + 1 <= N) {
                    dp[i + R[j] + 1] -= dp[i];
                    dp[i + R[j] + 1] %= mod;
                    if (dp[i + R[j] + 1] < 0) {
                        dp[i + R[j] + 1] += mod;
                    }
                }
            }
        }
        System.out.println(dp[N]);
    }
}
