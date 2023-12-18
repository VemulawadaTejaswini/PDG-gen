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

		long[][] dp = new long[10][1001];

		dp[1][0] = 1;
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 1001; k++) {
					if (dp[j][k] > 0 && j < 9 && k + 1 < 1001) {
						dp[j + 1][k + i] += dp[j][k];
					}
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n, s;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			s = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | s) == 0) break;

			System.out.println(dp[n][s]);

		} // end while
	} // end main
}