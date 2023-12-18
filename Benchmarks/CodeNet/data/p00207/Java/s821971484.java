
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			int xs = scanner.nextInt();
			int ys = scanner.nextInt();
			xg = scanner.nextInt();
			yg = scanner.nextInt();
			int n = scanner.nextInt();
			map = new int[h + 2][w + 2];

			for (int i = 0; i < n; i++) {
				int c = scanner.nextInt();
				int d = scanner.nextInt();
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				if (d == 0) {
					for (int j = 0; j < 2; j++) {
						for (int k = 0; k < 4; k++) {
							map[j + y][k + x] = c;

						}
					}
				} else {
					for (int j = 0; j < 4; j++) {
						for (int k = 0; k < 2; k++) {
							map[j + y][k + x] = c;
						}
					}
				}
			}
			color = map[ys][xs];
			b = new boolean[h + 2][w + 2];
			if (color == 0)
				System.out.println("NG");
			else
				System.out.println(slove(xs, ys) ? "OK" : "NG");
		}

	}

	private boolean slove(int x, int y) {
		b[y][x] = true;
		if (map[y][x] != color)
			return false;
		if (y == yg && x == xg)
			return true;
		for (int[] a : dxy) {
			int dx = a[1] + x;
			int dy = a[0] + y;
			if (b[dy][dx])
				continue;
			if (slove(dx, dy))
				return true;
		}
		return false;
	}

	int[][] dxy = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	boolean[][] b;
	int[][] map;
	int xg;
	int yg;
	int color;
}