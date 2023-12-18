import java.util.*;
import java.io.*;

class Pair implements Comparable<Pair> {
    final String key;
    final int point;

    public Pair( String key, int point ) {
	this.key = key;
	this.point = point;
    }
    
    public int compareTo ( Pair p ) {
	return -Double.compare( point, p.point );
    }    
}

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	boolean first = true;
	while ( true ) {
	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    if ( !first ) {
		System.out.println();
	    } else {
		first = false;
	    }

	    ArrayList<Pair> list = new ArrayList<Pair>();
	    for ( int i = 0; i < n; i++ ) {
		final String name = stdin.next();
		final int win = stdin.nextInt();
		final int lose = stdin.nextInt();
		final int draw = stdin.nextInt();
		list.add( new Pair( name, win * 3 + draw ) );
	    }
	    Collections.sort( list );
	    for ( Pair p : list ) {
		System.out.println( p.key + "," + p.point );
	    }
	}	
    }    
}