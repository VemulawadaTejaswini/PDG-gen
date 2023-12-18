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

	    final int m = stdin.nextInt();
	    int sum = 0;
	    for ( int i = 0; i < m; i++ ){
		final int from = stdin.nextInt();
		final int to = stdin.nextInt();
		sum += to - from;
	    }
	    if ( n <= sum ) {
		System.out.println( "OK" );
	    } else {
		System.out.println( n - sum );
	    }
	}	
    }    
}