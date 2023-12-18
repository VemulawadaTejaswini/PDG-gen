import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int K = stdin.nextInt();
	    if ( K == 0 ) {
		break;
	    }

	    int sum = 0;
	    final int lim = K * ( K - 1 ) / 2;
	    for ( int i = 0; i < lim; i++ ) {
		sum += stdin.nextInt();
	    }

	    System.out.println( sum / ( K - 1 ) );	    
	}	
    }    
}