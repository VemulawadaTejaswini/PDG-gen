import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = stdin.nextInt();
	    final int m = stdin.nextInt();

	    if ( n == 0 && m == 0 ) {
		break;
	    }

	    final ArrayList<Integer> list = new ArrayList<Integer>();
	    for ( int i = 1; i <= n; i++ ) {
		list.add( i );
	    }
	    
	    int index = n - 1;
	    while ( list.size() > 1 ) {
		index = ( index + m ) % list.size();
		//System.err.println( index + " " + list.get( index ) );
		list.remove( index );
		index--;
	    }
	    System.out.println( list.get( 0 ) );
	    //System.err.println(  );
	}	
    }    
}