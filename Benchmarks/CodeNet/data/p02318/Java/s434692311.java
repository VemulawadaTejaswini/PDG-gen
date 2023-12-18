
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int INF = 1 << 29;

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();

		// dp init
		int[][] dp = new int[s2.length()+1][s1.length()+1];
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				dp[i][j] = INF;
			}
		}
		for (int i = 0; i < s1.length()+1; i++) {
			dp[0][i] = i;
		}
		for (int i = 0; i < s2.length()+1; i++) {
			dp[i][0] = i;
		}

		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if (s2.substring(i, i+1).equals(s1.substring(j, j+1))) {
					dp[i+1][j+1] = Math.min(dp[i][j], Math.min(dp[i+1][j]+1, dp[i][j+1]+1));
				} else {
					dp[i+1][j+1] = Math.min(dp[i][j]+1, Math.min(dp[i+1][j]+1, dp[i][j+1]+1));
				}
			}
		}
		System.out.println(dp[s2.length()][s1.length()]);
	}
}

