import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
	int INF = 1<<28;
	double EPS = 1e-9;
	long MOD = (long)1e9 + 7;
	int n, m;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt(); m = sc.nextInt();
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), t = sc.nextInt();
			if((n|m|a|b|c|t) == 0) break;
			MOD = m;
			long[] s = new long[n];
			for(int i=0;i<n;i++) {
				s[i] = sc.nextLong();
			}
			
			long[][] A = new long[n][n];
			for(int i=0;i<n;i++) {
				if(i-1 >= 0) A[i][i-1] = a;
				A[i][i] = b;
				if(i+1 < n) A[i][i+1] = c;
			}
//			debug(A);
			A = pow_mod(A, t);
			long[] ans = new long[n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) ans[i] = ( ans[i] + A[i][j] * s[j]) % MOD;
			}
			
			for(int i=0;i<n;i++) System.out.print(ans[i] + (i==n-1? "\n": " "));
		}
	}
	
	long[][] pow_mod(long[][] A, int t) {
		long[][] ret = new long[n][n];
		for(int i=0;i<n;i++)ret[i][i] = 1;
		
		while(t>0) {
			if((t&1)==1) {
				ret = mlt_mod(ret, A);
			}
			A = mlt_mod(A, A);
			t >>= 1;
//			debug(ret, A, t);
		}
		
		return ret;
	}
	
	long[][] mlt_mod(long[][] A, long[][] B) {
		long[][] ret = new long[n][n];
		for(int i=0;i<n;i++) for(int j=0;j<n;j++) {
			for(int k=0;k<n;k++) ret[i][j] = (ret[i][j] + A[i][k] * B[k][j]) % MOD;
		}
		return ret;
	}
	
	void debug(Object...os) {
		System.err.println(deepToString(os));
	}
	
	public static void main(String[] args ){
		new Main().run();
	}
}