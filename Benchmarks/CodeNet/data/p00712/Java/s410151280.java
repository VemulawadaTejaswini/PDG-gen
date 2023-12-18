import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main1 {
	int p, q, a, n, cnt;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			p = sc.nextInt(); q = sc.nextInt(); a = sc.nextInt(); n = sc.nextInt();
			if( (p|q|a|n) == 0 ) break;
			
			cnt = 0;
			int vs[] = new int[n];
			dfs(1, 0, 1, vs);
			System.out.println(cnt);
		}
	}
	
	void dfs( int i, int x, int mul, int[] vs) {
//		debug(i, x, mul, add);
		int sum = 0;
		for(int j=0;j<x;j++) sum += mul / vs[j];
		if( p * mul == sum * q ) {
//			debug(i, x, mul, vs);
			cnt++; return;
		}
		if( x == n ) return;
		for(int j=i;j<=a;j++) {
			if( mul * j > a )break;
			vs[x] = j;
			dfs( j, x+1, mul*j, vs );
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}