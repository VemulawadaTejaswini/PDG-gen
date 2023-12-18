import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	Map<String, Integer> map = new HashMap<String, Integer>();

	String longStr = "";

	while ( stdin.hasNext() ) {
	    final String key = stdin.next();
	    if ( map.containsKey( key ) ) {
		map.put( key, map.get( key ) + 1 );
	    } else {
		map.put( key, 1 );
	    }
	    if ( longStr.length() < key.length() ) {
		longStr = key;
	    }
	}

	String maxFreqStr = "";
	int maxFreq = 0;
	for ( String str : map.keySet() ) {
	    if ( maxFreq < map.get( str ) ) {
		maxFreqStr = str;
		maxFreq = map.get( str );
	    }
	}
	System.out.printf("%s %s\n", maxFreqStr, longStr);
	
    }    
}