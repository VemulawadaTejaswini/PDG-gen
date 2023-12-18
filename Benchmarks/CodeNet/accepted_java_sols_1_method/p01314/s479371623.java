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
	    //System.err.println( n );
	    int count = 0;
	    int from = 1;
	    int to = 1;
	    int sum = 1;
	    while ( to < n ) {
		while ( sum < n ) {
		    to++;
		    sum += to;
		}
		while ( n < sum ) {
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
	    //System.err.println();
	    System.out.println( count );
	}	
    }    
}