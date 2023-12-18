import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static final int INF = 10000000;
	static int N, M, K;
	static int[] P = new int[200], Q  = new int[200], R  = new int[200];
	static int[][] cost = new int[101][101], time = new int[101][101];
	static boolean read() {
		N = sc.nextInt(); M = sc.nextInt();
		if (N == 0 && M == 0) return false;
		for (int i = 0; i < 101; i++) {
			fill(cost[i], INF);
			fill(time[i], INF);
			cost[i][i] = time[i][i] = 0;
		}
		
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt(), b  = sc.nextInt(), c  = sc.nextInt(), t = sc.nextInt();
			cost[a][b] = cost[b][a] = c;
			time[a][b] = time[b][a] = t;
		}
		
		K = sc.nextInt();
		for (int i = 0; i < K; i++) {
			P[i] = sc.nextInt();
			Q[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		
		return true;
	}

	static void solve() {
		for (int k = 1; k <= M; k++) { 
			for (int i = 1; i <= M; i++) {
				for (int j = 1; j <= M; j++) {
					time[i][j] = min(time[i][j], time[i][k] + time[k][j]);
					cost[i][j] = min(cost[i][j], cost[i][k] + cost[k][j]);
				}
			}
		}
		
		for (int i = 0; i < K; i++) {
			if (R[i] == 0) 
				System.out.println(cost[P[i]][Q[i]]);
			else 
				System.out.println(time[P[i]][Q[i]]);
		}
	}	
}