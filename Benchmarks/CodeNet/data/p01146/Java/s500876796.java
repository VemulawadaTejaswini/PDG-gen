import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static final int INF = 100000000;
	static int N,M,L,K,A,H;
	static boolean[] HOS = new boolean[1000];
	static int[][] W = new int[1000][1000];
	static boolean read() {
		N = sc.nextInt();
		M = sc.nextInt();
		L = sc.nextInt();
		K = sc.nextInt();
		A = sc.nextInt();
		H = sc.nextInt();
		if (N == 0) return false;
		
		for (int i = 0; i < 100; i++) {
			fill(W[i], INF);
			W[i][i] = 0;
		}
		
		fill(HOS, false);
		for (int i = 0; i < L; i++) {
			int hos = sc.nextInt();
			HOS[hos] = true;
		}
		
		for (int i = 0; i < K; i++) {
			int X = sc.nextInt(), Y = sc.nextInt(), T = sc.nextInt();
			W[X][Y] = W[Y][X] = T;
		}
		
		return true;
	}

	static void solve() {
		PriorityQueue<State> que = new PriorityQueue<State>();
		que.add(new State(H, M, 0));
		int[][] time = new int[1000][1000]; // XÔ âÔ
		for (int i = 0; i < 100; i++) fill(time[i], INF);
		int ans = INF;
		while (!que.isEmpty()) {
			State s = que.poll();
			int cur = s.n, lim = s.t, t = s.c;
			if (time[cur][lim] != INF) continue;
			
			time[cur][lim] = t;
			
			if (cur == A) {
				ans = t;
				break;
			}	
			
			// ÄâÈµÉs®
			for (int i = 0; i < N; i++) {
				int from = cur, to = i;
				int lim2 = lim - W[from][to], nt = t + W[from][to];
				// s®ªÂ\Å êÎ
				if (lim2 >= 0 && time[to][lim2] == INF)
					que.add(new State(to, lim2, nt));
			}

			// Äâ{Ýª êÎ
			if (HOS[cur]) {
				// ÄâðÝé
				for (int i = lim + 1; i <= M; i++) {
					int to = cur, lim2 = i, nt = t + (lim2 - lim);
					if (nt < time[to][lim2] && time[to][lim2] == INF)
						que.add(new State(to, lim2, nt));
				}
			}
		}
		
		if (ans == INF) {
			System.out.println("Help!");
		} else {
			System.out.println(ans);
		}
	}	
}

class State implements Comparable<State> {
	int n, t, c; // XÔ âcÔ ©©Á½Ô
	State(int n, int t, int c) {
		this.n = n;
		this.t = t;
		this.c = c;
	}
	
	public int compareTo(State s) {
		return this.c - s.c;
	}
}