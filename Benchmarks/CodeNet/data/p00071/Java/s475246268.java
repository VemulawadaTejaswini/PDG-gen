import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final int n = Integer.parseInt( stdin.nextLine() );

	for ( int t = 1; t <= n; t++ ) {
	    stdin.nextLine();
	    char[][] map = new char[8][];
	    for ( int j = 0; j < 8; j++ ) {
		map[j] = stdin.nextLine().toCharArray();
	    }
	    final int x = Integer.parseInt( stdin.nextLine() ) - 1;
	    final int y = Integer.parseInt( stdin.nextLine() ) - 1;

	    dfs( map, y, x );
	    System.out.printf( "Data %d:\n", t );
	    for ( int i = 0; i < map.length; i++ ) {
		for ( int j = 0; j < map[i].length; j++ ) {
		    System.out.print( map[i][j] );
		}
		System.out.println();
	    }
	}	
    }

    static void dfs( char[][] map, int y, int x ) {

	map[y][x] = '0';
	
	final int minX = max( x - 3, 0 );
	final int maxX = min( x + 3, 7 );
	final int minY = max( y - 3, 0 );
	final int maxY = min( y + 3, 7 );

	for ( int i = minX; i <= maxX; i++ ) {
	    if ( map[y][i] == '1' ) {
		dfs( map, y, i );
	    }
	}
	for ( int i = minY; i <= maxY; i++ ) {
	    if ( map[i][x] == '1' ) {
		dfs( map, i, x );
	    }
	}	
    }    
}