import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new A();
	}

	int w, h;
	int[][] c;

	Main() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();

			if (w == 0 && h == 0)
				break;

			c = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					c[i][j] = sc.nextInt();
				}
			}

			int ans = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (f(i, j))
						ans++;
				}
			}
			System.out.println(ans);
		}
	}

	boolean f(int x, int y) {
		try {
			if (c[y][x] == 0) {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

		int dx[] = { -1, -1, 0, 1, 1, 1, 0, -1, };
		int dy[] = { 0, -1, -1, -1, 0, 1, 1, 1, };

		c[y][x] = 0;

		for (int i = 0; i < 8; i++) {
			f(x + dx[i], y + dy[i]);
		}
		return true;
	}

}