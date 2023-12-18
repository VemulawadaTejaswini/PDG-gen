import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Pollock's conjecture - Time Limit Exceeded
 */
public class Main {

	static final int MAX = 1000000;
	static final int MAX3 = 1500;
	static final int MAX4 = 200;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int[] R3 = new int[MAX3];
		int[] R4 = new int[MAX4];

		R3[1] = 1;
		for (int i = 2; i < R3.length; i++) {
			R3[i] = R3[i - 1] + i;
		}

		R4[1] = 1;
		for (int i = 2; i < R4.length; i++) {
			R4[i] = R4[i - 1] + R3[i];
		}

		int[][] dp = new int[2][MAX];
		for (int i = 1; i < dp[0].length; i++) dp[1][i] = dp[0][i] = i;
		//decided i < 4
		for (int i = 4; i < dp[0].length; i++) {
			for (int j = 2; j < R4.length; j++) {
				if (i - R4[j] >= 0) {
					dp[0][i] = Math.min(dp[0][i], dp[0][i - R4[j]] + 1);
					if (R4[j] % 2 != 0) {
						dp[1][i] = Math.min(dp[1][i], dp[1][i - R4[j]] + 1);
					}
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			System.out.println(dp[0][n] + " " + dp[1][n]);

		}//end while
	}//end main
}