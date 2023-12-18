
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main{

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int[] ps = new int[100000];
	void prime() {
		boolean[] p = new boolean[1500000];
		int index = 0;
		for(int i=2;i<=1299709;i++)if(!p[i]) {
			ps[index++] = i;
			for(int j=i*2;j<=1299709;j+=i) p[j] = true;
		}
	}
	
	int binSearch(int x) {
		int l = 0, r = 100000;
		for(;l < r;) {
			int c = (l+r) / 2;
			if(x == ps[c]) return c;
			else if( x < ps[c] ) r = c;
			else if( x > ps[c] ) l = c+1;
		}
		return l;
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		prime();
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			int id = binSearch(n);
			if(ps[id] == n) System.out.println(0);
			else System.out.println(ps[id] - ps[id-1]);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}