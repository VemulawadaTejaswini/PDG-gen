import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static int[][] cost = new int[101][101];
	static int[][] time = new int[101][101];
	
	public static void main(String args[]){
		while(true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0) break;
			for (int i = 0; i < m + 1; i++) {
				for (int j = 0; j < m + 1; j++) {
					cost[i][j] = time[i][j] = 1<<29;
				}
			}
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				cost[a][b] = cost[b][a] = sc.nextInt();
				time[a][b] = time[b][a] = sc.nextInt();
			}
			solve();
			int k = sc.nextInt();
			for (int i = 0; i < k; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				int r = sc.nextInt();
				if (r == 0) {
					System.out.println(cost[start][end]);
				} else {
					System.out.println(time[start][end]);
				}
			}
		}
	}
	
	static void solve(){
		for (int k = 0; k <= m; k++) {
			for (int i = 0; i <= m; i++) {
				for (int j = 0; j <= m; j++) {
					cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
					time[i][j] = Math.min(time[i][j], time[i][k] + time[k][j]);
				}
			}
		}
	}
}
