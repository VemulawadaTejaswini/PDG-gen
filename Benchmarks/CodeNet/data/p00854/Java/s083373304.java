import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

		final Scanner stdin = new Scanner( System.in );

		while ( true ) {

			int n = stdin.nextInt();
			int k = stdin.nextInt();
			int m = stdin.nextInt();
			if ( n == 0 && k == 0 && m == 0 ) break;

			ArrayList<Integer> lst = new ArrayList<Integer>();
			for ( int i = 1; i <= n; i++ ) {
				lst.add( i );
			}
			int index = m - 1;
			for ( int i = 0; i < n - 1; i++ ) {
				lst.remove( lst.get( index-- ) );
				index = ( index + k ) % lst.size();
			}
			System.out.println( lst.get( 0 ) );
		}	
    }    
}