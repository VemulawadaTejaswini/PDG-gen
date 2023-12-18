
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, m, l;
	LinkedList<E>[] Edge;
	
	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			l = sc.nextInt();
			if( (n|m|l) == 0 ) break;
			
			Edge = new LinkedList[n];
			for(int i=0;i<n;i++) Edge[i] = new LinkedList<E>();
			
			for(int i=0;i<m;i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int d = sc.nextInt();
				int e = sc.nextInt();
				Edge[a].add(new E(b, d, e));
				Edge[b].add(new E(a, d, e));
			}
			
			System.out.println(solve());
		}
	}
	
	int solve() {
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		que.add(new Node(0, l, 0));
		int vis[][] = new int[n][l+1];
		for(int[] a: vis) fill(a, INF);
		vis[0][l] = 0;
		
		for(;;) {
			Node now = que.remove();
			if(now.n == n-1 ) return now.e;
			if( vis[now.n][now.l] != now.e ) continue;
			
			for(E e: Edge[now.n]) {
				que.add( new Node(e.t, now.l, now.e + e.e) );
				vis[e.t][now.l] = min(vis[e.t][now.l], now.e + e.e);
				if( now.l >= e.d ) {
					que.add( new Node(e.t, now.l-e.d, now.e) );
					vis[e.t][now.l-e.d] = min(vis[e.t][now.l-e.d], now.e);
				}
			}
		}
	}
	
	class Node implements Comparable<Node>{
		int n, l, e;
		
		Node(int n, int l, int e) {
			this.n = n;
			this.l = l;
			this.e = e;
		}
		
		@Override
		public int compareTo(Node o) {
			// TODO 自動生成されたメソッド・スタブ
			return e - o.e;
		}
	}
	
	class E {
		int t, d, e;
		E(int t, int d, int e) {
			this.t = t;
			this.d = d;
			this.e = e;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}