import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int h, w;
	static int s[][];
	static Queue<Q> queue = new LinkedList<Q>();

	static class Q {
		int x, y;
		int k;

		Q(int x, int y, int k) {
			this.x = x;
			this.y = y;
			this.k = k;
		}
	}

	public static void f(int x, int y, int k) {
		if (x < 0 || w <= x || y < 0 || h <= y || s[y][x] != -1) {
			return ;
		}
		s[y][x] = k;
		queue.add(new Q(x + 1, y, k + 1));
		queue.add(new Q(x - 1, y, k + 1));
		queue.add(new Q(x, y + 1, k + 1));
		queue.add(new Q(x, y - 1, k + 1));

		while (!queue.isEmpty()) {
			Q q = queue.poll();
			f(q.x, q.y, q.k);
		}
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
					} else if (s[i][j] == '#') {
						s[i][j] = -2;
					} else if (s[i][j] == 'A') {
						sx = j;
						sy = i;
						s[i][j] = -1;
					} else if (s[i][j] == 'B') {
						gx = j;
						gy = i;
						s[i][j] = -1;
					}
				}
			}
			queue.clear();
			f(sx, sy, 0);

			String k = sc.next();
			int min = 1 << 29;
			int ansx = -1, ansy = -1;
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

			if (ansx < 0) {
				System.out.println("impossible");
			} else {
				System.out.println(min + " " + ansy + " " + ansx);
			}
		}
	}
}