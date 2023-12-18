
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if (w == 0 && h == 0)
				break;
			int gy = -1;
			int gx = -1;
			boolean[][] map = new boolean[h + 2][w + 2];
			for (int i = 1; i <= h; i++) {
				char[] c = scanner.next().toCharArray();
				for (int j = 1; j <= w; j++) {
					if (c[j - 1] == '#') {
						map[i][j] = true;
					} else if (c[j - 1] == '&') {
						gy = i;
						gx = j;
					}
				}
			}
			int[][] dxy = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
			int[][] cnt = new int[h + 2][w + 2];
			
			for (int[] c : cnt) {
				Arrays.fill(c, 1 << 10);
			}
			cnt[0][0] = 0;
			Deque<List<Integer>> deque = new ArrayDeque<List<Integer>>();
			deque.offer(Arrays.asList(0, 0));
			while (!deque.isEmpty()) {
				List<Integer> list = deque.poll();
				int y = list.get(0);
				int x = list.get(1);
				for (int[] d : dxy) {
					int dy = y + d[0];
					int dx = x + d[1];
					if (0 <= dy && dy < h + 2 && 0 <= dx & dx < w + 2) {
						int r;
						if (map[y][x] && !map[dy][dx]) {
							r = 1;
						} else {
							r = 0;
						}
						if (cnt[dy][dx] > cnt[y][x] + r) {
							cnt[dy][dx] = cnt[y][x] + r;
							deque.offer(Arrays.asList(dy, dx));
						}
					}
				}
			}
			System.out.println(cnt[gy][gx]);
		}
	}
}