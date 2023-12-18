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
	    
	    int maxCount = 0;
	    int maxNum = -1;
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for ( int i = 0; i < n; i++ ) {
		final int num = stdin.nextInt();
		if ( map.containsKey( num ) ) {
		    map.put( num, map.get( num ) + 1 );
		} else {
		    map.put( num, 1 );
		}
		if ( maxCount < map.get( num ) ){
		    maxNum = num;
		    maxCount = map.get( num );
		}
	    }
	    if ( maxCount * 2 > n ) {
		System.out.println( maxNum );
	    } else {
		System.out.println( "NO COLOR" );
	    }
	}	
    }    
}