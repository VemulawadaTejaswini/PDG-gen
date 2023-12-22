import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

		final Scanner stdin = new Scanner( System.in );

		while ( true ) {

			final int n = stdin.nextInt();
			if ( n == 0 ) break;
			final int[] array = new int[ n ];
			for ( int i = 0; i < n; i++ ) {
				array[ i ] = stdin.nextInt();
			}
			Arrays.sort( array );

			int sum = 0;
			for ( int i = 1; i < array.length - 1; i++ ) {
				sum += array[ i ];
			}
			sum /= ( n - 2 );
			System.out.println( sum );
		}	
    }    
}