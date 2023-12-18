import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * M and A
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		String S, T;
		S = br.readLine();
		T = br.readLine();

		String[] ts = {"", ""};
		for (int i = 0; i < S.length(); i++) {
			if (i % 2 == 0) {
				ts[0] += S.charAt(i);
			} else {
				ts[1] += S.charAt(i);
			}
		}

		boolean ans = false;

		for (String t : ts) ans |= lcs(t, T) == t.length();

		System.out.println(ans ? "Yes" : "No");

	} //end main

	public static int lcs(CharSequence s1, CharSequence s2) {

		int[][] dp = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				dp[i][j] = Math.max(Math.max(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1])
						+ (s1.charAt(i - 1) == s2.charAt(j - 1) ? 1 : 0);
			}
		}

		return dp[s1.length()][s2.length()];
	}
}