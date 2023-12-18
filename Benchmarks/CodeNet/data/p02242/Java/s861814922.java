import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] G = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int v = sc.nextInt();
				G[u][v] = sc.nextInt();
			}
		}
		solve1(n, G);
	}
	
	public static void solve1(int n, int[][] G) {
		int[] dist = new int[n];
		int[] cand = new int[n];
		Arrays.fill(dist, -1);
		Arrays.fill(cand, Integer.MAX_VALUE);
		dist[0] = 0;
		
		int s = 0;
		int count = n;
		while(count > 0) {
			for (int i = 0; i < n; i++) {
				if (G[s][i] == 0)
					continue;
				cand[i] = Math.min(G[s][i] + dist[s], cand[i]);
			}
			
			int minI = s;
			int minD = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				if (dist[i] < 0 && cand[i] < minD) {
					minI = i;
					minD = cand[i];
				}
			}
			if (minI != s) {
				dist[minI] = minD;
				s = minI;
			}
			count--;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + dist[i]);
		}
	}
}