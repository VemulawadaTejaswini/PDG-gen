import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int ab = stdin.nextInt();
	    final int af = stdin.nextInt();
	    if ( ab == 0 && af == 0 ) {
		break;
	    }
	    int maxIndex = 0;
	    int maxSum = ab + af;
	    for ( int i = 1; i < 5; i++ ){
		final int sum = stdin.nextInt() + stdin.nextInt();
		if ( maxSum < sum ) {
		    maxIndex = i;
		    maxSum = sum;
		}
	    }
	    System.out.printf( "%c %d\n", ( char )( 'A' + maxIndex ), maxSum );
	}	
    }    
}