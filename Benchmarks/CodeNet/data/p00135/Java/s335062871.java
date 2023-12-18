import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final int n = Integer.parseInt( stdin.nextLine() );
	for ( int i = 0; i < n; i++ ) {
	    final String[] input = stdin.nextLine().split( ":" );
	    final int h = Integer.parseInt( input[ 0 ] );
	    final int m = Integer.parseInt( input[ 1 ] );
	    final int dh = 60 * h + m;
	    final int dm = 12 * m;
	    final int mind = min( dh, dm );
	    final int maxd = max( dh, dm );
	    final int diff = min( abs( mind - maxd ), abs( mind + 720 - maxd ) );
	    if ( diff < 60 ) {
		System.out.println( "alert" );
	    } else if ( 60 <= diff && diff < 180 ) {
		System.out.println( "warning" );
	    } else {
		System.out.println( "safe" );
	    }
	}
    }    
}