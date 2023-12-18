import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DX = { 1, 0, -1, 0 };
	static int[] DY = { 0, 1, 0, -1 };
	static int w, h;

	static void bfs(BitSet[] fill, int x, int y) {
		ArrayDeque<Point> q = new ArrayDeque<Point>();
		q.add(new Point(x, y));
		fill[y].set(x);
		while (!q.isEmpty()) {
			Point p = q.poll();
			for (int i = 0; i < 4; ++i) {
				int nx = p.x + DX[i];
				int ny = p.y + DY[i];
				if (nx < 0 || w <= nx || ny < 0 || h <= ny || fill[ny].get(nx)) continue;
				fill[ny].set(nx);
				q.add(new Point(nx, ny));
			}
		}
	}

	public static void main(String[] args) {
		while (true) {
			int W = sc.nextInt();
			int H = sc.nextInt();
			if (W == 0) break;
			int N = sc.nextInt();
			TreeSet<Integer> xset = new TreeSet<Integer>();
			TreeSet<Integer> yset = new TreeSet<Integer>();
			xset.add(0);
			xset.add(W);
			yset.add(0);
			yset.add(H);
			int[] x = new int[N * 2];
			int[] y = new int[N * 2];
			for (int i = 0; i < N * 2; ++i) {
				x[i] = sc.nextInt();
				xset.add(x[i]);
				y[i] = sc.nextInt();
				yset.add(y[i]);
			}
			w = xset.size() - 1;
			int[] xa = new int[w + 1];
			int p = 0;
			for (int xp : xset) {
				xa[p++] = xp;
			}
			h = yset.size() - 1;
			int[] ya = new int[h + 1];
			p = 0;
			for (int yp : yset) {
				ya[p++] = yp;
			}
			BitSet[] fill = new BitSet[h];
			for (int i = 0; i < h; ++i) {
				fill[i] = new BitSet(w);
			}
			for (int i = 0; i < N; ++i) {
				int x1 = Arrays.binarySearch(xa, x[2 * i]);
				int x2 = Arrays.binarySearch(xa, x[2 * i + 1]);
				int y1 = Arrays.binarySearch(ya, y[2 * i]);
				int y2 = Arrays.binarySearch(ya, y[2 * i + 1]);
				for (int j = y1; j < y2; ++j) {
					fill[j].set(x1, x2);
				}
			}
			int ans = 0;
			for (int i = 0; i < h; ++i) {
				for (int j = 0; j < w; ++j) {
					if (!fill[i].get(j)) {
						++ans;
						bfs(fill, j, i);
					}
				}
			}
			System.out.println(ans);
		}
	}

	static void print(BitSet[] fill) {
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				System.out.print(fill[i].get(j) ? "1" : "0");
			}
			System.out.println();
		}
	}

}