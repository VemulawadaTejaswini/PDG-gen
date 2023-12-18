
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			n = scanner.nextInt();
			Integer[] x1 = new Integer[n];
			Integer[] y1 = new Integer[n];
			Integer[] x2 = new Integer[n];
			Integer[] y2 = new Integer[n];
			for (int i = 0; i < n; i++) {
				x1[i] = scanner.nextInt();
				y1[i] = scanner.nextInt();
				x2[i] = scanner.nextInt();
				y2[i] = scanner.nextInt();
			}
			w = compress(x1, x2, w);
			h = compress(y1, y2, h);

			boolean[][] a = new boolean[h][w];
			for (int i = 0; i < n; i++) {
				for (int y = y1[i]; y < y2[i]; y++) {
					for (int x = x1[i]; x < x2[i]; x++) {
						a[y][x] = true;
					}
				}
			}
			int ans = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (a[i][j])
						continue;
					ans++;
					a[i][j] = true;
					Deque<Point> deque = new ArrayDeque<Point>();
					deque.push(new Point(j, i));
					while (!deque.isEmpty()) {
						Point p = deque.poll();
						for (int[] m : move) {
							int ny = p.y + m[0];
							int nx = p.x + m[1];
							if (!isOK(ny, nx))
								continue;
							if (a[ny][nx])
								continue;
							a[ny][nx] = true;
							deque.push(new Point(nx, ny));
						}
					}
				}
			}
			System.out.println(ans);
		}
	}

	private boolean isOK(int ny, int nx) {
		if (0 <= ny && ny < h && 0 <= nx && nx < w)
			return true;
		return false;
	}

	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	int h, w;
	int n;

	private int compress(Integer[] x1, Integer[] x2, int wh) {
		NavigableSet<Integer> set = new TreeSet<Integer>();
		set.add(0);
		set.add(wh);
		set.addAll(Arrays.asList(x1));
		set.addAll(Arrays.asList(x2));
		Integer[] x = set.toArray(new Integer[0]);
		for (int i = 0; i < n; i++) {
			x1[i] = Arrays.binarySearch(x, x1[i]);
			x2[i] = Arrays.binarySearch(x, x2[i]);
		}
		return x.length - 1;
	}
}