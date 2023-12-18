import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			boolean[][] ok = new boolean[n][31];
			for(int i=0;i<n;i++) for(int j=0, m=sc.nextInt();j<m;j++) 
				ok[i][sc.nextInt()] = true;
			
			long[] dp = new long[n];
			int i=1;
			boolean f = false;
			for(i=1;i<=30;i++) {
				long meet = 0;
				for(int j=0;j<n;j++) if( ok[j][i] ) meet |= 1L<<j|dp[j];
				for(int j=0;j<n;j++) if( ok[j][i] ) {
					dp[j] |= meet;
					if( dp[j] == (1L<<n)-1 ) f = true;
				}
//				debug(dp);
				if( f ) break;
			}
			System.out.println((i==31? -1: i));
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}