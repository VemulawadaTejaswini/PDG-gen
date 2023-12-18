import java.util.Scanner;

public class Main {

	private static int[][] map;
	private static int MAX = 1000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}
			int m = sc.nextInt();
			int s = sc.nextInt() - 1;
			int g1 = sc.nextInt() - 1;
			int g2 = sc.nextInt() - 1;

			map = new int[n][n];
			for (int i = 0; i < m; i++) {
				int b1 = sc.nextInt() - 1;
				int b2 = sc.nextInt() - 1;
				int cost = sc.nextInt();
				map[b1][b2] = cost;
			}

			WarshallFloyd();
			/*
			 * それぞれの基地について, 水源からのコストと目的地までのコストの合計値を出す。
			 * この時s->iという向きと、i->gという向きに注意する。
			 */
			int minCost = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				int cost = map[s][i] + map[i][g1] + map[i][g2];
				minCost = Math.min(minCost, cost);
			}
			System.out.println(minCost);
		}
	}

	static void WarshallFloyd() {
		// 任意の2点間の最小時間を入れる
		int n = map.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 0 && i != j) {
					map[i][j] = MAX;
				}
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
				}
			}
		}
	}

}