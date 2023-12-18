import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	boolean[] submitted = new boolean[ 31 ];

	for ( int i = 0; i < 28; i++ ) {
	    submitted[ stdin.nextInt() ] = true;
	}

	for ( int i = 1; i <= 30; i++ ) {
	    if ( !submitted[ i ] ) {
		System.out.println( i );
	    }
	}
    }    
}