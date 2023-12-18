import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		String s = sc.next();
		int[] c = new int[N];
		for (int i = 0; i < N; ++i) {
			c[i] = 1 << "JOI".indexOf(s.charAt(i));
		}
		int[][] dp = new int[1 << 3][N + 1];
		dp[1][0] = 1;
		int MOD = 10007;
		for (int i = 0; i < N; ++i) {
			for (int j = 1; j < (1 << 3); ++j) {
				if ((j & c[i]) == 0) continue;
				for (int k = 1; k < (1 << 3); ++k) {
					if ((j & k) == 0) continue;
					dp[j][i + 1] += dp[k][i];
					if (dp[j][i + 1] >= MOD) dp[j][i + 1] -= MOD;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < (1 << 3); ++i) {
			ans += dp[i][N];
		}
		System.out.println(ans % MOD);
	}
}