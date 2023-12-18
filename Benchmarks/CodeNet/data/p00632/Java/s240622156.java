import java.util.Scanner;

public class Main {
	static int h, w;
	static int s[][];

	public static void f(int x, int y, int k) {
		if (x < 0 || w <= x || y < 0 || h <= y || s[y][x] != -1) {
			return ;
		}
		s[y][x] = k;
		f(x + 1, y, k + 1);
		f(x - 1, y, k + 1);
		f(x, y + 1, k + 1);
		f(x, y - 1, k + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = 0, sy = 0;
		int gx = 0, gy = 0;

		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if ((h | w) == 0) {
				break;
			}

			s = new int[h][w];
			for (int i = 0; i < h; i++) {
				String str = sc.next();
				for (int j = 0; j < w; j++) {
					s[i][j] = str.charAt(j);
					if (s[i][j] == '.') {
						s[i][j] = -1;
					}
					if (s[i][j] == '#') {
						s[i][j] = -2;
					}
					if (s[i][j] == 'A') {
						sx = j;
						sy = i;
						s[i][j] = -1;
					}
					if (s[i][j] == 'B') {
						gx = j;
						gy = i;
						s[i][j] = -1;
					}
				}
			}
			f(sx, sy, 0);

			sc.nextLine();
			String k = sc.next();
			int min = 1 << 29;
			int ansx = 0, ansy = 0;
			for (int i = 0; i < 25; i++) {
				for (int j = 0; j < k.length(); j++) {
					if (0 <= s[gy][gx] && s[gy][gx] <= k.length() * i + j) {
						if (k.length() * i + j < min) {
							min = k.length() * i + j;
							ansx = gx;
							ansy = gy;
						}
					}
					if (k.charAt(j) == '2') {
						gy++;
						gy = Math.min(gy, h - 1);
					} else if (k.charAt(j) == '4') {
						gx--;
						gx = Math.max(gx, 0);
					} else if (k.charAt(j) == '6') {
						gx++;
						gx = Math.min(gx, w - 1);
					} else if (k.charAt(j) == '8') {
						gy--;
						gy = Math.max(gy, 0);
					}
				}
			}

			if (min == 1 << 29) {
				System.out.println("impossible");
			} else {
				System.out.println(min + " " + ansy + " " + ansx);
			}
		}
	}
}