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

	final int MAX_N = Math.min( s, 100 );
	int[][][] cache = new int[n + 1][MAX_N + 1][s + 1];
	for ( int i = 0; i <= MAX_N; i++ ) {
	    cache[1][i][i] = 1;
	}
	
	for ( int depth = 1; depth < n; depth++ ) {
	    for ( int sum = 0; sum <= s; sum++ ) {
		final int lim = Math.min( MAX_N, s - sum );
		for ( int maxNum = 0; maxNum <= lim; maxNum++ ) {
		    for ( int to = maxNum + 1; to <= lim; to++ ) {
			cache[depth + 1][to][sum + to] += cache[depth][maxNum][sum];
		    }
		}
	    }
	}
	
	int sum = 0;
	for ( int maxNum = 0; maxNum <= MAX_N; maxNum++ ) {
	    sum += cache[n][maxNum][s];
	}
	return sum;	     
    }
    
}