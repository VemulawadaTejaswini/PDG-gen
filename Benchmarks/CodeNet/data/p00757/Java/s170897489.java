
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int h, w, s;
	int map[][];
	int all;
	Pair mem[][][][];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			h = sc.nextInt();
			w = sc.nextInt();
			s = sc.nextInt();
			if((h|w|s) == 0) break;
			map = new int[h+1][w+1];
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				map[i][j] = sc.nextInt() + map[i-1][j] + map[i][j-1] - map[i-1][j-1];
			}
			mem = new Pair[w][h][w+1][h+1];
			for(Pair[][][] a: mem) for(Pair[][] b: a) for(Pair[] c: b) fill(c, new Pair(-1, 0));
			all = demand(0,0,w,h);
//			for(int[] a: map) debug(a);
//			debug(all);
			Pair p = solve(0,0,w,h);
			System.out.println(p.s + " " + (s-p.f));
		}
	}
	
	Pair solve(int x1, int y1, int x2, int y2) {
		if(mem[x1][y1][x2][y2].f != -1) return mem[x1][y1][x2][y2];
		int ss = all - demand( x1, y1, x2, y2 );
		Pair p;
		if( ss > s ) {
			p = new Pair(-2, 0);
		}
		else p = new Pair(ss, 1);
//		debug(x1, y1, x2, y2, p.f, p.s, demand(x1, y1, x2, y2));
		for(int i=x1+1;i<x2;i++) {
			Pair p1 = solve(x1, y1, i, y2);
			Pair p2 = solve(i, y1, x2, y2);
			if( p1.f == -2 || p2.f == -2 ) continue;
			if( p.s < p1.s + p2.s ){
				p.f = max(p1.f, p2.f);
				p.s = p1.s + p2.s;
			}
			else if (p.s == p1.s + p2.s && max(p1.f, p2.f) < p.f)
				p.f = max(p1.f, p2.f);
		}
		
		for(int i=y1+1;i<y2;i++) {
			Pair p1 = solve(x1, y1, x2, i);
			Pair p2 = solve(x1, i, x2, y2);
			if( p1.f == -2 || p2.f == -2 ) continue;
			if( p.s < p1.s + p2.s ){
				p.f = max(p1.f, p2.f);
				p.s = p1.s + p2.s;
			} 
			else if (p.s == p1.s + p2.s && max(p1.f, p2.f) < p.f)
				p.f = max(p1.f, p2.f);
		}
		
//		debug("  ", x1, y1, x2, y2, p.f, p.s);
		return mem[x1][y1][x2][y2] = p;
	}
	
	int demand(int x1, int y1, int x2, int y2) {
		return map[y2][x2] - map[y2][x1] - map[y1][x2] + map[y1][x1];
	}
	
	class Pair {
		int f, s;
		Pair(int f, int s) {
			this.f = f;
			this.s = s;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}