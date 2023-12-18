import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final int N = Integer.parseInt( stdin.nextLine() );
	final String target = stdin.nextLine();

	int count = 0;
	for ( int i = 0; i < N; i++ ) {
	    if ( check( target, stdin.nextLine() ) ) {
		count++;
	    }
	}
	System.out.println( count );
    }

    static boolean check( final String target, final String input ) {

	final int maxSpan = ( input.length() - target.length() ) / ( target.length() - 1 ) + 1;

	for ( int span = 1; span <= maxSpan; span++ ) {
	    for ( int index = 0; index + ( target.length() - 1 ) * span < input.length(); index++ ) {

		if ( makeString( target, input, span, index ) ) {
		    return true;
		}		
	    }	    
	}
	return false;
    }

    static boolean makeString( final String target, final String input, final int span, final int index ) {

	for ( int i = 0; i < target.length(); i++ ) {
	    if ( target.charAt( i ) != input.charAt( index + i * span ) ) {
		return false;
	    }
	}
	return true;
    }    
}