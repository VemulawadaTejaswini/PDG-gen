import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	int w = 0;
	int k = 0;

	int[] scores = new int[ 10 ];
	for ( int i = 0; i < 10; i++ ) {
	    scores[ i ] = stdin.nextInt();
	}
	Arrays.sort( scores );
	w = scores[ 9 ] + scores[ 8 ] + scores[ 7 ];
	
	for ( int i = 0; i < 10; i++ ) {
	    scores[ i ] = stdin.nextInt();
	}
	Arrays.sort( scores );
	k = scores[ 9 ] + scores[ 8 ] + scores[ 7 ];

	System.out.printf( "%d %d\n", w, k );
    }    
}