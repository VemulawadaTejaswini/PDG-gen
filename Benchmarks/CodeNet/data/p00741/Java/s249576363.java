import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int w = stdin.nextInt();
	    final int h = stdin.nextInt();

	    if ( w == 0 && h == 0 ) {
		break;
	    }

	    boolean[][] map = new boolean[ h ][ w ];

	    for ( int i = 0; i < h; i++ ) {
		for ( int j = 0; j < w; j++ ) {
		    map[ i ][ j ] = ( stdin.nextInt() == 1 );
		}
	    }

	    int count = 0;
	    for ( int i = 0; i < h; i++ ) {
		for ( int j = 0; j < w; j++ ) {
		    if ( dfs( map, i, j ) > 0 ) {
			count++;
		    }
		}
	    }
	    System.out.println( count );
	}	
    }

    static int[] dx = { 1, 1, 1, 0, -1, -1, -1, 0 };
    static int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };
    
    static int dfs( final boolean[][] map, final int y, final int x ) {
	int count = 0;
	if ( map[ y ][ x ] ) {
	    count++;
	    map[ y ][ x ] = false;
	}
	for ( int i = 0; i < 8; i++ ) {
	    final int ny = y + dy[ i ];
	    final int nx = x + dx[ i ];

	    if ( 0 <= nx && nx < map[ 0 ].length &&
		 0 <= ny && ny < map.length &&
		 map[ ny ][ nx ] ) {

		count += dfs( map, ny, nx );		
	    }
	}
	return count;
    }    
}