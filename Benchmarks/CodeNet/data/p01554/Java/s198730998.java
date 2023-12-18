import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static final boolean OPEN = true;
    static final boolean CLOSE = false;

    static final String toString( final boolean state ) {
	return state == CLOSE ? "Opened by %s\n" : "Closed by %s\n";
    }
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int N = Integer.parseInt( stdin.nextLine() );
	Set<String> dict = new HashSet<String>();
	for ( int i = 0; i < N; i++ ) {
	    dict.add( stdin.nextLine() );
	}
	
	boolean state = CLOSE;
	final int M = Integer.parseInt( stdin.nextLine() );
	for ( int i = 0; i < M; i++ ) {
	    final String id = stdin.nextLine();
	    if ( dict.contains( id ) ) {
		System.out.printf( toString( state ), id );
		state = !state;
	    } else {
		System.out.printf( "Unknown %s\n", id );
	    }
	}	
    }    
}