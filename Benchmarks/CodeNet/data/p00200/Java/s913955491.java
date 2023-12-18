
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int m;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			m = sc.nextInt();
			if( (n|m) == 0 ) break;
			
			int[][] time = new int[m][m];
			int[][] cost = new int[m][m];
			for(int[] a: time) fill(a, INF);
			for(int[] a: cost) fill(a, INF);
			
			for(int i=0;i<n;i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int c = sc.nextInt();
				int t = sc.nextInt();
				time[a][b] = time[b][a] = t;
				cost[a][b] = time[b][a] = c;
			}
			
			int k = sc.nextInt();
			for (int i = 0; i < k; i++) {
				int p = sc.nextInt()-1;
				int q = sc.nextInt()-1;
				int r = sc.nextInt();
				System.out.println(dijkstra(p, q, (r==0? cost: time)));
			}
		}
	}
	
	int dijkstra(int s, int g, int[][] map) {
		int[] d = new int[m];
		boolean[] visited = new boolean[m];
		
		fill(d, INF);
		d[s] = 0;
		
		for(;;) {
			int v = -1;
			for(int u=0;u<m;u++) if(!visited[u]){
				if(v == -1 || d[v] > d[u] ) v = u;
			}
			
			if( v == -1) break;
			if( v == g ) break;
			visited[v] = true;
			
			for (int u = 0; u < m; u++) {
				d[u] = min(d[u], d[v] + map[v][u]);
				
			}
		}
		
		return d[g];
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}