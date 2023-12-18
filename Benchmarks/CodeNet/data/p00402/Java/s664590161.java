import java.io.*;
import java.util.*;

class Main {

    void solve(){

	Scanner sc = new Scanner( System.in );
	int n = sc.nextInt();

	int xmin = 2000, xmax = 0;
	for ( int i=0; i<n; ++i ) {
	    int x = sc.nextInt();
	    if ( x < xmin ) xmin = x;
	    if ( x > xmax ) xmax = x;
	}

	System.out.println( xmax - (xmin + xmax)/2 );
    }

    public static void main( String[] a ) { new Main().solve(); }
}

