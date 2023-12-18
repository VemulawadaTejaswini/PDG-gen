
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			int h = sc.nextInt();
			
			if( (n|h) == 0 ) break;
			
			int sum = n*n*n;
			@SuppressWarnings("unused")
			HashSet<P>[] holes = new HashSet[3];
			HashSet<P> cross = new HashSet<P>();
			//0:xy 1:xz 2 yz
			for(int i=0;i<3;i++) holes[i] = new HashSet<P>();
			
			for(int i=0;i<h;i++) {
				String str = sc.next();
				int a = sc.nextInt();
				int b = sc.nextInt();
				sum -= n;
				if( str.equals("xy")) {
					for(P p: holes[1]) {
						if( p.f == a ) {
							sum++;
							cross.add(new P(a, b, p.s));
						}
					}
					for(P p: holes[2]) {
						if( p.f == b && !cross.contains(new P(a, b, p.s)) ) {
							sum++;
							cross.add(new P(a, b, p.s));
						}
					}
					holes[0].add(new P(a, b));
				}
				if( str.equals("xz")) {
					for(P p: holes[0]) {
						if( p.f == a ) {
							sum++;
							cross.add(new P(a, p.s, b));
						}
					}
					for(P p: holes[2]) {
						if( p.s == b && !cross.contains(new P(a, p.f, b)) ) {
							sum++;
							cross.add(new P(a, p.f, b));
						}
					}
					holes[1].add(new P(a, b));
				}
				if( str.equals("yz")) {
					for(P p: holes[0]) {
						if( p.s == a ) {
							sum++;
							cross.add(new P(p.f, a, b));
						}
					}
					for(P p: holes[1]) {
						if( p.s == b && !cross.contains(new P(p.f, a, b)) )  {
							sum++;
							cross.add(new P(p.f, a, b));
						}
					}
					holes[2].add(new P(a, b));
				}
			}
//			debug(cross.size());
//			for(P p: cross) debug(p.f, p.s, p.t);
			
			System.out.println(sum);
		}
	}
	
	class P {
		int f, s, t;
		P(int f, int s) {
			this.f = f;
			this.s = s;
			t = 0;
		}
		
		P(int f, int s, int t) {
			this.f = f;
			this.s = s;
			this.t = t;
		}
		
		@Override
		public boolean equals(Object o) {
			if(o instanceof P) {
				P p = (P)o;
				return f == p.f && s == p.s && t == p.t;
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return f * 250000 + s * 500 + t;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}