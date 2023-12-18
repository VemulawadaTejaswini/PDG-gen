import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int W, H;
	static int[][] map;
	static int[] DX = new int[] { 0, 1, 0, -1 };
	static int[] DY = new int[] { 1, 0, -1, 0 };

	public static void main(String[] args) {
		while (true) {
			W = sc.nextInt();
			if (W == 0) break;
			H = sc.nextInt();
			map = new int[H + 2][W + 2];
			for (int[] a : map) {
				Arrays.fill(a, 1);
			}
			int sy = 0;
			int sx = 0;
			int cy = 0;
			int cx = 0;
			int gy = 0;
			int gx = 0;
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					map[i + 1][j + 1] = sc.nextInt();
					if (map[i + 1][j + 1] == 2) {
						cy = i + 1;
						cx = j + 1;
						map[i + 1][j + 1] = 0;
					} else if (map[i + 1][j + 1] == 3) {
						gy = i + 1;
						gx = j + 1;
						map[i + 1][j + 1] = 0;
					} else if (map[i + 1][j + 1] == 4) {
						sy = i + 1;
						sx = j + 1;
						map[i + 1][j + 1] = 0;
					}
				}
			}
			boolean[][][] visited = new boolean[H + 2][W + 2][4];
			boolean[] cand = walk(sx, sy, cx, cy);
			ArrayList<State> cur = new ArrayList<State>();
			for (int i = 0; i < 4; ++i) {
				if (cand[i]) {
					visited[cy][cy][i] = true;
					cur.add(new State(cx, cy, i));
				}
			}
			int ans = Integer.MAX_VALUE;
			int t = 1;
			OUT: while (!cur.isEmpty()) {
				ArrayList<State> next = new ArrayList<State>();
				for (State st : cur) {
					int ncx = st.cx + DX[st.dir];
					int ncy = st.cy + DY[st.dir];
					if (ncx == gx && ncy == gy) {
						ans = t;
						break OUT;
					}
					cand = walk(st.cx, st.cy, ncx, ncy);
					for (int i = 0; i < 4; ++i) {
						if (cand[i] && !visited[ncy][ncx][i]) {
							visited[ncy][ncx][i] = true;
							next.add(new State(ncx, ncy, i));
						}
					}
				}
				cur = next;
				++t;
			}
			System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
		}
	}

	static boolean[] walk(int sx, int sy, int cx, int cy) {
		boolean[] ret = new boolean[4];
		boolean[][] visited = new boolean[H + 2][W + 2];
		dfs(sx, sy, cx, cy, ret, visited);
		return ret;
	}

	static void dfs(int sx, int sy, int cx, int cy, boolean[] ret, boolean[][] visited) {
		if (visited[sy][sx]) return;
		visited[sy][sx] = true;
		for (int i = 0; i < 4; ++i) {
			int nx = sx + DX[i];
			int ny = sy + DY[i];
			if (map[ny][nx] == 1) continue;
			if (nx == cx && ny == cy) {
				if (map[ny + DY[i]][nx + DX[i]] == 0) {
					ret[i] = true;
				}
			} else {
				dfs(nx, ny, cx, cy, ret, visited);
			}
		}
	}

	static class State {
		int cx, cy;
		int dir;

		State(int cx, int cy, int d) {
			this.cx = cx;
			this.cy = cy;
			this.dir = d;
		}
	}

}