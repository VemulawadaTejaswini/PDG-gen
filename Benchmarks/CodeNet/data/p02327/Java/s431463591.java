import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] c = new int[h][w];
		int[][] cum = new int[h][w];
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				c[i][j] = sc.nextInt();
				if (c[i][j] == 0) {
					if (i != 0) {
						cum[i][j] += cum[i - 1][j];
					}
					cum[i][j]++;
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < h; ++i) {
			ArrayDeque<Integer> stack = new ArrayDeque<>();
			for (int j = 0; j < w; ++j) {
				ans = Math.max(ans, cum[i][j]);
				int d = j;
				while (!stack.isEmpty() && (c[i][j] == 1 || cum[i][stack.peekLast()] > cum[i][j])) {
					int idx = stack.pollLast();
					ans = Math.max(ans, cum[i][idx] * (j - idx));
					d = Math.min(d, idx);
				}
				if (c[i][j] == 1)
					continue;
				cum[i][d]=cum[i][j];
				stack.addLast(d);
			}
			while (!stack.isEmpty()) {
				int idx = stack.pollLast();
				ans = Math.max(ans, cum[i][idx] * (w - idx));
			}
		}
		System.out.println(ans);

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}