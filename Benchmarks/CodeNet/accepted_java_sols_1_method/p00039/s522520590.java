import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	Map<Character, Integer> map = new HashMap<Character, Integer>();
	map.put( 'I', 1 );
	map.put( 'V', 5 );
	map.put( 'X', 10 );
	map.put( 'L', 50 );
	map.put( 'C', 100 );
	map.put( 'D', 500 );
	map.put( 'M', 1000 );

	while ( stdin.hasNextLine() ){
	    char[] line = stdin.nextLine().toCharArray();
	    int[] vals = new int[line.length];
	    for ( int i = 0; i < line.length; i++ ) {
		vals[i] = map.get( line[i] );
	    }
	    int sum = 0;
	    for ( int i = 0; i < line.length - 1; i++ ) {
		if ( vals[i] < vals[i + 1] ) {
		    sum -= vals[i];
		} else {
		    sum += vals[i];
		}
	    }
	    sum += vals[vals.length - 1];
	    System.out.println( sum );
	}
	
    }
    
}