import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static int gcm( final int n, final int m ) {

	if ( n < m ) {
	    return gcm( m, n );
	} else if( m == 0 ) {
	    return n;	    
	} else {
	    return gcm( m, n % m );
	}
    }
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( stdin.hasNextInt() ) {

	    final int n = stdin.nextInt();
	    final int m = stdin.nextInt();

	    System.out.println( gcm( n, m ) );
	    
	}	
    }    
}