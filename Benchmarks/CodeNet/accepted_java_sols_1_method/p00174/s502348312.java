import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final String input = stdin.nextLine().trim();
	    if ( "0".equals( input ) ){
		break;
	    }
	    String[] inputs = new String[ 3 ];
	    inputs[ 0 ] = input;
	    inputs[ 1 ] = stdin.nextLine();
	    inputs[ 2 ] = stdin.nextLine();
	    
	    for ( int i = 0; i < 3; i++ ) {
		int a = 0;
		int b = 0;
		for ( int j = 1; j < inputs[ i ].length(); j++ ) {
		    final char ch = inputs[ i ].charAt( j );
		    if ( 'A' == ch ) {
			a++;
		    } else {
			b++;
		    }
		}
		if ( a > b ) {
		    a++;
		} else {
		    b++;
		}				
		System.out.printf( "%d %d\n", a, b );
	    }
	}	
    }    
}