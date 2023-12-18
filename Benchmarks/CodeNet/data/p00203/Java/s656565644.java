
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import scala.inline;
import scala.noinline;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			m = scanner.nextInt();
			n = scanner.nextInt();
			if ((m | n) == 0)
				break;
			map = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					map[i][j] = scanner.nextInt();
				}
			}
			count = 0;
			for (int i = 0; i < m; i++) {
				slove(i, 0, 0);
			}
			System.out.println(count);
		}
	}

	private void slove(int x, int y, int r) {
		if (y == n) {
			count++;
			return;
		}
		if (x < 0 || x == m)
			return;

		if (map[y][x] == 1)
			return;
		if (map[y][x] == 2 && r != 1)
			return;

		if (y == n - 1) {
			count++;
			return;
		}
		if (map[y][x] == 2)
			slove(x, y + 2, 1);
		else
			for (int i = 0; i < 3; i++) {
				slove(x + i - 1, y + 1, i);
			}
	}

	int count;
	int m;
	int n;
	int[][] map;
}