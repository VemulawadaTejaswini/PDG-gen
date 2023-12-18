
import java.awt.Component;
import java.awt.Container;
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			LinkedList<Man> mans = new LinkedList<Man>();
			
			for(int i=0;i<n;i++) {
				Man a = new Man(sc.nextInt(), sc.nextInt(), sc.nextInt());
				
				int size = mans.size();
				if(size==0) {
					mans.add(a);
					continue;
				}
				for(int j=0;j<size;j++) {
					Man b = mans.removeFirst();
					Man[] sp = split(a, b);
					for(int k=0;k<sp.length-1;k++) {
						mans.add(sp[k]);
					}
					a = sp[sp.length-1];
					if(a.y > sp[sp.length-1].y){
						break;
					}
				}
				mans.add(a);
				Collections.sort(mans);
//				for(Man m: mans) debug(m.m, m.x, m.y);
//				debug(" ");
			}
			boolean flg = false;
			for(Man m: mans) {
				if(m.m > 150 && m.x != m.y) {
					flg = true;
					break;
				}
			}
//			for(Man m: mans) debug(m.m, m.x, m.y);
//			debug(" ");
			if(flg) System.out.println("NG");
			else System.out.println("OK");
		}
	}
	
	Man[] split(Man a, Man b) {
		if( a.x > b.y || a.y < b.x ) return new Man[]{b,a};
		
		if(a.x <= b.x) {
			Man m1 = new Man(a.m, a.x, b.x);
			Man m2 = new Man(a.m+b.m, b.x, min(a.y, b.y));
			Man m3 = new Man(b.y>a.y? b.m:a.m, min(a.y, b.y), max(a.y, b.y));
			return new Man[]{m3, m2, m1};
		}
		else {
			Man[] tmp = split(b, a);
			return new Man[] {tmp[2], tmp[1], tmp[0]};
		}
	}
	
	class Man implements Comparable<Man>{
		int m , x, y;
		Man(int m, int x, int y) {
			this.m = m;
			this.x = x;
			this.y = y;
		}
		
		public boolean equals(Object o) {
			if(o instanceof Man) {
				Man man = (Man) o;
				return m == man.m && x == man.x && y == man.y; 
			}
			return false;
		}

		@Override
		public int compareTo(Man o) {
			// TODO 自動生成されたメソッド・スタブ
			return x-o.x;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}