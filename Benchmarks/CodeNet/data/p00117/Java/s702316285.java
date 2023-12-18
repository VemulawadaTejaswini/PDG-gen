
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, m;
	LinkedList<E>[] edges;
	
	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		edges = new LinkedList[n];
		for(int i=0;i<n;i++) edges[i] = new LinkedList<E>();
		
		for(int i=0;i<m;i++) {
			String[] strs = sc.next().split(",");
			int[] vals = new int[4];
			
			for (int j = 0; j < 4; j++) {
				vals[j] = Integer.parseInt(strs[j]);
			}
			
			edges[vals[0]-1].add(new E(vals[1]-1, vals[2]));
			edges[vals[1]-1].add(new E(vals[0]-1, vals[3]));
		}
		
		String[] strs = sc.next().split(",");
		int[] vals = new int[4];
		
		for (int j = 0; j < 4; j++) {
			vals[j] = Integer.parseInt(strs[j]);
		}
		int val = dijkstra(vals[0]-1, vals[1]-1) + dijkstra(vals[1]-1, vals[0]-1);
		System.out.println( (vals[2] - vals[3] - val) );
	}
	
	int dijkstra(int s, int g) {
		int d[] = new int[n];
		fill(d, INF);
		d[s] = 0;
		PriorityQueue<E> que = new PriorityQueue<E>();
		que.add(new E(s, 0));
		
		for(;;) {
			E now = que.poll();
			
			if(now.to == g) return now.cost;
			if(now.cost != d[now.to]) continue;
			for(E edge: edges[now.to] ) if( d[edge.to] > d[now.to] + edge.cost ){
				que.add(new E(edge.to, d[now.to]+edge.cost));
				d[edge.to] = d[now.to]+edge.cost;
			}
		}
	}
	
	class E implements Comparable<E>{
		int to, cost;
		E(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
		@Override
		public int compareTo(E o) {
			// TODO 自動生成されたメソッド・スタブ
			return cost - o.cost;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}