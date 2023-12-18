import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };
	static int H, W;

	public static void main(String[] arg) {
		while (true) {
			W = sc.nextInt();
			H = sc.nextInt();
			if (W == 0) break;
			char[][] m = new char[H][];
			for (int i = 0; i < H; ++i) {
				m[i] = sc.next().toCharArray();
			}
			int[][] st = new int[H][W];
			bfs('B', 1, m, st);
			bfs('W', 2, m, st);
			System.out.println(count(1, st) + " " + count(2, st));
		}
	}

	static int count(int v, int[][] st) {
		int c = 0;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (st[i][j] == v) ++c;
			}
		}
		return c;
	}

	static void bfs(char ch, int v, char[][] m, int[][] st) {
		Queue<Point> q = new ArrayDeque<Point>();
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (m[i][j] == ch) {
					q.add(new Point(i, j));
				}
			}
		}
		boolean[][] visited = new boolean[H][W];
		while (!q.isEmpty()) {
			Point p = q.poll();
			int r = p.x;
			int c = p.y;
			for (int i = 0; i < 4; ++i) {
				int nr = r + DR[i];
				int nc = c + DC[i];
				if (0 <= nr && nr < H && 0 <= nc && nc < W && !visited[nr][nc] && m[nr][nc] == '.') {
					q.add(new Point(nr, nc));
					visited[nr][nc] = true;
					st[nr][nc] |= v;
				}
			}
		}
	}

}