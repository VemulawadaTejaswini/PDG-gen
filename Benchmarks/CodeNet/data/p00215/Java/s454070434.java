
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[][] map;
	P s, g;
	int w, h, node;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			@SuppressWarnings("unchecked")
			LinkedList<P>[] d = new LinkedList[5];
			for(int i=0;i<5;i++) d[i] = new LinkedList<P>();
			
			node = 0;
			for(int i=0;i<h;i++) {
				String str = sc.next();
				for(int j=0;j<str.length();j++) {
					switch(str.charAt(j)) {
					case 'S': s = new P(j, i, node); break;
					case 'G': g = new P(j, i, node); break;
					case '.': continue;
					default : d[str.charAt(j)-'1'].add(new P(j, i, node));
					}
					node++;
				}
			}
			map = new int[node][node];
			for(int[] a: map) fill(a, INF);
			for(LinkedList<P> list: d) {
				for(P p: list) {
					map[s.ind][p.ind] = abs(s.x-p.x) + abs(s.y-p.y);
					map[p.ind][g.ind] = abs(p.x-g.x) + abs(p.y-g.y);
				}
			}
			for(int i=0;i<5;i++) {
				for(P p1: d[i]) for(P p2: d[(i+1)%5]) {
					map[p1.ind][p2.ind] = abs(p1.x-p2.x) + abs(p1.y-p2.y);
				}
			}
			int min = dijkstra();
			if(min == INF) System.out.println("NA");
			else {
				int p = g.ind;
				while(visit[p] != s.ind) {
					p = visit[p];
				}
				for(int i=0;i<5;i++) {
					boolean f = false;
					for(P p1: d[i]) {
						if(p1.ind == p) {
							f = true;
							break;
						}
					}
					if(f) {
						System.out.println(i + " " +  min);
						break;
					}
				}
			}
		}
	}
	int visit[];
	int dijkstra() {
		int[] d = new int[node];
		boolean visited[] = new boolean[node];
		visit = new int[node];
		fill(visited, false);
		fill(d, INF);
		d[s.ind] = 0;
		for(;;) {
			int v = -1;
			int min = INF;
			for(int i=0;i<node;i++) {
				if( min > d[i] && !visited[i] ) {
					v = i;
					min = d[i];
				}
			}
			if(v < 0) break;
			if(v == g.ind) break;
			visited[v] = true;
			for(int u=0;u<node;u++) {
				if(d[u] > d[v] + map[v][u]) {
					d[u] = d[v] + map[v][u];
					visit[u] = v;
				}
			}
		}
		return d[g.ind];
	}

	public static void main(String[] args) {
		new Main().run();
	}
	
	class P {
		int x, y, ind;
		P(int x, int y, int ind) {
			this.x = x;
			this.y = y;
			this.ind = ind;
		}
	}
}