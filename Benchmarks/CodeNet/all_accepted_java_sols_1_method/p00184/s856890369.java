import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    int[] hist = new int[ 7 ];
	    for ( int i = 0; i < n; i++ ) {
		final int index = min( 6, stdin.nextInt() / 10 );
		hist[ index ]++;
	    }
	    for ( final int val : hist ) {
		System.out.println( val );
	    }
	}	
    }    
}