import java.util.Scanner;
import java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int[][] dp = new int[s.length() + 1][t.length() + 1];

		for (int i = 0; i <= s.length(); i++) {
			dp[i][0] = 0;
		}
		for (int i = 0; i <= t.length(); i++) {
			dp[0][i] = 0;
		}
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= t.length(); j++) {
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		int i = s.length();
		int j = t.length();
		String result = "";
		while (i > 0 && j > 0) {
			if (dp[i][j] == dp[i][j - 1]) {
				j--;
			}
			else if (dp[i][j] == dp[i - 1][j]) {
				i--;
			}
			else{
				result = s.charAt(i - 1) + result;
				i--;
				j--;
			}
		}
		System.out.println(result);
	}
}
