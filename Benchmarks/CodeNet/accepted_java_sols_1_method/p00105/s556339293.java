import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);
	
	HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

	while ( stdin.hasNext() ) {
	    final String in = stdin.nextLine();
	    final String[] splits = in.split(" ");
	    final String word = splits[0];
	    final int page = Integer.parseInt(splits[1]);

	    if ( !map.containsKey( word ) ) {
		map.put( word, new ArrayList<Integer>() );
	    }
	    map.get( word ).add( page );
	}
	ArrayList<String> keys = new ArrayList<String>();
	keys.addAll( map.keySet() );
	Collections.sort( keys );

	for ( String key : keys ) {
	    System.out.println( key );
	    ArrayList<Integer> pages = map.get( key );
	    Collections.sort( pages );
	    System.out.print(pages.get(0));
	    for ( int i = 1; i < pages.size(); i++ ) {
		System.out.print( " " + pages.get( i ) );
	    }
	    System.out.println();
	}
    }
    
}