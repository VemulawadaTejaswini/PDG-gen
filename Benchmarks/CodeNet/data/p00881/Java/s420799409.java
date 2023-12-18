
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n, m;
	BitSet[] yes, no;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			m = sc.nextInt(); n = sc.nextInt();
			if( (m|n) == 0 ) break;
			
			yes = new BitSet[m];
			no = new BitSet[m];
			for(int i=0;i<m;i++) {
				yes[i] = new BitSet(n); no[i] = new BitSet(n);
			}
			
			for(int i=0;i<n;i++) {
				String l = sc.next();
				for(int j=0;j<m;j++) {
					if(l.charAt(j) == '0') no[j].set(i);
					else yes[j].set(i);
				}
			}
			mem = new int[1<<m][1<<m]; 
			for(int[] a: mem) fill(a, -1);
			System.out.println(solve(0, 0));
		}
	}
	int[][] mem;
	int solve(int S, int Y) {
		if(mem[S][Y] >= 0) return mem[S][Y];
		BitSet bs = new BitSet(n);
		bs.set(0, n, true);
		for(int i=0;i<m;i++) if(((S>>i)&1)==1) {
			if(((Y>>i)&1)==1) bs.and(yes[i]);
			else bs.and(no[i]);
		}
		
		if(bs.cardinality()<=1) return mem[S][Y] = 0;
		int min = m;
		for(int i=0;i<m;i++) if(((S>>i)&1) == 0) {
			min = min(min, max(solve(S|(1<<i), Y), solve(S|(1<<i), Y|(1<<i))) + 1);
		}
		
		return mem[S][Y] = min;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}