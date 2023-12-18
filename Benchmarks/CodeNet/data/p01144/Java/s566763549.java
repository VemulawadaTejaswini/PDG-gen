import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();// æÔ
			int m = sc.nextInt();// PÌ¨©Ë
			if (n == 0 && m == 0) {
				break;
			}
			int c = 0;
			int dp[][] = new int[n][2];
			for (int i = 0; i < n; i++) {
				dp[i][0] = sc.nextInt();
				dp[i][1] = sc.nextInt();
			}
			for (int k = 10; k > 0 && m > 0; k--) {
				for (int i = 0; i < n && m > 0; i++) {
					if (dp[i][1] == k) {
						if (dp[i][0] <= m) {
							m -= dp[i][0];
							dp[i][0] = 0;
						} else {
							dp[i][0] -= m;
							m = 0;
							break;
						}
					}
				}
			}

			for (int i = 0; i < n; i++) {
				c += dp[i][0] * dp[i][1];
			}
			System.out.println(c);
		}
	}
}