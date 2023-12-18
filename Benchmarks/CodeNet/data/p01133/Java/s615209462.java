
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] s, d;
	int[][] ps;
	int n;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			s = new int[2]; d = new int[2];
			s[0] = sc.nextInt(); s[1] = sc.nextInt();
			d[0] = sc.nextInt(); d[1] = sc.nextInt();
			if( (n|s[0]|s[1]|d[0]|d[1]) == 0 ) break;
			ps = new int[n][2];
			for(int i=0;i<n;i++) {
				ps[i][0] = sc.nextInt();
				ps[i][1] = sc.nextInt();
			}
			System.out.println((dijkstra()? "YES": "NO"));
		}
	}
	
	boolean dijkstra() {
		PriorityQueue<E> que = new PriorityQueue<E>();
		que.add(new E(new int[]{s[0], s[1]}, 0, 0));
		int[] mem = new int[1<<n];
		fill(mem, INF);
		mem[0] = 0;
		while(!que.isEmpty()) {
			E now = que.poll();
			if( now.S == (1<<n) - 1) return true;
			if(mem[now.S] != now.t) continue;
			for(int i=0;i<n;i++) if( ( (now.S>>i) & 1 )== 0 ) {
				int distp = abs(now.p[0]-ps[i][0]) + abs(now.p[1]-ps[i][1]);
				int distd = abs(d[0]-ps[i][0]) + abs(d[1]-ps[i][1]) - now.t;
				if( distp < distd && mem[now.S|(1<<i)] > distp + now.t ) {
					mem[now.S|(1<<i)] = distp + now.t;
					que.add(new E(ps[i], now.S|(1<<i), distp+now.t));
				}
			}
		}
		
		return false;
	}
	
	class E implements Comparable<E> {
		int[] p;
		int S, t;
		E(int[] p, int S, int t) {
			this.p = p.clone();
			this.S = S;
			this.t = t;
		}
		@Override
		public int compareTo(E o) {
			// TODO 自動生成されたメソッド・スタブ
			return t - o.t;
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}