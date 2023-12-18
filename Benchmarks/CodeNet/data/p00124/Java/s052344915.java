
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		boolean first = true;
		for(;;) {
			int n = sc.nextInt();
			if( n == 0) break;
			if(first) {
				first = false;
			}
			else System.out.println();
			P[] ps = new P[n];
			for(int i=0;i<n;i++) 
				ps[i] = new P(sc.next(), sc.nextInt()*3 + sc.nextInt()*0 + sc.nextInt()*1, i);
			sort(ps);
			for(int i=0;i<n;i++) System.out.println(ps[i].s + "," + ps[i].p);
		}
	}
	
	class P implements Comparable<P> {
		String s;
		int p, i;
		P(String s, int p, int i) {
			this.s = s;
			this.p = p;
			this.i = i;
		}
		@Override
		public int compareTo(P o) {
			// TODO Auto-generated method stub
			if(p != o.p) return o.p-p;
			return i - o.i;
		}
		
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}