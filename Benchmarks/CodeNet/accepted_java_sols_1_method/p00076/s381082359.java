import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == -1 ) {
		break;
	    }

	    double x = 1.0;
	    double y = 0.0;

	    for ( int i = 0; i < n - 1; i++ ) {
		double vx = -y;
		double vy = x;

		double norm = sqrt( vx * vx + vy * vy );
		vx /= norm;
		vy /= norm;

		x += vx;
		y += vy;
	    }
	    System.out.println( x );
	    System.out.println( y ); 
	}	
    }    
}