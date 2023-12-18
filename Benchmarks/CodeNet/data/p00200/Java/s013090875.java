import java.util.Scanner;

public class Main {
	static int n, m, k;
	static int[][] time, cost;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			time = new int[m + 1][m + 1];
			cost = new int[m + 1][m + 1];
			for (int i = 0; i <= m; i++) {
				for (int j = 0; j <= m; j++) {
					cost[i][j] = cost[j][i] = 999999;
					time[i][j] = time[j][i] = 999999;
				}
			}
			int x, y;
			for (int i = 0; i < n; i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				cost[x][y] = cost[y][x] = sc.nextInt();
				time[x][y] = time[y][x] = sc.nextInt();
			}
			initSolution();

			k = sc.nextInt();
			int start, end, condition;
			for (int i = 0; i < k; i++) {
				start = sc.nextInt();
				end = sc.nextInt();
				condition = sc.nextInt();
				if (condition == 0) {
					System.out.println(cost[start][end]);
				} else
					System.out.println(time[start][end]);
			}
		}

	}

	public static void initSolution() {
		for (int k = 1; k <= m; k++) {
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= m; j++) {
					if (time[i][j] > time[i][k] + time[j][k])
						time[i][j] = time[i][k] + time[j][k];
					if (cost[i][j] > cost[i][k] + cost[j][k])
						cost[i][j] = cost[i][k] + cost[j][k];
				}
			}
		}
	}
}

