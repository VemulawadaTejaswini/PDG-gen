import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static int[] makePrimes( final int max ) {

	final boolean[] isPrime = new boolean[ max + 1 ];
	Arrays.fill( isPrime, true );
	isPrime[ 0 ] = isPrime[ 1 ] = false;
	for ( int i = 0; i * i <= max ; i++ ) {
	    if ( isPrime[ i ] ) {
		for ( int j = i * i; j <= max; j += i ) {
		    isPrime[ j ] = false;
		}
	    }
	}
	int size = 0;
	for ( final boolean val : isPrime ) {
	    if ( val ) size++;
	}
	final int[] primes = new int[ size ];
	int index = 0;
	for ( int i = 0; i <= max; i++ ) {
	    if ( isPrime[ i ] ) {
		primes[ index++ ] = i;
	    }
	}
	return primes;
    }
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final int[] primes = makePrimes( 123456 * 2 );

	while ( true ) {
	    final int n = stdin.nextInt();
	    if ( n == 0 ) break;
	    final int tmpFromI = Arrays.binarySearch( primes, n );
	    final int fromI = tmpFromI >= 0 ? tmpFromI :-tmpFromI - 1 - 1;
	    final int tmpToI = Arrays.binarySearch( primes, n * 2 );
	    final int toI = tmpToI >= 0 ? tmpToI : -tmpToI - 1 - 1;
	    System.out.println( toI - fromI );
	}
    }    
}