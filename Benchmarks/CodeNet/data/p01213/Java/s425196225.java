import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Repeated Subsequences
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("#END")) break;

			int maxLen = 0;
			String L = "";

			for (int i = 1; i < line.length(); i++) {

				char[] F = new char[i];
				char[] R = new char[line.length() - i];

				if (F.length < maxLen || R.length < maxLen) continue;

				for (int j = 0; j < F.length; j++) {
					F[j] = line.charAt(j);
				}
				for (int j = 0; j < R.length; j++) {
					R[j] = line.charAt(i + j);
				}

				int[][] dp = new int[F.length + 1][R.length + 1];
				for (int j = 0; j < F.length; j++) {
					for (int k = 0; k < R.length; k++) {
						if (F[j] == R[k]) {
							dp[j + 1][k + 1] += dp[j][k] + 1;
						} else {
							dp[j + 1][k + 1] = Math.max(dp[j][k + 1], dp[j + 1][k]);
						}
					}
				}
				//L string
				if (dp[F.length][R.length] > maxLen) {
					StringBuilder sb = new StringBuilder();
					for (int j = 1; j <= R.length; j++) {
						if (dp[F.length][j - 1] != dp[F.length][j]) {
							sb.append(R[j - 1]);
						}
					}
					L = sb.toString();
					maxLen = dp[F.length][R.length];
				}
			}
			System.out.println(L);
		} //end while
	} //end main
}