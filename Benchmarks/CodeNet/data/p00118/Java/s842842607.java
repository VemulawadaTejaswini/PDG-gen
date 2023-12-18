import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	int[][] orchard;
	boolean[][] checked;
	int h, w;
	int[] dx = {0, 0, 1, -1};
	int[] dy = {1, -1, 0, 0};
	
	void solve(int x, int y, int a) {
		checked[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int X = x+dx[i], Y = y+dy[i];
			if (X >= 0 && Y >= 0 && X < h && Y < w &&
					orchard[X][Y] == a && !checked[X][Y]) {
				solve(X, Y, a);
			}
		}
	}
	
	void run() {
		while (true) {
			h = sc.nextInt(); w = sc.nextInt();
			if (h == 0) break;
			orchard = new int[h][w];
			checked = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				String s = sc.next();
				for (int j = 0; j < w; j++) {
					switch(s.charAt(j)) {
					case '#':
						orchard[i][j] = 0; break;
					case '*':
						orchard[i][j] = 1; break;
					case '@':
						orchard[i][j] = 2; break;
					}
				}
			}
			
			int res = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!checked[i][j]) {
						res++;
						solve(i, j, orchard[i][j]);
					}
				}
			}
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}