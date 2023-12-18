
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, a, s, g;
	
	Scanner sc = new Scanner(System.in);
	void run() {
		
		for(;;) {
			n = sc.nextInt();
			a = sc.nextInt();
			s = sc.nextInt();
			g = sc.nextInt();
			if( (n|a|s|g) == 0 ) break;
			@SuppressWarnings("unchecked")
			LinkedList<Link>[] G = new LinkedList[n];
			for(int i=0;i<n;i++) G[i] = new LinkedList<Link>();
			for(int i=0;i<a;i++) {
				G[sc.nextInt()].add(new Link(sc.nextInt(), sc.next()));
			}
			System.out.println(dijkstra(G));
		}
	}
	
	String dijkstra(LinkedList<Link>[] G) {
		PriorityQueue<Link> que = new PriorityQueue<Link>(1, new MyComp());
		Link now = new Link(s, "");
		que.add(now);
		for(;!que.isEmpty();) {
			now = que.remove();
//			debug(now.s);
//			debug(now.l, now.visited);
			if( now.visited[now.l] ) break;
			if( now.l == g ) return now.s;
			now.visited[now.l] = true;
			for(Link l: G[now.l]) {
//				if(now.visited[l.l]) continue;
				Link next = new Link(now.s,now.visited, l);
				que.add(next);
			}
//			sc.next();
		}
		
		return "NO";
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
	
	class Link {
		int l;
		String s;
		boolean[] visited;
		
		Link (int l, String s) {
			this.l = l;
			this.s = s;
			visited = new boolean[n];
		}
		Link (String spel,boolean[] visited, Link l) {
			this.l = l.l;
			s = spel + l.s;
			this.visited = visited.clone();
		}
	}
	class MyComp implements Comparator<Link> {

		@Override
		public int compare(Link o1, Link o2) {
			// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
			return o1.s.compareTo(o2.s);
		}
		
	}
}