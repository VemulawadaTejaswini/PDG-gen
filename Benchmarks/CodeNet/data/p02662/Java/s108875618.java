import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int S = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        long[][] dp = new long[N+1][S+1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], 0);
        }
        dp[0][0] = 1;
        long mod = 998244353;
        for (int i = 1; i <= N; i++) {
            for (int j = S; 0 <= j; j--) {
                if (dp[i-1][j] == Long.MAX_VALUE) {
                    continue;
                }
                dp[i][j] += dp[i-1][j] * 2;
                dp[i][j] %= mod;
                if (S < j + A[i-1]) {
                    continue;
                }
                dp[i][j + A[i-1]] += dp[i-1][j];
                dp[i][j + A[i-1]] %= mod;
            }
        }
        System.out.println(dp[N][S]);
    }
}
