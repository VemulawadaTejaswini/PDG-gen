
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

			if ((h|w) == 0) break;
			map = new int[h+2][w+2];
			for (int i=0;i<h;i++) {
				String l = sc.next();
				for (int j=0;j<w;j++) {
					if (l.charAt(j) == '#') map[i+1][j+1] = 1;
					if (l.charAt(j) == '@') map[i+1][j+1] = 2;
					if (l.charAt(j) == '*') map[i+1][j+1] = 3;
				}
			}
			int cnt = 0;
			for (int i=1;i<=h;i++) for (int j=1;j<=w;j++) if (map[i][j] != 0) {
				int c = map[i][j];
				dfs(j, i, c);
				cnt++;
			}
			System.out.println(cnt);
		}
	}
	
	int[] dx = {-1,0,1,0};
	int[] dy = {0,-1,0,1};
	void dfs(int x, int y, int c) {
		map[y][x] = 0;
		for (int i=0;i<4;i++) if (map[y+dy[i]][x+dx[i]] == c)
			dfs(x+dx[i], y+dy[i], c);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}