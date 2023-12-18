import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static int N, M, R;
	static int[] Z = new int[1000];
	static int[][] WL = new int[201][201], WS = new int[201][201];
	static final int INF = 1 << 29;
	static boolean read() {
		N = sc.nextInt();
		M = sc.nextInt();
		if (N == 0 && M == 0) return false;
		
		for (int i = 0; i < 201; i++) {
			fill(WL[i], INF); 
			fill(WS[i], INF);
			WL[i][i] = WS[i][i] = 0;
		}
		
		for (int i = 0; i < M; i++) {
			int x, y, t;
			char sl;
			x = sc.nextInt();
			y = sc.nextInt();
			t = sc.nextInt();
			sl = sc.next().charAt(0);
			if (sl == 'S') {
				WS[x][y] = WS[y][x] = t;
			} else {
				WL[x][y] = WL[y][x] = t;
			}
		}
		
		R = sc.nextInt();
		for (int i = 0; i < R; i++) Z[i] = sc.nextInt();
		return true;
	}

	static int[][] dist = new int[1000][201];
	static void solve() {
		PriorityQueue<State> que = new PriorityQueue<State>();
		que.offer(new State(0, Z[0], 0));
		int ans = INF;
		for (int k = 1; k < 201; k++) {
			for (int i = 1; i < 201; i++) { 
				for (int j = 1; j < 201; j++) {
					WL[i][j] = min(WL[i][j], WL[i][k] + WL[k][j]);
					WS[i][j] = min(WS[i][j], WS[i][k] + WS[k][j]);
				}
			}
		}			
		
		for (int i = 0; i < 1000; i++) fill(dist[i], -1);
		while (!que.isEmpty()) {
			State s = que.poll();
			if (dist[s.cur][s.ship] != -1) continue;
			
			dist[s.cur][s.ship] = s.cost;
			
			if (s.cur == R - 1) {
				ans = s.cost;
				break;
			}
			
			int cur = s.cur, from = Z[s.cur], to = Z[s.cur + 1], cost = s.cost, ship = s.ship;
			// ツ猟、ツ路ツづーツ使ツつ、
			
			int ncost = cost + WL[from][to], nship = ship;
			if (dist[s.cur + 1][nship] == -1 && ncost < INF) 
				que.offer(new State(s.cur + 1, ship, cost + WL[from][to]));
			
			// ツ海ツ路ツづーツ使ツつ、
			for (int k = 1; k < 201; k++) {
				ncost = cost + WL[from][ship] + WS[ship][k] + WL[k][to];
				nship = k;
				if (dist[s.cur + 1][nship] == -1 && ncost < INF)
					que.offer(new State(s.cur + 1, nship, ncost));
			}
		}
		System.out.println(ans);
	}	
}

class State implements Comparable<State> {
	int cur, ship, cost;
	State (int cur, int ship, int cost) {
		this.cur = cur;
		this.ship = ship;
		this.cost = cost;
	}
	
	public int compareTo(State s) {
		return this.cost - s.cost;
	}
}