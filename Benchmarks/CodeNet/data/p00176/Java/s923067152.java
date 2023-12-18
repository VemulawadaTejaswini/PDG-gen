import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final String[] colorStr = { "black", "blue", "lime", "aqua", "red", "fuchsia", "yellow", "white" };

	while ( true ) {

	    final String input = stdin.nextLine().trim();
	    if ( "0".equals( input ) ) {
		break;		    
	    }

	    int[] in = new int[3];
	    in[0] = Integer.parseInt( input.substring( 1, 3 ), 16 );
	    in[1] = Integer.parseInt( input.substring( 3, 5 ), 16 );
	    in[2] = Integer.parseInt( input.substring( 5, 7 ), 16 );
	    
	    int minIndex = -1;
	    int minD = Integer.MAX_VALUE;
	    for ( int i = 0; i < 8; i++ ) {
		final int[] color = makeColor( i );
		final int d = dist( color, in );
		if ( minD > d ){
		    minD = d;
		    minIndex = i;
		}
	    }
	    System.out.println( colorStr[minIndex] );
	}	
    }

    static int[] makeColor( int i ) {
	int[] ans = new int[3];
	int index = 2;
	while ( i > 0 ) {
	    ans[index] = ( i % 2 == 1 ? 0xff : 0 );
	    i /= 2;
	    index--;
	}
	return ans;
    }

    static int dist( int[] a, int[] b ) {
	int sum = 0;
	final int lim = min( a.length, b.length );
	for ( int i = 0; i < lim; i++ ) {
	    sum += ( a[i] - b[i] ) * ( a[i] - b[i] );
	}
	return sum;
    }    
}