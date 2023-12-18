

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int R;
	static int C;
	static char[][] f;
	static boolean[][][][] visited;
	static LinkedList<State> q = new LinkedList<State>();
	static int[] dx = new int[] { 1, 0, -1, 0 };
	static int[] dy = new int[] { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		R = sc.nextInt();
		C = sc.nextInt();
		f = new char[R][C];
		for (int i = 0; i < R; ++i) {
			String line = sc.next();
			f[i] = line.toCharArray();
		}
		visited = new boolean[R][C][4][16];
		q.add(new State(0, 0, 0, 0));
		boolean stop = false;
		while (!q.isEmpty()) {
			State cur = q.poll();
//			System.out.println(cur.r + "," + cur.c + "," + cur.mem + "," + cur.dir);
			char cc = f[cur.r][cur.c];
			if (cc == '<') {
				update(new State(cur.r, cur.c, cur.mem, 2));
			} else if (cc == '>') {
				update(new State(cur.r, cur.c, cur.mem, 0));
			} else if (cc == '^') {
				update(new State(cur.r, cur.c, cur.mem, 3));
			} else if (cc == 'v') {
				update(new State(cur.r, cur.c, cur.mem, 1));
			} else if (cc == '_') {
				update(new State(cur.r, cur.c, cur.mem, cur.mem == 0 ? 0 : 2));
			} else if (cc == '|') {
				update(new State(cur.r, cur.c, cur.mem, cur.mem == 0 ? 1 : 3));
			} else if (cc == '?') {
				update(new State(cur.r, cur.c, cur.mem, 0));
				update(new State(cur.r, cur.c, cur.mem, 1));
				update(new State(cur.r, cur.c, cur.mem, 2));
				update(new State(cur.r, cur.c, cur.mem, 3));
			} else if (cc == '+') {
				update(new State(cur.r, cur.c, (cur.mem + 1) % 16, cur.dir));
			} else if (cc == '-') {
				update(new State(cur.r, cur.c, (cur.mem + 15) % 16, cur.dir));
			} else if (cc == '@') {
				stop = true;
				break;
			} else if ('0' <= cc && cc <= '9') {
				update(new State(cur.r, cur.c, cc - '0', cur.dir));
			} else if (cc == '.') {
				update(new State(cur.r, cur.c, cur.mem, cur.dir));
			}
		}
		System.out.println(stop ? "YES" : "NO");

	}

	static void update(State next) {
		if (visited[next.r][next.c][next.dir][next.mem]) {
			return;
		}
		visited[next.r][next.c][next.dir][next.mem] = true;
		next.r = (next.r + dy[next.dir] + R) % R;
		next.c = (next.c + dx[next.dir] + C) % C;
		q.add(next);
	}

	static class State {
		int r;
		int c;
		int mem;
		int dir;

		State(int r, int c, int mem, int dir) {
			this.r = r;
			this.c = c;
			this.mem = mem;
			this.dir = dir;
		}
	}

}