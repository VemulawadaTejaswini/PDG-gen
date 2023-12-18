import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final String input = stdin.nextLine();
	    if ( "0".equals( input ) ){
		break;
	    }

	    final int ans =  solve( input );
	    if ( ans >= 0 ) { 
		System.out.println( ans );
	    } else {
		System.out.println( "NA" );
	    }
	}
    }

    static int solve( final String input ){
	final ArrayList<String> before = new ArrayList<String>();
	before.add( input );
	final ArrayList<String> after = new ArrayList<String>();
	
	final Set<String> visited = new HashSet<String>();

	int count = 0;
	
	while ( !before.isEmpty() ) {
	    for ( final String str : before ) {
		if ( allSame( str ) ) {
		    return count;
		} else {
		    for ( int i = 0; i < str.length() - 1; i++ ) {
			if ( str.charAt( i ) != str.charAt( i + 1 ) ) {
			    final char[] array = str.toCharArray();
			    final char dif = getDiffColor( str.charAt( i ), str.charAt( i + 1 ) );
			    array[ i ] = array[ i + 1 ] = dif;
			    final String next = new String( array );
			    if ( !visited.contains( next ) ){
				after.add( next );
				visited.add( next );
			    }
			}
		    }
		}
	    }
	    before.clear();
	    before.addAll( after );
	    after.clear();		    
	    count++;
	}
	return -1;
    }

    static boolean allSame( final String str ) {
	final char ch = str.charAt( 0 );
	for( final char c : str.toCharArray() ) {
	    if ( c != ch ) {
		return false;
	    }
	}
	return true;
    }

    static char getDiffColor( final char ch1, final char ch2 ) {
	if ( ch1 > ch2 ) {
	    return getDiffColor( ch2, ch1 );
	}

	if ( ch1 == 'b' && ch2 == 'g' ) {
	    return 'r';
	} else if ( ch1 == 'b' && ch2 == 'r' ) {
	    return 'g';
	} else {
	    return 'b';
	}
    }    
}