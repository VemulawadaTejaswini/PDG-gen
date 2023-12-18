import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			int gx = sc.nextInt();
			int gy = sc.nextInt();
			int p = sc.nextInt();
			int[][] dp = new int[gx + 1][gy + 1];
			int[][] st = new int[gx + 1][gy + 1]; // 通行可能:0 縦:1 横:-1 両方:2
			dp[0][0] = 1;
			for (int i = 0; i < p; i++) {
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				int dis1 = x1 * x1 + y1 * y1;
				int dis2 = x2 * x2 + y2 * y2;
				if (dis1 > dis2) {
					if (st[x2][y2] == 0) {
						st[x2][y2] = x1 == x2 ? 1 : -1;
					} else {
						st[x2][y2] = 2;
					}
				} else {
					if (st[x1][y1] == 0) {
						st[x1][y1] = x1 == x2 ? 1 : -1;
					} else {
						st[x1][y1] = 2;
					}
				}
			}
			for (int i = 0; i <= gx; i++) {
				for (int j = 0; j <= gy; j++) {
					if (i - 1 >= 0 && st[i - 1][j] != -1 && st[i - 1][j] != 2) {
						dp[i][j] += dp[i - 1][j];
					}
					if (j - 1 >= 0 && st[i][j - 1] != 1 && st[i][j - 1] != 2) {
						dp[i][j] += dp[i][j - 1];
					}
				}
			}
			System.out.println(dp[gx][gy] == 0 ? "Miserable Hokusai!"
					: dp[gx][gy]);
			n--;
		}
	}
}