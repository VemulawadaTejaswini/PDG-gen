import java.util.*;
import java.io.*;

class Main {

    static int VALUE = 0;
    static int WEIGHT = 1;
    
    public static void main(String[] args) {
	final Scanner stdin = new Scanner(System.in);

	int c = 1;
	while ( true ) {

	    final int W = Integer.parseInt( stdin.nextLine() );
	    if ( W == 0 ) {
		break;
	    }
	    final int N = Integer.parseInt( stdin.nextLine() );
	    
	    int[][] tres = new int[N][2];
	    for ( int i = 0; i < N; i++ ) {
		String[] input = stdin.nextLine().split( "," );
		tres[i][VALUE] = Integer.parseInt( input[0] );
		tres[i][WEIGHT] = Integer.parseInt( input[1] );
	    }

	    int[][] dp = new int[N + 1][W + 1];
	    for ( int n = 1; n <= N; n++ ){
		for ( int w = 0; w <= W; w++ ) {
		    if ( tres[n - 1][WEIGHT] + w <= W ) {
			dp[n][w + tres[n - 1][WEIGHT]] = Math.max( dp[n][w + tres[n - 1][WEIGHT]],
							       dp[n - 1][w] + tres[n - 1][VALUE] );
		    }
		}
	    }

	    int maxValue = Integer.MIN_VALUE;
	    int maxValueWeight = Integer.MAX_VALUE;
	    for ( int w = 0; w <= W; w++ ){
		if ( maxValue < dp[N][w] ) {
		    maxValue = dp[N][w];
		    maxValueWeight = w;
		}
	    }

	    System.out.printf( "Case %d:\n", c );
	    System.out.println( maxValue );
	    System.out.println( maxValueWeight );
	    c++;
	}	
    }    
}