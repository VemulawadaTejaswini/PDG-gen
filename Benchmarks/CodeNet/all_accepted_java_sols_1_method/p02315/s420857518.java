/**
 * Combinatorial - 0-1 Knapsack Problem
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int w = parseInt(line.substring(line.indexOf(' ') + 1));

			int[][] dp = new int[n + 1][w + 1];
			int[] vs = new int[n + 1];
			int[] ws = new int[n + 1];

			for (int i = 1; i < n + 1; i++) {
				line = br.readLine();
				vs[i] = parseInt(line.substring(0, line.indexOf(' ')));
				ws[i] = parseInt(line.substring(line.indexOf(' ') + 1));
			}

			//
			for (int i = 1; i < n + 1; i++) {
				for (int j = 1; j < w + 1; j++) {
					if (j < ws[i]) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - ws[i]] + vs[i]);
					}
				}
			}
			System.out.println(dp[n][w]);
		}//end while
	}//end main
}