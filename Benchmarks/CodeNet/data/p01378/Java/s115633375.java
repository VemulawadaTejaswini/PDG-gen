import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String str = sc.next();
		int wPos = str.indexOf('w');
		String pre = str.substring(0, wPos - 1);
		String suf = str.substring(wPos + 2);
		int[][] dp = new int[pre.length() + 1][suf.length() + 1];
		for (int i = 1; i <= pre.length(); ++i) {
			for (int j = 1; j <= suf.length(); ++j) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				if (syn(pre.charAt(i - 1), suf.charAt(suf.length() - j))) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 2);
				}
			}
		}
		System.out.println(dp[pre.length()][suf.length()] + 3);
	}

	static boolean syn(char c1, char c2) {
		if (c1 == '(' && c2 == ')') {
			return true;
		}
		if (c1 == ')' && c2 == '(') {
			return true;
		}
		if (c1 == '{' && c2 == '}') {
			return true;
		}
		if (c1 == '}' && c2 == '{') {
			return true;
		}
		if (c1 == '[' && c2 == ']') {
			return true;
		}
		if (c1 == ']' && c2 == '[') {
			return true;
		}
		return false;
	}

}