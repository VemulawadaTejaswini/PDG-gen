import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int INF = 1 << 28;
		int n = sc.nextInt();
		int[][] root = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(root[i], INF);
			root[i][i] = 0;
		}
		for (int i = 0; i < n; i++) {
			int r = sc.nextInt();
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				root[r][sc.nextInt()] = 1;
			}
		}
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					root[i][j] = Math.min(root[i][j], root[i][k] + root[k][j]);
				}
			}
		}
		int p = sc.nextInt();
		for (int i = 0; i < p; i++) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			int v = sc.nextInt();
			int dis = root[s][d];
			if (dis == INF) {
				System.out.println("NA");
			} else if (dis < v) {
				System.out.println(dis+1);
			} else {
				System.out.println("NA");
			}
		}
	}

}