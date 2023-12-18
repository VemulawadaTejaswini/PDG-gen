
import java.util.Scanner;

public class Main {

	final int INF = 1 << 29;

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int [][] cost = new int[n][n];
			int [] mincost = new int[n];
			boolean [] used = new boolean[n];
			for(int i =0 ; i < n ;i++){
				for(int j = 0; j < n; j++){
					if(i == j){
						cost[i][j] = 0;
					}
					else{
						cost[i][j] = INF;
					}
				}
			}

			for(int i = 0; i < m; i++){
				int from = sc.nextInt();
				int to = sc.nextInt();
				int value = sc.nextInt();
				cost[from][to] = value;
				cost[to][from] = value;
			}

			for(int i= 0; i < n; ++i){
				mincost[i] = INF;
				used[i] = false;
			}

			mincost[0] = 0;
			int res = 0;

			while(true){
				int v = -1;

				for(int u = 0; u < n; u++){
					if(! used[u] && (v == -1 || mincost[u] < mincost[v])){
						v = u;
					}

				}

				if(v == -1) break;
				used[v] = true;
				res += mincost[v];

				for(int u = 0; u < n; u++){
					mincost[u] = Math.min(mincost[u], cost[v][u]);
				}
			}
			System.out.println(res);

		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();

	}

}