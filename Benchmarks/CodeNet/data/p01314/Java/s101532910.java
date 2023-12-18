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

	    int count = 0;
	    int from = 0;
	    int to = 0;
	    int sum = 0;
	    while ( to < n ) {
		while ( to < n && sum < n ) {
		    to++;
		    sum += to;
		}
		if ( to < n && sum == n ) {
		    //System.err.printf( "from, to = %d, %d\n", from, to );
		    count++;
		    sum -= from;
		    from++;
		} else {
		    while ( from < n && n < sum ) {
			sum -= from;
			from++;
		    }
		    if ( to < n && sum == n ) {
			//System.err.printf( "from, to = %d, %d\n", from, to );
			count++;
			to++;
			sum += to;
		    }
		}
	    }
	    //System.err.println();
	    System.out.println( count );
	}	
    }    
}