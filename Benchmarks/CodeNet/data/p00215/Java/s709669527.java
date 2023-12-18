
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	LinkedList<P>[] ps;
	P s, g;
	
	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			
			ps = new LinkedList[5];
			for(int i=0;i<5;i++) ps[i] = new LinkedList<P>();
			for(int i=0;i<h;i++) {
				String line = sc.next();
				for(int j=0;j<w;j++) {
					switch (line.charAt(j)){
					case 'S': s = new P(j, i, 0); break;
					case 'G': g = new P(j, i, 5); break;
					case '.': break;
					default : ps[line.charAt(j)-'1'].add(new P(j, i, line.charAt(j)-'1')); break;
					}
				}
			}
			int ans = INF;
			int id = -1;
			for(int i=0;i<5;i++) {
				int d = dijkstra(i);
				if( ans > d ) {
					ans = d;
					id = i;
				}
			}
			System.out.println((id==-1? "NA": ((id+1) + " " + ans))); 
		}
	}
	
	int dijkstra(int sn) {
		PriorityQueue<P> que = new PriorityQueue<P>();
		boolean[][] visited = new boolean[h][w];
		s.id = sn;
		s.d = 0;
		que.add(s);
		
		while(!que.isEmpty()) {
			P now = que.remove();
			if(visited[now.y][now.x]) continue;
			visited[now.y][now.x] = true;
//			debug(now.x, now.y, now.id+1, now.d);
			if( now.id == 5 ) return now.d;
			if(now.id == (sn+4)%5 ) {
				que.add(new P(g.x, g.y, g.id, now.d + dist(g, now)));
				continue;
			}
			for(P next: ps[(now.id+1)%5]) {
				que.add(new P(next.x, next.y, next.id, now.d + dist(next, now)));
			}
		}
		
		return INF;
	}
	
	int dist(P p, P q) {
		return abs(p.x-q.x) + abs(p.y-q.y);
	}
	
	class P implements Comparable<P>{
		int x, y, id, d;
		P(int x, int y, int id) {
			this.x = x;
			this.y = y;
			this.id = id;
		}
		
		P(int x, int y, int id, int d) {
			this.x = x;
			this.y = y;
			this.id = id;
			this.d = d;
		}

		@Override
		public int compareTo(P o) {
			// TODO 自動生成されたメソッド・スタブ
			return d - o.d;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}