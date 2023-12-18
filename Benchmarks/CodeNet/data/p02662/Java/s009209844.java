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
		    for (int j = i; j >= 0; j--) {
		        for (int k = s - x; k >= 0; k--) {
		            dp[j + 1][k + x] += dp[j][k];
		            dp[j + 1][k + x] %= MOD;
		        }
		    }
		}
		long ans = 0;
		for (int i = 1; i <= n; i++) {
		    ans += dp[i][s] * pow(2, n - i) % MOD;
		    ans %= MOD;
		}
	    System.out.println(ans);
	}
	
	static long pow(long x, long p) {
	    if (p == 0) {
	        return 1;
	    } else if (p % 2 == 0) {
	        return pow(x * x % MOD, p / 2);
	    } else {
	        return pow(x, p - 1) * x % MOD;
	    }
	}
}
