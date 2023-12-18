import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static int[] makePrimes( final int lim ) {

	BitSet isPrime = new BitSet( lim + 1 );
	isPrime.set( 0, lim + 1, true );
	isPrime.set( 0, 2, false );
	final int limIndex = ( int )sqrt( lim );
	for ( int index = 2; index <= limIndex; index++ ) {
	    if ( isPrime.get( index ) ) {
		for ( int i = index * index; i <= lim; i += index ) {
		    isPrime.set( i, false );
		}
	    }
	}
	final int count = isPrime.cardinality();
	int[] ans = new int[count];
	int index = 0;
	for ( int i = 0; i <= lim; i++ ) {
	    if ( isPrime.get( i ) ) {
		ans[index++] = i;
	    }
	}
	return ans;
    }
    
    public static void main( final String[] args ) {
	
	final int[] primes = makePrimes( 1120 );
	final Scanner stdin = new Scanner( System.in );

	while ( true ) {
	    final int N = stdin.nextInt();
	    final int K = stdin.nextInt();
	    if ( N == 0 && K == 0 ) {
		break;
	    }
	    if ( N < 2 || K < 1 ) {
		System.out.println( 0 );
	    } else if( K == 1 ) {
		System.out.println( ( Arrays.binarySearch( primes, N ) >= 0 ) ? 1 : 0 );
	    } else {
		final int maxPrimeIndex = Arrays.binarySearch( primes, N );
		final int S = maxPrimeIndex >= 0 ? maxPrimeIndex : (- maxPrimeIndex - 2);
		long[][][] dp = new long[K + 1][N + 1][S + 1];
		for ( int i = 0; i < S; i++ ){
		    dp[1][primes[i]][i] = 1;
		}
		for ( int k = 1; k < K; k++ ) {
		    for ( int n = primes[k - 1]; n <= N; n++ ){
			for ( int s = 0; s < S && n + primes[s] <= N; ++s ){
			    for ( int si = 0; si < s; si++ ){
				dp[k + 1][n + primes[s]][s] += dp[k][n][si];
			    }
			}
		    }
		}
		long sum = 0;
		for ( int i = 0; i < S; i++ ) {
		    sum += dp[K][N][i];
		}
		System.out.println( sum );
	    }
	}	
    }    
}