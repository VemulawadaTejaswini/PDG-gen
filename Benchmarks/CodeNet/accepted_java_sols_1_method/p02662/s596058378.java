import java.util.*;

public class Main {
    static final int MOD = 998244353;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[][] dp = new int[n + 1][s + 1];
		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    for (int j = s; j >= 0; j--) {
		        dp[i + 1][j] = dp[i][j] * 2 % MOD;
		        if (j - x >= 0) {
		            dp[i + 1][j] += dp[i][j - x];
		            dp[i + 1][j] %= MOD;
		        }
		    }
		}
	    System.out.println(dp[n][s]);
	}
}
