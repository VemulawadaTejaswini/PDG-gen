import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static long MOD = 1000000007L;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String S = in.readLine();
		long[][] dp = new long[S.length() + 1][13];
		dp[0][0] = 1;
		for (int i = 0; i < S.length(); ++i) {
			int c = S.charAt(i) == '?' ? -1 : Integer.parseInt(S.substring(i, i + 1));
			for (int j = 0; j < 10; ++j) {
				if (c != -1 && c != j) {
					continue;
				}
				for (int k = 0; k < 13; ++k) {
					dp[i + 1][(k * 10 + j) % 13] += dp[i][k];
				}
			}
			for (int j = 0; j < 13; ++j) {
				dp[i + 1][j] %= MOD;
			}
		}
		System.out.println(dp[S.length()][5]);
	}
}
