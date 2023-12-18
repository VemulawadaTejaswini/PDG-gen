import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in); 
	
	void run() {
		int[] t = new int[30];
		int[] time = new int[101];
		int[] c = new int[101];
		int[][] cost = new int[101][101];
		int[] dis = new int[101];
		boolean[] used = new boolean[101];
		int INF = Integer.MAX_VALUE/2;
		while (true) {
			int T = sc.nextInt();
			if (T == 0) break;
			for (int i = 0; i < T; i++)
				t[i] = sc.nextInt();
			int N = sc.nextInt();
			Arrays.fill(time, INF);
			int max = -1;
			for (int i = 0; i < N; i++) {
				int d = sc.nextInt(), m = sc.nextInt();
				time[d] = min(time[d],m);
				max = max(max, d);
			}
			
			I:for (int i = 1; i <= max; i++) {
				for (int j = i; j < i+T && j <= max; j++) {
					if (time[j] < t[j-i]) {
						c[i] = j-1;
						continue I;
					}
				}
				c[i] = (max <= i+T-1) ? max : i+T-1;
			}
			
			
			for (int i = 0; i < 101; i++)
				Arrays.fill(cost[i], INF);
			
			for (int i = 1; i < max; i++) {
				for (int j = i+1; j <= c[i]; j++) {
					cost[i][j] = 1;
				}
				if (c[i] != max) {
					if (c[i]-i == T-1) {
						cost[i][c[i]+1] = 0;
					} else {
						cost[i][c[i]+1] = 1;
					}
				}
			}
			
			Arrays.fill(dis, INF);
			Arrays.fill(used, false);
			dis[1] = 0;
			while (true) {
				int v = -1;
				for (int i = 1; i <= max; i++) {
					if (!used[i] && (v == -1 || dis[i] < dis[v])) v = i;
				}
				if (v == -1) break;
				used[v] = true;
				for (int i = 1; i <= max; i++) {
					dis[i] = min(dis[i], dis[v]+cost[v][i]);
				}
			}
			int res = INF;
			for (int i = 1; i <= max; i++) {
				if (c[i] == max)
					res = min(res, dis[i]);
			}
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}