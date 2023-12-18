import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			P p = new P(0, 0);
			P max = new P(0, 0);
			for(;;) {
				int dx = sc.nextInt(), dy = sc.nextInt();
				if( (dx|dy) == 0 ) break;
				p.x += dx; p.y += dy;
				if( max.compareTo(p) < 0 ) max = new P(p.x, p.y);
			}
			System.out.println(max.x + " " + max.y);
		}
	}
	
	class P implements Comparable<P>{
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(P p) {
			// TODO 自動生成されたメソッド・スタブ
			if( x*x + y*y - (p.x*p.x + p.y*p.y) != 0 )
				return x*x + y*y - (p.x*p.x + p.y*p.y);
			return x - p.x;
		}
		
		
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}