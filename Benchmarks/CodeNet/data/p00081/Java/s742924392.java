import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextLine() ) {
	    final String[] input = stdin.nextLine().split( "," );
	    final double[] p1 = { Double.parseDouble( input[0] ), Double.parseDouble( input[1] ) };
	    final double[] p2 = { Double.parseDouble( input[2] ), Double.parseDouble( input[3] ) };
	    final double[] pq = { Double.parseDouble( input[4] ), Double.parseDouble( input[5] ) };

	    final double[] a = sub( p1, pq );
	    final double[] b = sub( p2, pq );

	    final double alpha = - ip( b, sub( a, b ) ) / norm( sub( a, b ) );
	    double[] ans = add( pq, times( add( times( a, alpha ), times( b, 1 - alpha ) ), 2 ) );
	    System.out.printf( "%f %f\n", ans[0], ans[1] );
	}	
    }

    static double[] times( double[] v, double val ) {
	final double[] vc = Arrays.copyOf( v, v.length );
	for ( int i = 0; i < v.length; i++ ) {
	    vc[i] *= val;
	}
	return vc;
    }

    static double ip( double[] v1, double[] v2 ) {
	double sum = 0.0;
	for( int i = 0; i < v1.length; i++ ) {
	    sum += v1[i] * v2[i];
	}
	return sum;
    }

    static double norm( double[] v ) {
	return ip( v, v );
    }

    static double[] add( double[] v1, double[] v2 ) {
	final double[] v1c = Arrays.copyOf( v1, v1.length );
	for ( int i = 0; i < v1c.length; i++ ) {
	    v1c[i] += v2[i];
	}
	return v1c;
    }

    static double[] sub( double[] v1, double[] v2 ) {
	final double[] v1c = Arrays.copyOf( v1, v1.length );
	for ( int i = 0; i < v1c.length; i++ ) {
	    v1c[i] -= v2[i];
	}
	return v1c;
    }
    
}