import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MOD = 998244353;
		int N = sc.nextInt();
		int S = sc.nextInt();
		long[][] dp = new long[N+1][S+1];
		dp[0][0] = 1;
		for(int i = 0; i < N; i++) {
        	int A = sc.nextInt();
			for(int j = 0; j <= S; j++)
				dp[i+1][j] = dp[i][j] * 2 % MOD;
			for(int j = 0; j + A <= S; j++)
				dp[i+1][j+A] += dp[i][j];
		}
		System.out.println(dp[N][S] % MOD);
	}
}
