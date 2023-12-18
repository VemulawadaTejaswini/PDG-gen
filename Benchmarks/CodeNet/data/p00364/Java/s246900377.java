import java.io.*;
import java.util.*;

class Main {

    void solve(){

	Scanner sc = new Scanner( System.in );
	int n = sc.nextInt();
	double x = sc.nextDouble();

	double max_slope = 0.0;
	for ( int i=0; i<n; ++i ) {

	    double xi = sc.nextDouble();
	    double hi = sc.nextDouble();
	    double slope = hi/xi;
	    
	    if ( slope > max_slope ) max_slope = slope;
	}

	//	System.out.println( x*max_slope );
	System.out.printf( "%f", x*max_slope );
    }

    public static void main( String[] a ) {new Main().solve(); }
}

