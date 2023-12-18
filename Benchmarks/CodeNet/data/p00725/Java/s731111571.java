import java.util.Scanner;

public class Main {
	private static int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt();
			if (w == 0) {
				sc.close();
				break;
			}

			int h = sc.nextInt();
			int[][] field = new int[h][w];
			int[] start = new int[2];
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					field[i][j] = sc.nextInt();
					if (field[i][j] == 2) {
						// スタート地点の座標を保存しとく
						start[0] = i;
						start[1] = j;
						field[i][j] = 0;
					}
				}
			}
			int dfs = dfs(0, start[0], start[1], field);
			if (dfs == Integer.MAX_VALUE) {
				System.out.println(-1);
			} else {
				System.out.println(dfs);
			}
		}
	}

	static int dfs(int hit, int x, int y, int[][] field) {
		int ans = Integer.MAX_VALUE;
		for (int d = 0; d < dir.length; d++) {
			int i = x;
			int j = y;

			i += dir[d][0];
			j += dir[d][1];

			if (i < 0 || i >= field.length || j < 0 || j >= field[i].length) {
				// フィールド外に出てしまった場合
				continue;
			} else if (field[i][j] == 1) {
				// すぐ隣が石の場合
				continue;
			}

			i -= dir[d][0];
			j -= dir[d][1];

			boolean next = true;
			while (true) {
				i += dir[d][0];
				j += dir[d][1];
				if (i < 0 || i >= field.length || j < 0 || j >= field[i].length) {
					// フィールド外に出てしまった場合
					next = false;
					break;
				}
				if (field[i][j] == 1) {
					// 障害物があった時
					break;
				} else if (field[i][j] == 3) {
					// ゴールだった時
					return hit + 1;
				}
			}

			if (next) {
				int[][] clone = new int[field.length][field[i].length];
				for (int k = 0; k < clone.length; k++) {
					for (int k2 = 0; k2 < clone[k].length; k2++) {
						clone[k][k2] = field[k][k2];
					}
				}

				clone[i][j] = 0;
				int hitdfs = dfs(hit + 1, i - dir[d][0], j - dir[d][1], clone);
				ans = Math.min(ans, hitdfs);
			}
		}

		return ans;

	}
}