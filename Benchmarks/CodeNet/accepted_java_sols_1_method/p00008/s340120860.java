import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Sum of 4 Integers
 */
public class Main {

	static int N = 4;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);

			int[][] dp = new int[N + 1][n + 1];
			dp[0][0] = 1;

			for (int i = 1; i <= N; i++) {
				for (int j = 0; j <= 9; j++) {
					for (int k = j; k <= n; k++) {
						dp[i][k] += dp[i - 1][k - j];
					}
				}
			}

			System.out.println(dp[N][n]);
		}
	}
}
