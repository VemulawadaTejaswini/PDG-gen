
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int w, h;
	int[][] map;
	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			h = sc.nextInt(); w = sc.nextInt();
			if ((h|w) == 0) break;
			map = new int[h+10][w+10];
			for (int[] a: map) fill(a, 0);
			for (int i=0;i<h;i++) {
				String l = sc.next();
				for (int j=0;j<w;j++) {
					if (l.charAt(j) == '#') map[i+3][j+3] = 1;
					if (l.charAt(j) == '@') map[i+3][j+3] = 2;
					if (l.charAt(j) == '*') map[i+3][j+3] = 3;
				}
			}
			int cnt = 0;
			for (short i=0;i<h+10;i++) for (short j=0;j<w+10;j++) if (map[i][j] != 0) {
				dfs(j, i);
				cnt++;
			}
			System.out.println(cnt);
		}
	}

	int[] dx = {-1,0,1,0};
	int[] dy = {0,-1,0,1};
	void dfs(int x, int y) {
		int tmp = map[y][x];
		LinkedList<Integer> sx = new LinkedList<Integer>();
		LinkedList<Integer> sy = new LinkedList<Integer>();
		sx.add(x);sy.add(y);
		map[y][x] = 0;
		while (!sx.isEmpty()) {
			int cx = sx.removeLast(), cy = sy.removeLast();
			for (int i=0;i<4;i++) if (map[cy+dy[i]][cx+dx[i]] == tmp) {
				sx.add(cx + dx[i]); sy.add(cy + dy[i]);
				map[cy+dy[i]][cx+dx[i]] = 0;
			}
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}