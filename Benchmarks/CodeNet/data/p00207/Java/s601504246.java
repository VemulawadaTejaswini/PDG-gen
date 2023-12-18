
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	Point s, g;
	
	int[][] map;
	boolean[][] visited;
	
	int dpx[] = {4, 2};
	int dpy[] = {2, 4};
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;
			s = new Point(sc.nextInt(), sc.nextInt());
			g = new Point(sc.nextInt(), sc.nextInt());
			int n = sc.nextInt();
			
			map = new int[h+2][w+2];
			visited = new boolean[h+2][w+2];
			
			for(int i=0;i<n;i++) {
				int c = sc.nextInt();
				int d = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				for(int j=x;j<x+dpx[d];j++) for(int k=y;k<y+dpy[d];k++)
					map[k][j] = c;
			}
//			for(int i=0;i<h;i++) {
//				for(int j=0;j<w;j++) System.out.print(map[i+1][j+1] + " ");
//				System.out.println();
//			}
			if(dfs()) System.out.println("OK");
			else System.out.println("NG");
		}
	}
	
	boolean isGoal(Point p) {
		return p.x == g.x && p.y == g.y;
	}
	boolean dfs() {
		LinkedList<Point> queue = new LinkedList<Point>();
		queue.add(s);
		if( map[s.y][s.x] == 0) return false;
		while(!queue.isEmpty()) {
			Point p = queue.removeFirst();
//			System.out.println(p.x + " " + p.y + " " + map[p.y][p.x]);
			visited[p.y][p.x]= true; 
			if(isGoal(p)) return true;
			
			for(int i=0;i<4;i++) {
				if(!visited[p.y+dy[i]][p.x+dx[i]] && map[p.y+dy[i]][p.x+dx[i]] == map[s.y][s.x])
					queue.addLast(new Point(p.x+dx[i], p.y+dy[i]));
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class Point {
		int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}