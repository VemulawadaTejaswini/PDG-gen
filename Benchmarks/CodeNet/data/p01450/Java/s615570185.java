import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final int N = stdin.nextInt();
	final int W = stdin.nextInt();

	final int[] ws = new int[ N ];
	for ( int i = 0; i < N; i++ ) {
	    ws[ i ] = stdin.nextInt();
	}

	final int[][] comb = new int[ W + 1 ][ N + 1 ];
	comb[ 0 ][ 0 ] = 1;
	for ( int i = 0; i < N; i++ ) {
	    for ( int j = 0; j + ws[ i ] <= W; j++ ) {
		comb[ j + ws[ i ] ][ i + 1 ] += comb[ j ][ i ];
		comb[ j + ws[ i ] ][ i + 1 ] %= 1000000007;
		comb[ j ][ i + 1 ] += comb[ j ][ i ];
		comb[ j ][ i + 1 ] %= 1000000007;
	    }
	}
	int sum = 0;
	for ( int i = 0; i <= W; i++ ) {
	    sum += comb[ i ][ N - 1 ];
	    sum %= 1000000007;
	}
	System.out.println( sum );
    }    
}