import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( true ) {
	    final int n = stdin.nextInt();
	    final int s = stdin.nextInt();
	    if ( n == 0 && s == 0 ) {
		break;
	    }

	    System.out.println( solve( n, s ) );
	    
	}
	
    }

    static int solve( final int n, final int s ) {
	if ( s > 100 * n ) {
	    return 0;
	} else if ( s > 50 * n ) {
	    return dfs( 0, n, 0, 100 * n - s, -1 );
	} else {
	    return dfs( 0, n, 0, s, -1 );
	}	
    }
    
    static int dfs( final int depth, final int maxDepth, final int sum, final int maxSum, final int maxNum ) {
	//System.err.printf( "%d %d %d %d %d\n", depth, maxDepth, sum, maxSum, maxNum );
	if ( depth == maxDepth ) {
	    return sum == maxSum ? 1 : 0;
	}
	if ( ( maxDepth - depth ) * maxNum + sum > maxSum ) {
	    return 0;
	}
	
	int combSum = 0;
	final int lim = Math.min( 100, maxSum - sum );
	for ( int i = maxNum + 1; i <= lim; i++ ) {
	    combSum += dfs( depth + 1, maxDepth, sum + i, maxSum, i );
	}
	return combSum;
    }
    
}