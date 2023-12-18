
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n;
	int U;
	Sub[] subs;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			U = sc.nextInt();
			if( (n|U) == 0 ) break;
			subs = new Sub[n];
			
			for(int i=0;i<n;i++) {
				int c = sc.nextInt();
				int k = sc.nextInt();
				int mask = 0;
				for(int j=0;j<k;j++) {
					int r = sc.nextInt();
					mask += (1<<r);
				}
				
				subs[i] = new Sub(c, mask);
				
			}
			
//			for(Sub s: subs) debug(s.c, s.mask);
			
/*			int min = INF;
			for(int i=0;i<(1<<n);i++) {
				int u = 0;
				for(int j=0;j<n;j++)if((subs[j].mask&i) == subs[j].mask) {
					u += subs[j].c * ( (i>>j) & 1 );
				}
//				debug(" ", i, u);
				if( u >= U ) min = min(min, Integer.bitCount(i));
			}
			
			System.out.println(min);*/
			dp = new int[1<<n];
			fill(dp, -1);
			System.out.println(solve(U, 0));
		}
	}
	
	int[] dp;
	int solve(int u, int S) {
		if( dp[S] >= 0 ) return dp[S];
		if( u <= 0 ) return dp[S] = 0;
		if( S+1 == (1<<n) ) return dp[S] = 0;
		int min = INF;
		for(int i=0;i<n;i++) if(((S>>i)&1) == 0 && (subs[i].mask&S) == subs[i].mask) {
			min = min(min, solve(u-subs[i].c, S|(1<<i))+1);
		}
		
		return dp[S] = min;
	}
	
	class Sub {
		int c, mask;
		Sub(int c, int mask) {
			this.c = c;
			this.mask = mask;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}