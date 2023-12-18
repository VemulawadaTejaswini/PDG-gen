/**
 * Combinatorial - Knapsack Problem
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

			int[] dp = new int[w + 1];
			int[] vs = new int[n];
			int[] ws = new int[n];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				vs[i] = parseInt(line.substring(0, line.indexOf(' ')));
				ws[i] = parseInt(line.substring(line.indexOf(' ') + 1));
			}

			//
			for (int i = 0; i < n; i++) {
				for (int j = ws[i]; j < w + 1; j++) {
					dp[j] = Math.max(dp[j], dp[j - ws[i]] + vs[i]);
				}
			}
			System.out.println(dp[w]);
		}//end while
	}//end main
}