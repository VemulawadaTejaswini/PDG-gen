
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
		
		for(;!que.isEmpty();) {
			now = que.remove();
//			debug(now.now, now.c, now.ticket);
//			debug(now.visited);
			if( now.now == t ) return String.valueOf(now.c);
			now.visited[now.now] = true;
			for(int i=0;i<m;i++) for(int j=0;j<n;j++){
				if(!now.visited[i] && ((now.ticket>>j)&1) == 1 && map[now.now][i] != INF) {
					Node next = new Node(i, now.visited, now.ticket - (1<<j), now.c + (double)map[now.now][i] / ticket[j]);
					que.add(next);
				}
			}
			
		}
		
		return "Impossible";
	}
	
	class Node {
		int now;
		double c;
		boolean[] visited;
		int ticket;
		Node(int now) {
			this.now = now;
			visited = new boolean[m];
			ticket = (1 << n) - 1;
			c = 0;
		}
		
		Node(int now , boolean[] visited, int ticket, double c) {
			this.now = now;
			this.visited = visited.clone();
			this.ticket = ticket;
			this.c = c;
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