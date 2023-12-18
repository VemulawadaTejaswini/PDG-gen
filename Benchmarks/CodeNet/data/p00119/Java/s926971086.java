import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static boolean[] visited;

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final int m = stdin.nextInt();
	final int n = stdin.nextInt();

	visited = new boolean[ n + 1 ];

	ArrayList<ArrayList<Integer> > map = new ArrayList< ArrayList<Integer> >();
	for ( int i = 0; i <= m; i++ ){
	    map.add( new ArrayList<Integer>() );
	}

	for ( int i = 0; i < n; i++ ) {
	    final int from = stdin.nextInt();
	    final int to = stdin.nextInt();
	    map.get( from ).add( to );
	}
	
	ArrayList<Integer> order = new ArrayList<Integer>();
	for ( int i = 1; i <= m; i++ ) {
	    if ( !visited[ i ] ) {
		dfs( i, order, map );
	    }
	}
	for ( int i = order.size() - 1; i >= 0; i-- ) {
	    System.out.println( order.get( i ) );
	}
    }
    
    static void dfs( int i, ArrayList<Integer> order, ArrayList< ArrayList<Integer> > map ) {
	visited[ i ] = true;
	for ( int j : map.get( i ) ) {
	    if ( !visited[ j ] ) {
		dfs( j, order, map );
	    }
	}
	order.add( i );
    }
}