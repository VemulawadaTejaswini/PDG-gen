import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int dp[][] = new int[49][49];
		int n = 0;
		for (int i = 0; i < 49; i++) {
			if (!sc.hasNext()) {
				n = i - 1;
				break;
			}
			String tmp[] = sc.next().split(",");
			for (int j = 0; j < tmp.length; j++)
				dp[i][j] = Integer.parseInt(tmp[j]);
			// System.out.println(Arrays.toString(dp[i]));
		}
		//System.out.println(n);
		if (n == 0) {
			System.out.println(dp[0][0]);
		} else {
			for (int i = 1; i <= n / 2; i++) {
				for (int j = 0; j <= i; j++) {
					if (j - 1 < 0) {
						dp[i][j] += dp[i - 1][j];
					} else {
						dp[i][j] += Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
					}
				}
			}
			for (int i = n / 2 + 1; i <= n; i++) {
				for (int j = 0; j <= n - i; j++) {
					dp[i][j] += Math.max(dp[i - 1][j], dp[i - 1][j + 1]);
				}
			}
			System.out.println(dp[n][0]);
		}
	}
}