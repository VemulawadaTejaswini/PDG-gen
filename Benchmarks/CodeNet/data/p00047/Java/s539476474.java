import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	boolean[] inside = new boolean[3];
	inside[0] = true;

	while ( stdin.hasNextLine() ) {

	    String input[] = stdin.nextLine().split( "," );
	    swap( inside, index( input[0] ), index( input[1] ) );	    
	}
	final String[] val = { "A", "B", "C" };
	for ( int i = 0; i < 3; i++ ) {
	    if ( inside[i] ) {
		System.out.println( val[i] );
	    }
	}
    }

    static void swap( boolean[] ar, int i1, int i2 ) {
	final boolean vi1 = ar[i1];
	ar[i1] = ar[i2];
	ar[i2] = vi1;			       
    }
    
    static int index( String s ){
	if ( "A".equals( s ) ){
	    return 0;
	} else if ( "B".equals( s ) ){
	    return 1;
	} else {
	    return 2;
	}
    }
    
}