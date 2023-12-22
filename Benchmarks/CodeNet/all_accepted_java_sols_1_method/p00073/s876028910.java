import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int x = stdin.nextInt();
	    final int h = stdin.nextInt();

	    if ( x == 0 && h == 0 ) {
		break;
	    }

	    final double S = x * x + 2.0 * x * sqrt( h * h + 0.25 * x * x );
	    
	    System.out.println( S );	    
	}	
    }    
}