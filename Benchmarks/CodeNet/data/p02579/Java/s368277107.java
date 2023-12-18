import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int sh = sc.nextInt() - 1;
		int sw = sc.nextInt() - 1;
		int th = sc.nextInt() - 1;
		int tw = sc.nextInt() - 1;
		char[][] map = new char[H][];
		for (int i = 0; i < H; i++) {
			map[i] = sc.next().toCharArray();
		}
		int[][] d = new int[H][W];
		for (int i = 0; i < H; i++) {
			Arrays.fill(d[i], 1 << 25);
		}
		PriorityQueue<int[]> Q = new PriorityQueue<>(1000, (a, b) -> a[2] - b[2]);
		Q.add(new int[] {sh, sw, 0});
		d[sh][sw] = 0;
		int[] dx = new int[] {1, 0, -1, 0};
		int[] dy = new int[] {0, 1, 0, -1};
		while (!Q.isEmpty()) {
			int x = Q.peek()[0];
			int y = Q.poll()[1];
			if (x == th && y == tw) {
				System.out.println(d[x][y]);
				return;
			}
			for (int i = 0; i < 4; i++) {
				if (x + dx[i] < 0 || x + dx[i] >= H || y + dy[i] < 0 || y + dy[i] >= W || map[x + dx[i]][y + dy[i]] == '#') continue;
				if (d[x][y] < d[x + dx[i]][y + dy[i]]) {
					Q.add(new int[] {x + dx[i], y + dy[i], d[x][y]});
					d[x + dx[i]][y + dy[i]] = d[x][y];
				}
			}
			for (int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					if (x + i < 0 || x + i >= H || y + j < 0 || y + j >= W || map[x + i][y + j] == '#') continue;
					if (d[x][y] + 1 < d[x + i][y + j]) {
						Q.add(new int[] {x + i, y + j, d[x][y] + 1});
						d[x + i][y + j] = d[x][y] + 1;
					}
				}
			}
		}
		System.out.println(-1);
	}
}