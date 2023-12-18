
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long[][] map = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = i == j ? 0 : INF;
			}
		}
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			map[a][b] = c;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					map[j][k] = Math.min(map[j][k], map[j][i] + map[i][k]);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (map[i][i] < 0) {
				System.out.println("NEGATIVE CYCLE");
				return;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] >= INF/2)
					System.out.print("INF");
				else
					System.out.print(map[i][j]);
				System.out.print(j == n - 1 ? "\n" : ' ');
			}
		}

	}

	long INF = Long.MAX_VALUE / 2;

}