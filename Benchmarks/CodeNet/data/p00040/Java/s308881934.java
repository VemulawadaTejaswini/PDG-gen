import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	final int T = Integer.parseInt( stdin.nextLine() );
	for ( int t = 0; t < T; t++ ) {
	    
	    final String input = stdin.nextLine();
	    for ( int j = 0; j < 26; j++ ) {
		for ( int i = 0; i < 26; i++ ) {
		    final String transInput = next( input, i, j );
		    //System.err.println( transInput );
		    if ( transInput.contains( "that" ) || transInput.contains( "this" ) ) {
			System.out.println( transInput );
			break;
		    }								
		}
	    }
	}	
    }

    static String next( String input, int alpha, int beta ) {
	char[] ar = input.toCharArray();
	for ( int i = 0; i < ar.length; i++ ) {
	    if ( 'a' <= ar[i] && ar[i] <= 'z' ) {
		ar[i] = ( char )( ( ( ar[i] - 'a') * alpha + beta ) % 26 + 'a' );
	    }
	}
	return new String( ar );
    }    
}