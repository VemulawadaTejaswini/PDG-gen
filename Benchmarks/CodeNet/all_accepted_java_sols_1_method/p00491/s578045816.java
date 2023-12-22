import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Pasta
 * JOI 11th, Pre 4
 */
public class Main {

	static final int MOD = 10000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		//long sta, end;
		//sta = System.nanoTime();

		//
		int N, K;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		K = parseInt(line.substring(line.indexOf(' ') + 1));

		int[] plan = new int[N + 1];

		for (int i = 0; i < K; i++) {
			line = br.readLine();
			int A, B;
			A = parseInt(line.substring(0, line.indexOf(' ')));
			B = parseInt(line.substring(line.indexOf(' ') + 1));
			plan[A] = B;
		}

		int[][][] dp = new int[N + 1][4][2];

		if (plan[1] != 0) {
			dp[1][plan[1]][0] = 1;
		} else {
			dp[1][1][0] = 1;
			dp[1][2][0] = 1;
			dp[1][3][0] = 1;
		}

		for (int i = 2; i <= N; i++) {

			dp[i][1][1] += dp[i - 1][1][0];
			dp[i][2][1] += dp[i - 1][2][0];
			dp[i][3][1] += dp[i - 1][3][0];
			dp[i][1][0] += dp[i - 1][2][0] + dp[i - 1][3][0] + dp[i - 1][2][1] + dp[i - 1][3][1];
			dp[i][2][0] += dp[i - 1][1][0] + dp[i - 1][3][0] + dp[i - 1][1][1] + dp[i - 1][3][1];
			dp[i][3][0] += dp[i - 1][1][0] + dp[i - 1][2][0] + dp[i - 1][1][1] + dp[i - 1][2][1];

			for (int j = 1; j <= 3; j++) {
				for (int k = 0; k < 2; k++) {
					if (plan[i] != 0 && j != plan[i]) {
						dp[i][j][k] = 0;
					} else {
						dp[i][j][k] %= MOD;
					}
				}
			}
		}

		int ans = dp[N][1][0]
				+ dp[N][1][1]
				+ dp[N][2][0]
				+ dp[N][2][1]
				+ dp[N][3][0]
				+ dp[N][3][1];
		ans %= MOD;

		System.out.println(ans);

		//
		//end = System.nanoTime();
		//System.out.printf("%.6f ms%n", (end - sta) / 1000.0 / 1000);
	}
}