import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DX = { 0, 1, 1, 0, -1, -1, 0 };
	static int[] DY = { 1, 0, -1, -1, -1, 0, 0 };

	public static void main(String[] arg) {
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int gx = sc.nextInt();
		int gy = sc.nextInt();
		int N = sc.nextInt();
		int[] ox = new int[N];
		int[] oy = new int[N];
		for (int i = 0; i < N; ++i) {
			ox[i] = sc.nextInt();
			oy[i] = sc.nextInt();
		}
		int LX = sc.nextInt();
		int LY = sc.nextInt();
		sx += LX;
		sy += LY;
		gx += LX;
		gy += LY;
		boolean[][] obst = new boolean[2 * LX + 1][2 * LY + 1];
		for (int i = 0; i < N; ++i) {
			obst[ox[i] + LX][oy[i] + LY] = true;
		}
		final int INF = 1 << 30;
		int[][] dist = new int[2 * LX + 1][2 * LY + 1];
		for (int[] a : dist) {
			Arrays.fill(a, INF);
		}
		dist[gx][gy] = 0;
		{
			ArrayList<Point> cur = new ArrayList<Point>();
			cur.add(new Point(gx, gy));
			for (int t = 0;; ++t) {
				if (cur.isEmpty()) {
					System.out.println(-1);
					return;
				}
				ArrayList<Point> next = new ArrayList<Point>();
				for (Point p : cur) {
					for (int i = 0; i < 6; ++i) {
						int nx = p.x + DX[i];
						int ny = p.y + DY[i];
						if (i % 3 != 0 && p.x % 2 != 0) ny++;
						if (0 <= nx && nx <= 2 * LX && 0 <= ny && ny <= 2 * LY && !obst[nx][ny] && dist[nx][ny] == INF) {
							dist[nx][ny] = t + 1;
							next.add(new Point(nx, ny));
						}
					}
				}
				if (dist[sx][sy] != INF) {
					break;
				}
				cur = next;
			}
		}

		boolean[][][] visited = new boolean[6][2 * LX + 1][2 * LY + 1];
		PriorityQueue<State> q = new PriorityQueue<State>();
		q.add(new State(0, sx, sy, 0));
		while (true) {
			State cur = q.poll();
			int x = cur.x;
			int y = cur.y;
			int t = cur.t;
			if (visited[t][x][y]) continue;
			visited[t][x][y] = true;
			if (x == gx && y == gy) {
				System.out.println(cur.d);
				return;
			}
			int d = Math.abs((x - LX) * (y - LY) * t) % 6;
			int nt = t == 5 ? 0 : t + 1;
			for (int k = 0; k < 7; ++k) {
				int add = k == d ? 0 : 1;
				int nx = x + DX[k];
				int ny = y + DY[k];
				if (k % 3 != 0 && x % 2 != 0) ny++;
				if (0 <= nx && nx <= 2 * LX && 0 <= ny && ny <= 2 * LY && !obst[nx][ny]) {
					q.add(new State(cur.d + add, nx, ny, nt));
				}
			}
		}
	}

	static class State implements Comparable<State> {
		int d, x, y, t;

		public State(int d, int x, int y, int t) {
			this.d = d;
			this.x = x;
			this.y = y;
			this.t = t;
		}

		public int compareTo(State o) {
			return this.d - o.d;
		}
	}

}