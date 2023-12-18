import java.util.Scanner;

public class Main {
	static int[][] field;
	static int xg, yg;
	static int w, h;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			w = s.nextInt();
			h = s.nextInt();
			if (w == 0 && h == 0)
				break;

			field = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					field[i][j] = 0;
				}
			}

			int xs = s.nextInt();
			int ys = s.nextInt();
			xg = s.nextInt();
			yg = s.nextInt();

			int n = s.nextInt();
			for (int i = 0; i < n; i++) {
				int c = s.nextInt();
				int d = s.nextInt();
				int x = s.nextInt();
				int y = s.nextInt();

				if (d == 0)
					for (int k = x - 1; k < x + 3; k++)
						for (int j = y - 1; j < y + 1; j++)
							field[k][j] = c;
				if (d == 1)
					for (int k = x - 1; k < x + 1; k++)
						for (int j = y - 1; j < y + 3; j++)
							field[k][j] = c;

			}

			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					if (field[i][j] != field[ys - 1][xs - 1])
						field[i][j] = 0;
				}

			boolean b = false;
			if (field[ys - 1][xs - 1] > 0)
				b = search(xs, ys, field[ys - 1][xs - 1]);
			if (b)
				System.out.println("OK");
			else
				System.out.println("NG");
		}
		s.close();
	}

	static boolean search(int x, int y, int c) {
		field[y][x] = 0;
		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { -1, 0, 1, 0 };
		boolean b = false;
		if (x == xg - 1 && y == yg - 1)
			b = true;
		else {
			for (int i = 0; i < 4; i++) {
				if (x + dx[i] >= 0 && x + dx[i] < w && y + dy[i] >= 0
						&& y + dy[i] < h) {
					if (field[y + dy[i]][x + dx[i]] == c)
						b = search(x + dx[i], y + dy[i], c);
					if (b)
						break;
				}
			}
		}
		return b;
	}
}