import java.util.*;

class Main {
	static int mod = 1_000_000_007;
	static long[][] dp = new long[100005][2];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String L = sc.next();
		int n = L.length();
		dp[0][0] = 1;
		for (int i=0;i<n;i++) {
			if (L.charAt(i) == '0') {
				dp[i+1][0] = dp[i][0];
				dp[i+1][1] = dp[i][1];
			} else {
				dp[i+1][1] = (dp[i][0] + dp[i][1]) % mod;
			}
			if (L.charAt(i) == '0') {
				dp[i+1][1] = (dp[i+1][1] + dp[i][1]*2) % mod;
			} else {
				dp[i+1][0] = (dp[i+1][0] + dp[i][0]*2) % mod;
				dp[i+1][1] = (dp[i+1][1] + dp[i][1]*2) % mod;
			}
		}
		long ans = (dp[n][0]+dp[n][1]) % mod;
		System.out.println(ans);
	}

}