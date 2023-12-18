import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * The Shortest Path on A Rhombic Path - Accepted
 */
public class Main {

	public static int MAX = 100;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int[][] dp = new int[MAX][MAX];

		int prevLen = 0, maxLen = 0;
		while ((line = br.readLine()) != null && !line.isEmpty()) {

			String[] words = line.split(",");

			if (words.length > prevLen) {
				for (int i = 0, r = words.length - 1, c = 0; i < words.length; i++, r--, c++) {
					dp[r][c] = parseInt(words[i]);
				}
			} else {
				for (int i = 0, r = maxLen - 1, c = maxLen - words.length; i < words.length; i++, r--, c++) {
					dp[r][c] = parseInt(words[i]);
				}
			}
			prevLen = words.length;
			maxLen = Math.max(maxLen, words.length);
		} // end while

		for (int i = 1; i < maxLen; i++) dp[0][i] += dp[0][i - 1];
		for (int i = 1; i < maxLen; i++) dp[i][0] += dp[i - 1][0];

		for (int i = 1; i < maxLen; i++) {
			for (int j = 1; j < maxLen; j++) {
				dp[i][j] += Math.max(dp[i][j - 1], dp[i - 1][j]);
			}
		}
		System.out.println(dp[maxLen - 1][maxLen - 1]);
	} // end main
}