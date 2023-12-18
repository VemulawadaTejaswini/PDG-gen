
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matrix = new int[n+1][n+1];

		for (int i = 1; i <= n; i++) {
			int nodeF = sc.nextInt();
			int outBountCount = sc.nextInt();
			for (int j = 0; j < outBountCount; j++) {
				int nodeT = sc.nextInt();
				matrix[nodeF][nodeT] = 1;
			}
		}

		int[] v = new int[n+1];
		Arrays.fill(v, -1);
		v[1] = 0;

		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		v = SearchUtil.bfs(matrix, v, q);

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + v[i]);
		}
		sc.close();

	}

	static class SearchUtil {
		/**
		 * @param matrix グラフ
		 * @param v[] 訪問済リスト
		 *
		 * */
		public static int[] bfs(int[][] matrix, int[] v, ArrayDeque<Integer> q) {

			int from = q.poll();
			int count = v[from];
			for (int to = 1; to < matrix[from].length; to++) {
				if (matrix[from][to] == 1) {
					if (v[to] == -1 || count + 1 < v[to]) {
						q.add(to);
						v[to] = count + 1;
					}
				}
			}
			if (!q.isEmpty()) {
				SearchUtil.bfs(matrix, v, q);
			}

			return v;
		}
	}
}


