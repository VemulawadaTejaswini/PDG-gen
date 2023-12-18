import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {
		
		final Scanner stdin = new Scanner( System.in );
		
		while ( true ) {
			int n = stdin.nextInt();
			int m = stdin.nextInt();
			if ( n == 0 && m == 0 ) break;

			int[] table = new int[ m ];
			for ( int j = 0; j < n; j++ ) {
				for ( int i = 0; i < m; i++ ){
					final int val = stdin.nextInt();
					table[ i ] <<= 1;
					table[ i ] += val;
				}
			}
			int[] work = new int[ m ];
			
			int max = 0;
			int mask = (1 << n) - 1;

			for ( int i = 0; i < (1 << n); i++ ) {
				System.arraycopy( table, 0, work, 0, m );
				
				// よこ
				int rev = 0;
				for ( int j = 0; j < n; j++ ) {
					rev <<= 1;
					if ( ( ( 1 << j ) & i ) != 0 ) {
						rev++;
					}
				}
				for ( int k = 0; k < work.length; k++ ) {
					work[ k ] ^= rev;
				}
				int sum = 0;
				
				// たて
				for ( int val : work ) {
					int count = Integer.bitCount( val & mask );
					sum += Math.max( count, n - count );
				}
				if ( max < sum ) {
					max = sum;
				}
			}
			System.out.println( max );
		}	
    }    
}