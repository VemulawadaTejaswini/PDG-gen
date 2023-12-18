import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		long mod = (long) 1e9 + 7;
		int h = sc.nextInt(), w = sc.nextInt();
		char[][] a = new char[h][w];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next().toCharArray();

		}
		long[][] dp = new long[h][w];
		dp[0][0] = 1;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == '#') {
					a[i][j] = 0;
				} else {
					if (i == 0 && j == 0) {
						continue;
					} else {
						if (i == 0) {
							dp[i][j] = dp[i][j - 1];

						} else if (j == 0) {
							dp[i][j] = dp[i - 1][j];

						} else {
							dp[i][j] = (dp[i - 1][j] % mod + dp[i][j - 1] % mod) % mod;
						}
					}
				}
			}
		}
		pw.println(dp[h - 1][w - 1]);
		pw.flush();

	}

}
