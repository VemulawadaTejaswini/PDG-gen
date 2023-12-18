import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int[] ref = new int[100];
		int[][] cost = new int[100][100];
		int[][] refc = new int[100][100];
		int[] dis = new int[100];
		boolean[] used = new boolean[100];
		int INF = Integer.MAX_VALUE/2;
		while (true) {
			int n = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt(), k = sc.nextInt(), a = sc.nextInt(), h = sc.nextInt();
			if (n == 0) break;
			ref[0] = a;
			ref[1] = h;
			for (int i = 2; i < l+2; i++)
				ref[i] = sc.nextInt();
			for (int i = 0; i < n; i++)
				Arrays.fill(cost[i], INF);
			for (int i = 0; i < k; i++) {
				int x = sc.nextInt(), y = sc.nextInt(), t = sc.nextInt();
				cost[x][y] = cost[y][x] = t;
			}
			
			for (int c = 0; c < n; c++)
				for (int i = 0; i < n; i++)
					for (int j = 0; j < n; j++)
						cost[i][j] = min(cost[i][j], cost[i][c] + cost[c][j]);
			
			for (int i = 0; i < l+2; i++) {
				for (int j = 0; j < l+2; j++) {
					refc[i][j] = (cost[ref[i]][ref[j]] > m) ? INF : cost[ref[i]][ref[j]];
				}
			}
			
			for (int i = 0; i < l+2; i++) {
				dis[i] = INF;
				used[i] = false;
			}
			dis[0] = 0;
			
			while (true) {
				int v = -1;
				for (int i = 0; i < l+2; i++) {
					if (!used[i] && (v == -1 || dis[i] < dis[v])) v = i;
				}
				if (v == -1) break;
				used[v] = true;
				
				for (int i = 0; i < l+2; i++) {
					dis[i] = min(dis[i], dis[v] + refc[v][i]);
				}
			}
			
			if (dis[1] == INF) out.println("Help!");
			else {
				out.println(dis[1]+max(0, dis[1]-m));
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}