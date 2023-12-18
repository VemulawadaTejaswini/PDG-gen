
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n+1][n+1];

		// 初回訪問リスト
		int[] d = new int[n+1];
		Arrays.fill(d, -1);

		// 訪問完了リスト
		int[] f = new int[n+1];
		Arrays.fill(f, -1);

		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();			// 番号
			int k = sc.nextInt();			// uの出次数
			for (int j = 0; j < k; j++) {
				int v = sc.nextInt();
				mat[u][v] = 1;
			}
		}

		// 深さ優先探索（再帰）
		for (int index = 1; index <= n; index++) {
			dfs(mat, d, f, index);
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + d[i] + " " + f[i]);
		}
	}
	public static void dfs(int[][] mat, int[] d, int[] f, int index) {
		int from = index;
		if (d[from] != -1) {
			return;
		}
		d[from] = ++count;

		for (int to = 1; to < mat[from].length; to++) {
			if (mat[from][to] == 1 && d[to] == -1) {
				dfs(mat, d, f, to);
			}
		}
		f[from] = ++count;
	}

}


