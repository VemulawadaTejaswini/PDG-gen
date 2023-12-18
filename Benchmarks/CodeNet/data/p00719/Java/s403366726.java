
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n,m,p,f,t;
	int[][] map;
	int[] ticket;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			p = sc.nextInt();
			f = sc.nextInt()-1;
			t = sc.nextInt()-1;
			if( (n|m|p|(f+1)|(t+1)) == 0 ) break;
			ticket = new int[n];
			map = new int[m][m];
			for(int[] a: map) fill(a, INF);
			for(int i=0;i<n;i++) ticket[i] = sc.nextInt();
			for(int i=0;i<p;i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int c = sc.nextInt();
				map[a][b] = map[b][a] = c;
			}
			System.out.println(dijkstra());
		}
	}
	
	String dijkstra() {
		PriorityQueue<Node> que = new PriorityQueue<Node>(1, new MyComp());
		Node now = new Node(f);
		que.add(now);
		double[][] d = new double[m][1<<n];
		for(double[] a: d) fill(a, INF);
		d[f][1<<n-1] = 0;
		
		for(;!que.isEmpty();) {
//			debug(now.now, now.c, now.ticket);
//			debug(now.visited);
			now = que.remove();
			if( now.now == t ) return String.valueOf(now.c);
			for(int i=0;i<m;i++) {
				if(((now.visited>>i)&1 ) == 0 && map[now.now][i] != INF){
					for(int j=0;j<n;j++){
						if(((now.ticket>>j)&1) == 1 ) {
							double w = now.c + (double)map[now.now][i] / ticket[j];
							Node next = new Node(i, now.visited+(1<<i), now.ticket - (1<<j), w);
							if( d[i][now.ticket-(1<<j)] > w ) {
								d[i][now.ticket-(1<<j)] = w;
								que.add(next);
							}
						}
					}
				}	
			}
			
		}
		
		return "Impossible";
	}
	
	class Node implements Comparable<Node> {
		int now;
		double c;
		int visited;
		int ticket;
		Node(int now) {
			this.now = now;
			visited = 1<<now;
			ticket = (1 << n) - 1;
			c = 0;
		}
		
		Node(int now , int visited, int ticket, double c) {
			this.now = now;
			this.visited = visited;
			this.ticket = ticket;
			this.c = c;
		}

		@Override
		public int compareTo(Node o) {
			// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
			if(c-o.c > 0) return 1;
			else if( c -o.c < 0 ) return -1;
			return 0;
		}
		
		public boolean equals(Object o) {
			if( o instanceof Node ) {
				Node n = (Node)o;
				if( visited == n.visited && now == n.now && ticket == n.ticket ) return true;
			}
			return false;
		}
	}
	class MyComp implements Comparator<Node> {

		@Override
		public int compare(Node o1, Node o2) {
			// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
			int ret;
			if( o1.c > o2.c ) ret = 1;
			else if(o1.c < o2.c) ret = -1;
			else ret = 0;
			return ret;
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}