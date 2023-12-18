import java.util.*;
import java.io.*;

class Main {

    static final int X = 0;
    static final int Y = 1;
    
    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextDouble() ) {
	    double[][] ps = new double[4][2];
	    for ( int i = 0; i < 4; i++ ){
		ps[i][X] = stdin.nextDouble();
		ps[i][Y] = stdin.nextDouble();
	    }

	    if ( inside( ps[0], ps[1], ps[2][X], ps[2][Y] ) ||
		 inside( ps[0], ps[1], ps[2][X], ps[3][Y] ) ||
		 inside( ps[0], ps[1], ps[3][X], ps[2][Y] ) ||
		 inside( ps[0], ps[1], ps[3][X], ps[3][Y] ) ){

		System.out.println( "YES" );
	    } else {
		System.out.println( "NO" );
	    }
	}
    }

    static boolean inside( double[] p1, double[] p2, double x, double y ) {
	return ( p1[X] < x && x < p2[X] && p1[Y] < y && y < p2[Y] );
    }
    
}