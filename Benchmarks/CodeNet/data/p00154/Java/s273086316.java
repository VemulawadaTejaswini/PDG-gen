import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int m = stdin.nextInt();
	    if ( m == 0 ) {
		break;
	    }
	    int[] vals = new int[m + 1];
	    int[] nums = new int[m + 1];

	    for ( int i = 1; i <= m; i++ ) {
		vals[i] = stdin.nextInt();
		nums[i] = stdin.nextInt();
	    }

	    final int g = stdin.nextInt();
	    for ( int i = 0; i < g; i++ ) {
		final int n = stdin.nextInt();
		solve( n, vals, nums );
	    }
	}	
    }

    static void solve( final int n, final int[] vals, final int[] nums ) {
	final int m = vals.length - 1;
	
	final long[][] dp = new long[m + 1][n + 1];

	//init
	for ( int i = 0; i <= nums[1] && i * vals[1] <= n; i++ ) {
	    dp[1][i * vals[1]] = 1;
	}

	for ( int i = 2; i <= m; i++ ) {
	    for ( int j = 0; j <= n; j++ ) {
		int k = 0;
		while ( k <= nums[i] && j - k * vals[i] >= 0 ) {
		    dp[i][j] += dp[i - 1][j - k * vals[i]];
		    k++;
		}
	    }
	}
	System.out.println( dp[m][n] );
    }    
}