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

			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int s = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | s) == 0) return;

			int[][] dp = new int[n + 1][s + 1];

			dp[0][0] = 1;

			for (int i = 1; i <= 100; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k <= s - i; k++) {
						dp[j + 1][k + i] += dp[j][k];
					}
				}
			}

			System.out.println(dp[n][s]);
		}
	}
}