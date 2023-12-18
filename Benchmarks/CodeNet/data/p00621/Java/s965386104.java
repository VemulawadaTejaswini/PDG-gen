import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static final int NONE = Integer.MIN_VALUE;
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int W = stdin.nextInt();
	    final int Q = stdin.nextInt();

	    if ( W == 0 && Q == 0 ) {
		break;
	    }

	    final int[] ar = new int[ W ];
	    Arrays.fill( ar, NONE );
	    
	    for ( int i = 0; i < Q; i++ ) {
		final String word = stdin.next();
		final int id = stdin.nextInt();
		if ( "s".equals( word ) ) {
		    final int w = stdin.nextInt();
		    final int index = find( ar, id, w );
		    if ( index < 0 ) {
			System.out.println( "impossible" );
		    } else {
			System.out.println( index );
		    }
		} else {
		    remove( ar, id );
		}		
	    }
	    System.out.println( "END" );
	}	
    }

    static int find( final int[] array, final int id, final int w ) {
	int count = 0;
	for ( int i = 0; i < array.length; i++ ) {
	    if ( array[ i ] == NONE ) {
		count++;
		if ( count == w ) {
		    Arrays.fill( array, i - w + 1, i + 1, id );
		    return i - w + 1;
		}
	    } else {
		count = 0;
	    }
	}
	return -1;
    }

    static void remove( final int[] array, final int id ) {
	for ( int i = 0; i < array.length; i++ ) {
	    if ( array[ i ] == id ) {
		array[ i ] = NONE;
	    }
	}
    }    
}