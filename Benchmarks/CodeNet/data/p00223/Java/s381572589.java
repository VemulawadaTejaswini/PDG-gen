
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int h, w;
	boolean[][] map;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			w = sc.nextInt(); h = sc.nextInt();
			if ((w|h) == 0) break;
			
			map = new boolean[h+2][w+2];
			for (boolean[] a: map) fill(a, true);
			V s = new V(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), 0);
			
			for (int y=1;y<=h;y++) for (int x=1;x<=w;x++) 
				map[y][x] = sc.next().charAt(0) == '1';
			
			System.out.println(bfs(s));
		}
	}
	
	int[] dx = {-1,0,1,0};
	int[] dy = {0,-1,0,1};
	String bfs(V s) {
		boolean[][][][] mem = new boolean[w+2][h+2][w+2][h+2];
		mem[s.x1][s.y1][s.x2][s.y2] = true;
		LinkedList<V> q = new LinkedList<V>();
		q.add(s);
		
		for (;! q.isEmpty();) {
			V c = q.removeFirst();
			if ( c.is_meet() ) return "" + c.c;
			
			for (int i=0;i<4;i++) {
				int nx1 = c.x1 + dx[i], ny1 = c.y1 + dy[i];
				int nx2 = c.x2 - dx[i], ny2 = c.y2 - dy[i];
				if (map[ny1][nx1]) {
					nx1 = c.x1; ny1 = c.y1;
				}
				if (map[ny2][nx2]) {
					nx2 = c.x2; ny2 = c.y2;
				}
				
				if (! mem[nx1][ny1][nx2][ny2]) {
					mem[nx1][ny1][nx2][ny2] = true;
					q.addLast(new V(nx1, ny1, nx2, ny2, c.c + 1));
				}
			}
		}
		
		return "NA";
	}
	
	class V {
		int x1, y1, x2, y2, c;
		V(int x1, int y1, int x2, int y2, int c) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
			this.c = c;
		}
		
		boolean is_meet() {
			return x1 == x2 && y1 == y2;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}