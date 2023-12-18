import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Sum of Integers II
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, s;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			s = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | s) == 0) return;

			long[][][] dp = new long[101][n + 1][s + 1];

			dp[0][0][0] = 1;
			dp[0][1][0] = 1;

			for (int i = 1; i <= 100; i++) {
				for (int j = 1; j <= n; j++) {
					for (int k = i; k <= s; k++) {
						for (int l = 0; l < i; l++) {
							dp[i][j][k] += dp[l][j - 1][k - i];
						}
					}
				}
			}

			long ans = 0;

			for (int i = 0; i <= 100; i++) {
				ans += dp[i][n][s];
			}

			System.out.println(ans);
		}
	}
}