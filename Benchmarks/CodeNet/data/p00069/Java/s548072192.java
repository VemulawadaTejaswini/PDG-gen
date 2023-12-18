import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static boolean simulate( final int start, final int hit, final int[][] map ) {
	int current = start;
	for ( int i = 0; i < map.length; i++ ) {
	    if ( map[ i ][ current - 1 ] == 1 ) {
		current--;
	    } else if( map[ i ][ current ] == 1 ) {
		current++;
	    }
	}
	return current == hit;
    }
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = Integer.parseInt( stdin.nextLine() );
	    if ( n == 0 ) {
		break;
	    }
	    final int m = Integer.parseInt( stdin.nextLine() );
	    final int hit = Integer.parseInt( stdin.nextLine() );
	    final int d = Integer.parseInt( stdin.nextLine() );

	    int[][] map = new int[ d ][ n + 1 ];
	    for ( int i = 0; i < d; ++i ){
		final String input = stdin.nextLine();
		for ( int k = 1; k <= n - 1; k++ ) {
		    map[ i ][ k ] = input.charAt( k - 1 ) - '0';
		}
	    }

	    if ( simulate( m, hit, map ) ){
		System.out.println( 0 );
	    } else {
		solveAdd( map, m, hit, n, d );
	    }	    
	}	
    }

    static void solveAdd ( final int[][] map, final int m, final int hit, final int n, final int d ) {
	for ( int i = 0; i < d; i++ ) {
	    for ( int j = 1; j <= n - 1; j++ ) {
		if ( map[ i ][ j ] == 0 && map[ i ][ j - 1 ] == 0 && map[ i ][ j + 1 ] == 0 ) {
		    map[ i ][ j ] = 1;
		    if ( simulate( m, hit, map ) ) {
			System.out.printf( "%d %d\n", ( i + 1 ), j );
			//printMap( map );
			return;
		    }
		    map[ i ][ j ] = 0;
		}
	    }
	}
	System.out.println( 1 );
    }

    static void printMap( int[][] map ) {
	for ( int[] array : map ) {
	    System.err.println( Arrays.toString( array ) );
	}
    }    
}