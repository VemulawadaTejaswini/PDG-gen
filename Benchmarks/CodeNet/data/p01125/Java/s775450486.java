import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int[] dx = { 0, -1, 0, 1 };
	final int[] dy = { 1, 0, -1, 0 };
	
	while ( true ) {
	    final int N = stdin.nextInt();
	    if ( N == 0 ) {
		break;
	    }
	    boolean[][] map = new boolean[21][21];
	    for ( int i = 0; i < N; i++ ) {
		final int x = stdin.nextInt();
		final int y = stdin.nextInt();
		map[y][x] = true;
	    }
	    final int M = stdin.nextInt();
	    int x = 10;
	    int y = 10;
	    for ( int j = 0; j < M; j++ ) {
		final int dir = getIndex( stdin.next() );
		final int dist = stdin.nextInt();
		for ( int i = 0; i < dist; i++ ) {
		    x += dx[dir];
		    y += dy[dir];
		    map[y][x] = false;
		}
		//System.err.printf( "(y, x) = (%d, %d)\n", y, x );
	    }
	    if ( isFalseAll( map ) ) {
		System.out.println( "Yes" );
	    } else {
		System.out.println( "No" );
	    }
	    //printMap( map );
	}
    }

    static void printMap( boolean[][] map ) {
	for ( boolean[] array : map ) {
	    System.err.println( Arrays.toString( array ) );
	}
    }

    static boolean isFalseAll( boolean[][] map ) {
	for ( boolean[] array : map ) {
	    for ( boolean val : array ) {
		if ( val ) {
		    return false;
		}
	    }
	}
	return true;
    }

    static int getIndex( String dir ) {
	//System.err.println( dir );
	if ( "N".equals( dir ) ) {
	    return 0;
	} else if ( "W".equals( dir ) ) {
	    return 1;
	} else if ( "S".equals( dir ) ) {
	    return 2;	    
	} else { // if "E".equals( dir ) {
	    return 3;
	}
    }    
}