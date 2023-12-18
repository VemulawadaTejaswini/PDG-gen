import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

		final Scanner stdin = new Scanner( System.in );

		while ( true ) {

			final int n = stdin.nextInt();
			final int p = stdin.nextInt();
			if ( n == 0 && p == 0 ) break;

			int deck = p;
			final int[] hands = new int[ n ];
			int turn = 0;

			while ( true ) {
				if ( deck > 0 ) {
					hands[ turn ]++;
					deck--;
					if ( hands[ turn ] == p ) break;
				} else {
					deck = hands[ turn ];
					hands[ turn ] = 0;
				}
				turn = ( turn + 1 ) % n;
			}
			System.out.println( turn );
		}	
    }    
}