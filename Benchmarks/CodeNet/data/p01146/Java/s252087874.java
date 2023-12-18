import java.util.Scanner;

public class Main {
	private static final int MAX = 100000;
	private static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int cityNum = sc.nextInt();// 街の数
			int lim = sc.nextInt();// 制限時間
			int freezerNum = sc.nextInt();// 冷凍庫の数
			int edgeNum = sc.nextInt();// 道の数
			int S = sc.nextInt();// スタート
			int G = sc.nextInt();// ゴール
			if (cityNum == 0) {
				sc.close();
				break;
			}

			boolean[] isFreezer = new boolean[cityNum];
			isFreezer[S] = isFreezer[G] = true;
			for (int i = 0; i < freezerNum; i++) {
				isFreezer[sc.nextInt()] = true;
			}

			map = new int[cityNum][cityNum];
			for (int i = 0; i < edgeNum; i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				int weight = sc.nextInt();
				map[from][to] = map[to][from] = weight;
			}

			// とりあえずワーシャルフロイト
			// ここでの目的は任意の2冷凍庫間の最小必要時間を出すこと
			WarshallFloyd();

			// 冷凍庫間で血液が死ぬ道は通れない
			for (int i = 0; i < cityNum; i++) {
				for (int j = 0; j < cityNum; j++) {
					if (!isFreezer[i] || !isFreezer[j] || map[i][j] > lim) {
						map[i][j] = MAX;
					}
				}
			}

			// 自明に通れない道を消し去ったので
			// スタートからゴールへの最短経路を求めるためにワーシャルフロイト
			WarshallFloyd();

			if (map[S][G] >= MAX) {
				System.out.println("Help!");
			} else if (map[S][G] < lim) {
				System.out.println(map[S][G]);
			} else {
				System.out.println(2 * map[S][G] - lim);
			}
		}
	}

	static void WarshallFloyd() {
		// 任意の2点間の最小時間を入れる
		int n = map.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 0) {
					map[i][j] = MAX;
				}
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i != j) {
						map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
					}
				}
			}
		}
	}
}