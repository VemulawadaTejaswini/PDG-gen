import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( stdin.hasNextLine() ) {
	    final String[] input = stdin.nextLine().split( "," );
	    final int[] a = new int[10];
	    for ( int i = 0; i < 10; i++ ) {
		a[i] = Integer.parseInt( input[i] );
	    }
	    final int v1 = Integer.parseInt( input[10] );
	    final int v2 = Integer.parseInt( input[11] );
	    final double sum = sum( a );
	    final double v1dist = sum / ( v1 + v2 ) * v1;
	    double b = 0;
	    for ( int i = 0; i < 10; i++ ) {
		//System.err.println( b + " " + a[i] );
		if (  b + a[i] < v1dist ) {
		    b += a[i];
		} else {
		    System.out.println( i + 1 );
		    break;
		}
	    }
	}	
    }

    static double sum( int[] array ) {
	double sum = 0;
	for ( int i = 0; i < 10; i++ ) {
	    sum += array[i];
	}
	return sum;
    }
}