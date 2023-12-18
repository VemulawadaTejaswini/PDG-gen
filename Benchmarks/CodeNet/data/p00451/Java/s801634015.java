import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Common Sub-String
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			String s1 = line;
			String s2 = br.readLine();

			System.out.println(lcs(s1, s2));

		}//end while
	}//end main

	static int lcs(String s1, String s2) {

		int[][] dp = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				} else {
					dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
				}
			}
		}
		return dp[s1.length()][s2.length()];
	}
}