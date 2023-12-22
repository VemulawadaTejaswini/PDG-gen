import java.util.*;
import java.io.*;

class Main {

    public static void main( String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	String[] input = stdin.nextLine().split( "[, .]" );
	StringBuilder sb = new StringBuilder();
	
	for ( String str : input ) {
	    if ( 3 <= str.length() && str.length() <= 6 ) {
		sb.append( str );
		sb.append( " " );
	    }
	}
	System.out.println( sb.toString().trim() );	
    }
}