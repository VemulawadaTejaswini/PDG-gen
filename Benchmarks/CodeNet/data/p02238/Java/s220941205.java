import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(new File("/workspace/AOJ/src/section12/sample2.txt"));
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] matrix = new int[n+1][n+1];
		for (int i = 0; i < n; i++) {
			int fromNode = in.nextInt();
			int outBoundCount = in.nextInt();
			for (int k = 0; k < outBoundCount; k++) {
				int toNode = in.nextInt();
				matrix[fromNode][toNode] = 1;
			}
		}

		for (int i = 1; i <= n; i++) {
			matrix[0][i] = 1;
		}

		int[][] v = new int[n + 1][2];
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		for (int i = 1; i <= n; i++) {
			Arrays.fill(v[i], -1);
		}

		SearchUtil.dfs(matrix, v, q, 0, 0);

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + v[i][0] + " " + v[i][1]);
		}
		in.close();
	}

	static class SearchUtil {
		/**
		 * @param matrix グラフ
		 * @param v[][] 訪問済リスト
		 * 			v[n][0]:初回訪問時
		 * 			v[n][1]:訪問完了時
		 * @param q 訪問スタック
		 *
		 * */
		public static int dfs(int[][] matrix, int[][] v, ArrayDeque<Integer> q, int count, int from) {

			for (int to = 1; to < matrix[from].length; to++) {
				if (matrix[from][to] == 1) {
					// 初回訪問の場合
					if (v[to][0] == -1) {
						v[to][0] = ++count;
						q.add(to);
						count = SearchUtil.dfs(matrix, v, q, count, to);
					// 訪問済の場合
					} else {
						continue;
					}
				}
			}
			// 抜けるときには行き先がない場合
			while (!q.isEmpty()) {
				from = q.removeLast();
				if (v[from][0] != -1 && v[from][1] == -1) {
					// 完了時
					v[from][1] = ++count;
				}
			}

			return count;
		}
	}

}

