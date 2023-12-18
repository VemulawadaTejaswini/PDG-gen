import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int w, h;
	static int a[][];
	static int m[][];
	static int sx, sy;
	static int ans;

	public static void markh(int x, int y, int mark) {
		if (x < 0 || w <= x || y < 0 || h <= y || a[y][x] == '#') {
			return ;
		}
		if (0 <= m[y][x]) {
			if (x != sx || y != sy) {
				return ;
			}
		}
		m[y][x] = mark;
		markh(x + 1, y, mark);
		markh(x - 1, y, mark);
		markh(x, y + 1, mark);
		markh(x, y - 1, mark);
	}

	public static void markl (int x, int y, int mark) {
		if (x < 0 || w <= x || y < 0 || h <= y || a[y][x] == '.' || 0 <= m[y][x]) {
			return ;
		}
		m[y][x] = mark;
		markl(x + 1, y, mark);
		markl(x - 1, y, mark);
		markl(x, y + 1, mark);
		markl(x, y - 1, mark);
	}

	public static boolean check() {
		for (int i = 0; i < h; i++) {
			if (0 <= m[i][0]) {
				ans = m[i][0];
				return true;
			}
			if (0 <= m[i][w - 1]) {
				ans = m[i][w - 1];
				return true;
			}
		}
		for (int j = 0; j < w; j++) {
			if (0 <= m[0][j]) {
				ans = m[0][j];
				return true;
			}
			if (0 <= m[h - 1][j]) {
				ans = m[h - 1][j];
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}
			a = new int[h][w];
			m = new int[h][w];
			for (int i = 0; i < h; i++) {
				Arrays.fill(m[i], -1);
			}
			for (int i = 0; i < h; i++) {
				String s = sc.next();
				for (int j = 0; j < w; j++) {
					a[i][j] = s.charAt(j);
					if (a[i][j] == '&') {
						m[i][j] = 0;
						sx = j;
						sy = i;
					}
				}
			}
			markh(sx, sy, 0);

			while (!check()) {
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if (0 <= m[i][j] && a[i][j] != '#') {
							markl(j + 1, i, m[i][j] + 1);
							markl(j - 1, i, m[i][j] + 1);
							markl(j, i + 1, m[i][j] + 1);
							markl(j, i - 1, m[i][j] + 1);
						}
					}
				}
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if (0 <= m[i][j] && a[i][j] != '.') {
							markh(j + 1, i, m[i][j]);
							markh(j - 1, i, m[i][j]);
							markh(j, i + 1, m[i][j]);
							markh(j, i - 1, m[i][j]);
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}