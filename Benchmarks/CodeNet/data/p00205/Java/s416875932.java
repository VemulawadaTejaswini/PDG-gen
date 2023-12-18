import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

	static final int WIN = 1;
	static final int LOSE = 2;
	static final int EVEN = 3;
	
    public static void main( final String[] args ) {

		final Scanner stdin = new Scanner( System.in );

		while ( true ) {

			final int[] array = new int[ 5 ];
			array[ 0 ] = stdin.nextInt();
			if ( array[ 0 ] == 0 ) break;
			for ( int i = 1; i < 5; i++ ) {
				array[ i ] = stdin.nextInt();
			}
			int sum = 0;
			for ( final int val : array ) {
				sum |= 1 << ( val - 1 );
			}
			final int count = Integer.bitCount( sum );
			if ( count == 2 ) {
				int winIndex = -1;
				int loseIndex = -1;
				if ( sum == 3 ) {
					winIndex = 1;
					loseIndex = 2;
				} else if ( sum == 5 ) {
					winIndex = 2;
					loseIndex = 3;
				} else {
					winIndex = 3;
					loseIndex = 1;
				}
				for ( int i = 0; i < 5; i++ ) {
					if ( array[ i ] == winIndex ) { array[ i ] = WIN; }
					else if ( array[ i ] == loseIndex ) { array[ i ] = LOSE; }
				}
			} else {
				Arrays.fill( array, EVEN );
			}
			for ( final int val : array ) {
				System.out.println( val );
			}
		}	
    }    
}