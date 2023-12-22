import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

		final Scanner stdin = new Scanner( System.in );

		while ( true ) {

			final int n = stdin.nextInt();
			final int r = stdin.nextInt();
			if ( n == 0 && r == 0 ) break;

			final int[] deck = new int[ n ];
			for ( int i = 0; i < n; i++ ) {
				deck[ n - 1 - i ] = i + 1;
			}
			int[] tmp = new int[ n ];
			for ( int i = 0; i < r; i++ ) {
				final int p = stdin.nextInt();
				final int c = stdin.nextInt();
				
				System.arraycopy( deck, 0, tmp, 0, p - 1 );
				for ( int j = 0; j < c; j++ ) {
					deck[ j ] = deck[ j + p - 1 ];
				}
				System.arraycopy( tmp, 0, deck, c, p - 1 );
			}
			System.out.println( deck[ 0 ] );
		}	
    }    
}