import java.util.Scanner;


public class Main {
	public static int INF = 1 << 24;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int cost[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int tmp = stdIn.nextInt();
				if(i == j) {
					cost[i][j] = INF;
				}
				else {
					cost[i][j] = tmp;
				}
			}
		}
		int mincost[] = new int[n];
		boolean used[] = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			mincost[i] = INF;
			used[i] = false;
		}
		
		mincost[0] = 0;
		int res = 0;
		
		while(true) {
			int v = -1;
			for(int u = 0; u < n; u++) {
				if(!used[u] && (v == -1 || mincost[u] < mincost[v])) v = u;
			}
			
			if(v == -1) break;
			
			used[v] = true;
			res += mincost[v];
			
			for(int u = 0; u < n; u++) {
				mincost[u] = Math.min(mincost[u], cost[v][u]);
			}
		}
		int min = INF;
		for(int i = 0; i < n; i++) {
			if(min > cost[n-1][i]) min = cost[n-1][i];
		}
		res += min;
		System.out.println(res);
	}
	
}

 