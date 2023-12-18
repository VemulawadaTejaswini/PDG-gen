import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

		final Scanner stdin = new Scanner( System.in );

		while ( true ) {

			final int n = stdin.nextInt();
			final int m = stdin.nextInt();
			if ( n == 0 && m == 0 ) break;

			final int[] ns = new int[ n ];
			for ( int i = 0; i < n; i++ ) {
				ns[ i ] = stdin.nextInt();
			}
			Arrays.sort( ns );
			final int[] ms = new int[ m ];
			for ( int i = 0; i < m; i++ ) {
				ms[ i ] = stdin.nextInt();
			}
			Arrays.sort( ms );

			final int nsum = sum( ns );
			final int msum = sum( ms );
			boolean success = false;

			for ( final int val : ns ) {
				final int findVal = msum + 2 * val - nsum;
				if ( findVal % 2 == 0 ) {
					final int mindex = Arrays.binarySearch( ms, findVal / 2 );
					if ( mindex >= 0 ) {
						success = true;
						System.out.printf( "%d %d\n", val, ms[ mindex ] );
						break;
					}
				}
			}
			if ( !success ) {
				System.out.println( -1 );
			}
		}	
    }

	static int sum( final int[] array ) {
		int sum = 0;
		for ( final int val : array ) {
			sum += val;
		}
		return sum;
	}
}