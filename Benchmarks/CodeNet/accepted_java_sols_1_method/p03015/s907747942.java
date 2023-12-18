import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mod = 1_000_000_007;
		String L = sc.next();
		int n = L.length();
		long[][] dp = new long[n+1][2];
		dp[0][0] = 1;
		for (int i=0;i<n;i++) {
			if (L.charAt(i)=='1') {
				dp[i+1][1]=(dp[i][1]*3+dp[i][0]) % mod;
				dp[i+1][0]=dp[i][0]*2 % mod;
			} else {
				dp[i+1][1]=dp[i][1]*3 % mod;
				dp[i+1][0]=dp[i][0] % mod;

			}
		}
		long ans = (dp[n][0]+dp[n][1]) % mod;
		System.out.println(ans);
	}

}