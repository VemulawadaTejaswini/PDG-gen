import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class state implements Comparable<state> {
		int value;
		int pos;
		int omit;

		public int compareTo(state arg0) {
			return value - arg0.value;
		}

		state(int v, int p, int o) {
			value = v;
			pos = p;
			omit = o;
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int c = sc.nextInt();
			if ((n | m | c) == 0) {
				break;
			}

			int dp[][] = new int[n][n];

			int cost[][] = new int[n][n];

			for (int i = 0; i < n; i++) {
				Arrays.fill(cost[i], -1);
			}
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt() -1;
				int b = sc.nextInt()-1;
				cost[a][b] = sc.nextInt();
			}

			PriorityQueue<state> q = new PriorityQueue<state>();
			q.add(new state(0, 0, 0));

			boolean used[][] = new boolean[n][n];
			int ans[][] = new int[n][n];
			for (;;) {
				if (q.isEmpty()) {
					break;
				}
				state t = q.poll();
				if (used[t.pos][t.omit]) {
					continue;
				}
				used[t.pos][t.omit] = true;
				ans[t.pos][t.omit] = t.value;
				for (int i = 0; i < n; i++) {
					if (cost[t.pos][i] != -1) {
						if (!used[i][t.omit]) {
							q.add(new state(t.value + cost[t.pos][i], i,
									t.omit));
						}
						if (t.omit+1 < n) {
							if (!used[i][t.omit + 1]) {
								q.add(new state(t.value, i, t.omit + 1));
							}
						}
					}
				}
			}
			for(int i = 0 ; i< n ; i++){
				if(ans[n-1][i] <= c){
					System.out.println(i);
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}