
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int c,n,m;
	int map[][];
	int s, e;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			c = sc.nextInt();
			n = sc.nextInt();
			m = sc.nextInt();
			map = new int[n][n];
			for(int[] a: map) fill(a, INF);
			s = sc.nextInt()-1;
			e = sc.nextInt()-1;
			if( (c|n|m|(s+1)|(e+1)) == 0 ) break;
			for(int i=0;i<m;i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int f = sc.nextInt();
				map[a][b] = map[b][a] = f;
			}
			System.out.println(dijkstra());
		}
	}
	
	int dijkstra() {
		int[] d = new int[n];
		int[][] chiket = new int[n][c+1];
		boolean visited[] = new boolean[n];
		fill(d, INF);
		for(int[] a: chiket) fill(a, INF);
		chiket[s][0] = 0;
		d[s] = 0;
		for(;;) {
			int u=-1;
			int max = INF;
			for(int i=0;i<n;i++) {
				if( d[i] < max && !visited[i]) {
					u = i;
					max = d[i];
				}
			}
//			System.out.println(u);
			if(u == -1) break;
			for(int v=0;v<n;v++) {
				if( d[v] > d[u] + map[u][v] ) {
					d[v] = d[u] + map[u][v];
					for(int i=c;i>0;i--) {
						chiket[v][i] = min(chiket[v][i], chiket[u][i-1] + map[u][v]/2);
					}
					chiket[v][0] = chiket[u][0] + map[u][v];
				}
			}
			visited[u] = true;
		}
		int ans = INF;
		for(int i=0;i<=c;i++) ans = min(ans, chiket[e][i]);
		return ans;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}