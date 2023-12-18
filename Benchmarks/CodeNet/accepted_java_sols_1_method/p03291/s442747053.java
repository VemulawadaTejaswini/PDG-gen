import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MOD = 1_000_000_007;
		char[] T = sc.next().toCharArray();
		int N = T.length;
		long[][] dp = new long[N+1][4];
		dp[0][0] = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 4; j++)
				dp[i+1][j] = dp[i][j] % MOD;
			if(T[i] == 'A')
				dp[i+1][1] += dp[i][0];
			else if(T[i] == 'B')
				dp[i+1][2] += dp[i][1];
			else if(T[i] == 'C')
				dp[i+1][3] += dp[i][2];
			else {
				for(int j = 0; j < 4; j++)
					dp[i+1][j] *= 3;
				dp[i+1][1] += dp[i][0];
				dp[i+1][2] += dp[i][1];
				dp[i+1][3] += dp[i][2];
			}
		}
		System.out.println(dp[N][3] % MOD);
	}

}