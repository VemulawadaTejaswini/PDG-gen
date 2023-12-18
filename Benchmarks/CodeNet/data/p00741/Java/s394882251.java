import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int W = sc.nextInt();
			if (W == 0) break;
			int H = sc.nextInt();
			boolean[][] f = new boolean[H + 2][W + 2];
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					f[i + 1][j + 1] = sc.nextInt() == 1;
				}
			}
			int ans = 0;
			for (int i = 1; i <= H; ++i) {
				for (int j = 1; j <= W; ++j) {
					if (f[i][j]) {
						fill(f, i, j);
						++ans;
					}
				}
			}
			System.out.println(ans);
		}
	}

	static void fill(boolean[][] f, int r, int c) {
		ArrayList<Point> ps = new ArrayList<Point>();
		ps.add(new Point(r, c));
		f[r][c] = false;
		while (!ps.isEmpty()) {
			ArrayList<Point> next = new ArrayList<Point>();
			for (Point p : ps) {
				for (int i = -1; i <= 1; ++i) {
					for (int j = -1; j <= 1; ++j) {
						int nr = p.x + i;
						int nc = p.y + j;
						if (f[nr][nc]) {
							f[nr][nc] = false;
							next.add(new Point(nr, nc));
						}
					}
				}
			}
			ps = next;
		}
	}

}