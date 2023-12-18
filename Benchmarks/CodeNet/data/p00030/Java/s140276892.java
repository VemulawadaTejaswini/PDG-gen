import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	while ( true ) {
	    final int n = stdin.nextInt();
	    final int sum = stdin.nextInt();

	    if ( n == 0 && sum == 0 ) {
		break;
	    }
	    
	    System.out.println( dfs( 0, n, 0, sum, -1 ) );	    
	}
	
    }

    static int dfs( final int depth, final int maxDepth, final int sum, final int maxSum, final int maxNum ) {
	if ( depth == maxDepth ) {
	    return ( sum == maxSum ? 1 : 0 );
	} else if ( maxNum == 9 ) {
	    return 0;
	}

	int ans = 0;
	final int lim = Math.max( maxSum - sum, 9 );
	for ( int i = maxNum + 1; i <= lim; i++ ) {
	    ans += dfs( depth + 1, maxDepth, sum + i, maxSum, i );
	}

	return ans;	
    }
    
}