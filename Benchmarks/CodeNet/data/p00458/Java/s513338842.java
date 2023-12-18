
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	boolean[][] map;
	int cnt;
	int max;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if( (w|h) == 0 ) break;
			map = new boolean[h+2][w+2];
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++)
				map[i][j] = sc.nextInt() == 1;
			max = 0;
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				cnt = 0;
				if(map[i][j]) dfs(i, j);
			}
			System.out.println(max);
		}
	}
	int dx[] = {-1, 0, 1, 0};
	int dy[] = {0, -1, 0, 1};
	void dfs(int x, int y) {
		cnt++;
		max = max(cnt, max);
		map[x][y] = false;
		for(int i=0;i<4;i++) {
			if(map[ x+dx[i] ][y+dy[i]]) dfs(x+dx[i], y+dy[i]);
		}
		map[x][y] = true;
		cnt--;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}