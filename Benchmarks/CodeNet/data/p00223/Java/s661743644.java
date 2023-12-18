
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w,h;
	P s1;
	P s2;
	boolean[][] map;
	boolean[] visited;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0) break;
			map = new boolean[h+2][w+2];
			visited = new boolean[6250000];
			s1 = new P(sc.nextInt(), sc.nextInt());
			s2 = new P(sc.nextInt(), sc.nextInt());
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				map[i][j] = sc.nextInt() == 0;
			}
			Twin twin = new Twin(s1, s2, 0);
			int ans = bfs(twin);
			if(ans < 0) System.out.println("NA");
			else System.out.println(ans);
		}
	}
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	int bfs(Twin twin) {
		LinkedList<Twin> que = new LinkedList<Twin>();
		que.add(twin);
		visited[twin.index()] = true;
		for(;!que.isEmpty();) {
			Twin now = que.removeFirst();
			if( now.isGoal() ) return now.c;
			if( now.c == 100) continue;
			for(int i=0;i<4;i++) {
				Twin next = now.act(dx[i], dy[i]);
				if( !visited[next.index()] ) {
					que.addLast(next);
					visited[next.index()] = true;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class Twin {
		P p1, p2;
		int c;
		Twin(P p1, P p2, int c) {
			this.p1 = p1;
			this.p2 = p2;
			this.c = c;
		}
		
		boolean isGoal() {
			return p1.x == p2.x && p1.y == p2.y;
		}
		
		int index() {
			int[] tmp = new int [4];
			tmp[0] = 1;
//			System.out.println(p1.x + " " + p1.y + " " + p2.x + " " + p2.y);
			for(int i=1;i<4;i++) tmp[i] = tmp[i-1]*50;
			return (p1.x-1) * tmp[3] + (p1.y-1) * tmp[2] + (p2.x-1) * tmp[1] + (p2.y-1) * tmp[0]; 
		}
		
		Twin act(int dx, int dy) {
			P next1;
			P next2;
			next1 = p1.act(dx, dy);
			next2 = p2.act(-dx, -dy);
			return new Twin(next1, next2, c+1);
		}
	}
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		P act(int dx, int dy) {
			P next;
			if( map[y+dy][x+dx] ) next = new P(x+dx, y+dy);
			else next = new P(x, y);
			return next;
		}
	}
}