import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);
	while ( stdin.hasNextLine() ) {
	    
	    final char[] in = stdin.nextLine().toCharArray();
	    
	    for ( int i = 0; i < 26; i++ ) {

		for ( int j = 0; j < in.length; j++ ) {
		    if ( isAlphabet( in[j] ) ) {
			in[j] = (char)( ( in[j] + 1 - 'a' ) % 26 + 'a' );
		    }
		}
		final String str = new String( in );
		if ( str.contains( "the" ) || str.contains( "this" ) || str.contains( "that" ) ) {
		    System.out.println( str );
		    break;
		}
		
	    }	    
	}
	
    }

    static boolean isAlphabet( char ch ) {
	return 'a' <= ch && ch <= 'z';
    }
    
}