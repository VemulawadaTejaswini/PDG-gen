import java.util.*;
import java.io.*;

class Main {

    static double minRadius;
    
    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNext() ) {

	    final String[] input = stdin.nextLine().split(" ");
	    final int[] rads = new int[input.length - 1];
	    for (int i = 0; i < rads.length; ++i){
		rads[i] = Integer.parseInt( input[i + 1] );		
	    }
	    Arrays.sort( rads );
	    minRadius = Double.MAX_VALUE;
	    
	    final int boxSize = Integer.parseInt( input[0] );
	    boolean[] visited = new boolean[rads.length];
					    
	    dfs ( 0.0, 0, rads, visited, -1 );

	    if ( minRadius > boxSize ) {
		System.out.println( "NA" );
	    } else {
		System.out.println( "OK" );
	    }
	}	
    }
    
    static void dfs( final double right, final int index, final int[] rads,
		     final boolean[] visited, final int last) {

	if ( index == rads.length ) {
	    minRadius = Math.min( right + rads[last], minRadius );
	} else if ( right > minRadius ) {
	    return;
	} 
	for (int i = 0; i < rads.length; ++i){
	    if ( !visited[i] ) {
		visited[i] = true;
		if ( index > 0 ) {
		    dfs( right + 2 * Math.sqrt( rads[i] * rads[last] ), index + 1, rads, visited, i );
		} else {
		    dfs( right + rads[i], index + 1, rads, visited, i );
		}
		visited[i] = false;
	    }	    
	}
    }
    
}