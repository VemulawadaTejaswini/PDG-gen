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

	final Scanner stdin = new Scanner( System.in );

	final int[] primeList = makePrimes( 1 << 15 );
	
	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    System.out.println( solve( n, primeList ) );
	    
	}
    }

    static int solve( final int n, final int[] primeList ) {

	int count = 0;
	
	int index = 0;
	while ( index < primeList.length && primeList[ index ] <= n - primeList[ index ] ) {
	    if ( Arrays.binarySearch( primeList, n - primeList[ index ] ) >= 0 ) {
		count++;
	    }
	    index++;
	}
	return count;
    }
}