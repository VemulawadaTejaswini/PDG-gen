
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
		int[][] chiket = new int[n][c+1];
		boolean visited[][] = new boolean[n][c+1];
		for(int[] a: chiket) fill(a, INF);
		chiket[s][0] = 0;
		for(;;) {
			int u=-1;
			int cc = -1;
			int max = INF;
			for(int i=0;i<n;i++) for(int j=0;j<=c;j++) {
				if( chiket[i][j] < max && !visited[i][j]) {
					u = i;
					cc = j;
					max = chiket[i][j];
				}
			}
//			System.out.println(u);
			if(u == -1) break;
			for(int v=0;v<n;v++) {
				if(cc + 1 <= c) chiket[v][cc+1] = min(chiket[v][cc+1], chiket[u][cc] + map[v][u]/2);
				chiket[v][cc] = min(chiket[v][cc], chiket[u][cc] + map[v][u]);
			}
			visited[u][cc] = true;
		}
		int ans = INF;
		for(int i=0;i<=c;i++) ans = min(ans, chiket[e][i]);
		return ans;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}