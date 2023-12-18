import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Sum of 4 Integers II
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int[][] dp = new int[5][4001];

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j <= 1000; j++) {
				dp[i][i * j] = 1;
			}
		}
		for (int i = 1; i <= 4; i++) {
			dp[i][0] = 1;
		}

		for (int i = 2; i <= 4; i++) {
			for (int j = 1; j <= 1000; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			System.out.println(dp[4][parseInt(line)]);
		} // end while
	} // end main
}