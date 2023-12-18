import java.util.Arrays;
import java.util.Scanner;

//AtCoder Grand Contest 043
//A	Range Flip Find Route
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		char[][] g = new char[H][];
		for (int i = 0; i < H; i++) {
			g[i] = sc.next().toCharArray();
		}
		sc.close();

		int dp[][] = new int[H][W];
		for (int i = 0; i < H; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE);
		}

		if (g[0][0] == '#') {
			dp[0][0] = 1;
		} else {
			dp[0][0] = 0;
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (i+1 < H) {
					int change = 0;
					if (g[i][j] == '.' && g[i+1][j] == '#' ) {
						change = 1;
					}
					dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j] + change);
				}
				if (j+1 < W) {
					int change = 0;
					if (g[i][j] == '.' && g[i][j+1] == '#') {
						change = 1;
					}
					dp[i][j+1] = Math.min(dp[i][j+1], dp[i][j] + change);
				}
			}
		}
		System.out.println(dp[H-1][W-1]);
	}
}
