import java.util.*;
public class Main {

	public static void main(String[] args) {
		int MOD = 998244353;
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		long[][] dp = new long[C+1][D+1];
		long[][] S = new long[C+1][D+1];
		dp[A][B] = 1;
		for(int i = B; i < D; i++)
			dp[A][i+1] = dp[A][i] * A % MOD;
		for(int i = A; i < C; i++)
			dp[i+1][B] = dp[i][B] * B % MOD;
		for(int i = A+1; i <= C; i++)
			for(int j = B+1; j <= D; j++) {
				S[i][j] = (S[i-1][j] * (j-1) + dp[i-1][j]) % MOD;
				dp[i][j] = (dp[i][j-1] * i + S[i][j]) % MOD;
			}
		System.out.println(dp[C][D]);
	}

}