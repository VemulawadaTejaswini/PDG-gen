import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final char[] ar = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', '?', '!', ' ' };
	while ( stdin.hasNextLine() ) {

	    final String line = stdin.nextLine();
	    if ( !check( line ) ) {
		System.out.print( "NA" );
	    } else {
		for ( int i = 0; i < line.length() / 2; i++ ) {
		    int f = line.charAt( 2 * i ) - '1';
		    int b = line.charAt( 2 * i + 1 ) - '1';
		    System.out.print( ar[ 5 * f + b ] );
		}
	    }
	    System.out.println();
	}
    }

    static boolean check( final String line ) {
	if ( line.length() % 2 == 1 ) {
	    return false;
	}
	for ( int i = 0; i < line.length() / 2; i++ ) {
	    int f = line.charAt( 2 * i ) - '1';
	    int b = line.charAt( 2 * i + 1 ) - '1';
	    if ( f < 0 || 6 <= f || b < 0 || 5 <= b ) {
		return false;
	    }
	}
	return true;
    }	
}