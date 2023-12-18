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
	    while ( to <= n / 2 + 1 ) {
		while ( to <= n / 2 + 1 && sum < n ) {
		    to++;
		    sum += to;
		}
		if ( sum == n ) {
		    //System.err.printf( "from, to = %d, %d\n", from, to );
		    count++;
		    sum -= from;
		    from++;
		} else {
		    while ( from <= n / 2 + 1 && n < sum ) {
			sum -= from;
			from++;
		    }
		    if ( sum == n ) {
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