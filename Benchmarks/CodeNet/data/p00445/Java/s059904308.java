import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( stdin.hasNextLine() ) {

	    final String input = stdin.nextLine();

	    final ArrayList<Integer> indicesOfJ = getIndicesOf( 'J', input );
	    int jCount = 0;
	    for ( int i : indicesOfJ ) {
		if ( input.startsWith( "JOI", i ) ){
		    jCount++;
		}			
	    }

	    final ArrayList<Integer> indicesOfI = getIndicesOf( 'I', input );
	    int iCount = 0;
	    for ( int i : indicesOfI ) {
		if ( input.startsWith( "IOI", i ) ) {
		    iCount++;
		}
	    }
	    System.out.println( jCount );
	    System.out.println( iCount );
	}	
    }

    public static ArrayList<Integer> getIndicesOf( char ch, String input ) {
	final ArrayList<Integer> indices = new ArrayList<Integer>();

	for ( int i = 0; i < input.length(); i++ ) {
	    if ( input.charAt( i ) == ch ) {
		indices.add( i );
	    }
	}
	
	return indices;
    }    
}