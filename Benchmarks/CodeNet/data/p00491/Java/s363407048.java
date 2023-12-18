import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] R = new int[N];
		Arrays.fill(R, -1);
		for (int i = 0; i < K; ++i) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			R[A] = B;
		}
		int[][][] dp = new int[3][3][N];
		if (R[0] == -1) {
			dp[1][0][0] = dp[2][1][0] = dp[0][2][0] = 1;
		} else {
			dp[(R[0] + 1) % 3][R[0]][0] = 1;
		}
		for (int i = 1; i < N; ++i) {
			if (R[i] == -1) {
				for (int j = 0; j < 3; ++j) {
					for (int k = 0; k < 3; ++k) {
						dp[j][k][i] += dp[(j + 1) % 3][j][i - 1];
						dp[j][k][i] += dp[(j + 2) % 3][j][i - 1];
						if (j != k) dp[j][k][i] += dp[j][j][i - 1];
						dp[j][k][i] %= 10000;
					}
				}
			} else {
				for (int j = 0; j < 3; ++j) {
					dp[j][R[i]][i] += dp[(j + 1) % 3][j][i - 1];
					dp[j][R[i]][i] += dp[(j + 2) % 3][j][i - 1];
					if (j != R[i]) dp[j][R[i]][i] += dp[j][j][i - 1];
					dp[j][R[i]][i] %= 10000;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				ans += dp[i][j][N - 1];
			}
		}
		System.out.println(ans % 10000);
	}
}