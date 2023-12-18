import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int[][] dp = new int[s.length() + 1][t.length() + 1];

		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= t.length(); j++) {
				if (s.charAt(i-1) != t.charAt(j-1)) {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				} else {
					dp[i][j] = dp[i-1][j-1] + 1;
				}
			}
		}

		if (dp[s.length()][t.length()] == 0) {
			System.out.println();
			return;
		}

		StringBuilder sb = new StringBuilder();
		int i = s.length(), j = t.length();
		while (i != 0 && j != 0) {
			if (dp[i][j] == dp[i-1][j]) {
				i--;
			} else if (dp[i][j] == dp[i][j-1]) {
				j--;
			} else if (dp[i][j] == dp[i-1][j-1] + 1) {
				sb.append(t.charAt(j-1));
				i--;
				j--;
			}
		}
		sb.reverse();
		System.out.println(sb.toString());
	}
}
