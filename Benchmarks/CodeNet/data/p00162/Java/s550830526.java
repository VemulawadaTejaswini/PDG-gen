import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static int[] getHammingArray( final int lim ) {
	final ArrayList<Integer> ham = new ArrayList<Integer>();
	ham.add( 1 );
	
	int index2 = 0;
	int index3 = 0;
	int index5 = 0;
	int next = 1;

	while ( next <= lim ) {
	    next = min( ham.get( index2 ) * 2, min( ham.get( index3 ) * 3, ham.get( index5 ) * 5 ) );
	    if ( next <= lim ) {
		if ( next == ham.get( index2 ) * 2 ) {
		    if ( ham.get( ham.size() - 1 ) < next ) {
			ham.add( ham.get( index2 ) * 2 );
		    }
		    index2++;
		} else if ( next == ham.get( index3 ) * 3 ) {
		    if ( ham.get( ham.size() - 1 ) < next ) {
			ham.add( ham.get( index3 ) * 3 );
		    }
		    index3++;
		} else { // if next == num5 * 5
		    if ( ham.get( ham.size() - 1 ) < next ) {
			ham.add( ham.get( index5 ) * 5 );
		    }
		    index5++;
		}
	    }
	}

	int[] array = new int[ ham.size() ];
	for ( int i = 0; i < ham.size(); i++ ) {
	    array[ i ] = ham.get( i );
	}
	return array;
    }
        
    public static void main(String[] args) {

	final Scanner stdin = new Scanner( System.in );
	final int[] array = getHammingArray( 1000000 );
	//System.err.println( Arrays.toString( array ) );

	while ( true ) {
	    final int m = stdin.nextInt();
	    if ( m == 0 ) {
		break;
	    }
	    final int n = stdin.nextInt();
	    final int lower = Arrays.binarySearch( array, m );
	    final int indexLower = lower >= 0 ? lower : -lower - 1;
	    final int upper = Arrays.binarySearch( array, n );
	    final int indexUpper = upper >= 0 ? upper : -upper - 2;
	    System.out.println( indexUpper - indexLower + 1 );
	}	
    }    
}