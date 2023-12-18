import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Brave Force Story
 */
public class Main {

	static final int MAX = 60;
	static final int[] H = new int[]{1, 1, 0, -1, -1, 0};
	static final int[] V = new int[]{1, 0, -1, -1, 0, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int t, n;
			t = parseInt(line.substring(0, line.indexOf(' ')));
			n = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((t | n) == 0) break;

			boolean[][][] obs = new boolean[4][31][31];
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int x, y;
				int[] q;
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));
				q = quadrant(x, y);
				obs[q[0]][q[1]][q[2]] = true;
			}

			line = br.readLine();
			int sx, sy;
			int[] sq;
			sx = parseInt(line.substring(0, line.indexOf(' ')));
			sy = parseInt(line.substring(line.indexOf(' ') + 1));
			sq = quadrant(sx, sy);

			Deque<int[]> queue = new ArrayDeque<>();
			int count = 0;

			queue.offer(new int[]{0, sq[0], sq[1], sq[2]});
			obs[sq[0]][sq[1]][sq[2]] = true;
			count++;

			while (!queue.isEmpty()) {
				int[] pq = queue.poll();
				int[] p = dequadrant(pq[1], pq[2], pq[3]);
				for (int i = 0; i < H.length; i++) {
					int nx, ny;
					int[] nq;
					nx = p[0] + H[i];
					ny = p[1] + V[i];
					nq = quadrant(nx, ny);
					if (pq[0] < t && Math.abs(nx) <= MAX && ny <= MAX && !obs[nq[0]][nq[1]][nq[2]]) {
						queue.offer(new int[]{pq[0] + 1, nq[0], nq[1], nq[2]});
						obs[nq[0]][nq[1]][nq[2]] = true;
						count++;
					}
				}
			}
			System.out.println(count);
		}//end while
	}//end main

	//quadrant I:    x >= 0, y >= 0
	//quadrant II:   x <  0, y >= 0
	//quadrant III:  x <  0, y <  0
	//quadrant IV:   x >= 0, y <  0
	static int[] quadrant(int x, int y) {
		int o = 0;
		if (0 <= x && 0 <= y) {
			o = 0;
		} else if (x < 0 && 0 <= y) {
			o = 1;
		} else if (x < 0 && y < 0) {
			o = 2;
		} else {
			o = 3;
		}
		x = Math.abs(x);
		y = Math.abs(y);
		return new int[]{o, x, y};
	}

	static int[] dequadrant(int o, int x, int y) {
		if (o == 1) {
			x = -x;
		} else if (o == 2) {
			x = -x;
			y = -y;
		} else if (o == 3) {
			y = -y;
		}
		return new int[]{x, y};
	}

	class Point {
		int x, y;
		int o, ox, oy;

		Point(int x, int y) {
			if (0 <= x && 0 <= y) {
				o = 0;
			} else if (x < 0 && 0 <= y) {
				o = 1;
			} else if (x < 0 && y < 0) {
				o = 2;
			} else {
				o = 3;
			}
			ox = Math.abs(x);
			oy = Math.abs(y);
		}

		Point(int o, int ox, int oy) {
			if (o == 1) {
				x = -x;
			} else if (o == 2) {
				x = -x;
				y = -y;
			} else if (o == 3) {
				y = -y;
			}
		}
	}
}