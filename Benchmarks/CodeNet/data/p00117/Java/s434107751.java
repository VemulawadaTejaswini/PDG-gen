import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		int INF = 1 << 28;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int fee[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(fee[i], INF);
			fee[i][i] = 0;
		}
		sc.useDelimiter(",|\\s+");
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			int d = sc.nextInt();
			fee[a][b] = c;
			fee[b][a] = d;
		}
		// }
		// 最終行は、x1, x2, y1, y2（整数;半角カンマ区切り）
		// x1：大工の出発する町の番号
		// x2：柱のある山里の番号
		// y1：殿様から大工が受け取ったお金
		// y2：柱の代金
		int x1 = sc.nextInt() - 1;
		int x2 = sc.nextInt() - 1;
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					fee[i][j] = Math.min(fee[i][j], fee[i][k] + fee[k][j]);
				}
			}
		}
		int ans = y1 - (y2 + fee[x1][x2] + fee[x2][x1]);
		System.out.println(ans);
	}
}