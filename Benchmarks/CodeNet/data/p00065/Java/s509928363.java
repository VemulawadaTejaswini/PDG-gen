import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);
	Map<Integer, Integer> cur = new HashMap<Integer, Integer>();
	Map<Integer, Integer> next = new HashMap<Integer, Integer>();
	
	while ( true ) {

	    String line = stdin.nextLine();
	    if ( line.equals( "" ) ) {
		break;
	    }
	    String[] input = line.split( "," );
	    int val = Integer.parseInt( input[0] );
	    if ( !cur.containsKey( val ) ) {
		cur.put( val, 1 );
	    } else {
		cur.put( val, cur.get( val ) );
	    }	    
	}

	while ( stdin.hasNextLine() ) {
	    String[] input = stdin.nextLine().split( "," );
	    int val = Integer.parseInt( input[0] );
	    if ( !next.containsKey( val ) ) {
		next.put( val, 1 );
	    } else {
		next.put( val, next.get( val ) + 1 );
	    }	    
	}

	final ArrayList<Integer> keyArray = new ArrayList<Integer>( next.keySet() );
	Collections.sort( keyArray );
	for ( Integer key : keyArray ) {
	    if ( cur.containsKey( key ) ) {
		System.out.printf( "%d %d\n", key, ( cur.get( key ) + next.get( key ) ) );
	    }
	}
	
    }
    
}