import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = in.nextInt();
			}
		}

		Set<Integer> x = new HashSet<>();
		Set<Integer> y = new HashSet<>();
		for (int i = 1; i < n; i++) {
			y.add(i);
		}
		int totalCost = 0;
		boolean[] visit = new boolean[n];


		x.add(0);
		visit[0] = true;

		// yが空になるまで処理をする
		while (!y.isEmpty()) {
			int min = Integer.MAX_VALUE;
			int v = -1;
			for (Integer from : x) {
				for (int to = 0; to < n; to++) {
					if (mat[from][to] != -1 && !visit[to] && mat[from][to] < min) {
						min = mat[from][to];
						v = to;
					}
				}
			}
			visit[v] = true;
			x.add(v);
			y.remove(v);
			totalCost += min;
		}

		System.out.println(totalCost);

	}

}

