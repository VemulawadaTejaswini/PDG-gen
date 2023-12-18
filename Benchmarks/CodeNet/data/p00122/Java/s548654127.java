import java.util.*;
import java.io.*;

class Main {

    static final int X = 0;
    static final int Y = 1;
    static final int SIZE = 10;
    static boolean success;
    
    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( true ) {

	    final int px = stdin.nextInt();
	    final int py = stdin.nextInt();

	    if( px == 0 && py == 0 ) {
		break;
	    }
	    final int n = stdin.nextInt();
	    int[][] sprinkler = new int[n][2];
	    for ( int i = 0; i < n; i++ ) {
		sprinkler[i][X] = stdin.nextInt();
		sprinkler[i][Y] = stdin.nextInt();
	    }
	    success = false;
	    if ( dfs( sprinkler, 0, px, py ) ) {
		System.out.println( "OK" );
	    } else {
		System.out.println( "NA" );
	    }
	}	
    }

    static final int[] dx = { 2, 2, 2, 1 ,0, -1, -2, -2, -2, -1, 0, 1 };
    static final int[] dy = { -1, 0, 1, 2, 2, 2, 1, 0, -1, -2, -2, -2 };
    
    static boolean dfs( final int[][] sprinkler, final int index, final int x, final int y ) {
	if ( index == sprinkler.length ) {
	    success = true;
	    return success;
	}

	for ( int i = 0; i < dx.length; i++ ) {
	    final int nx = x + dx[i];
	    final int ny = y + dy[i];
	    if ( 0 <= nx && nx < SIZE && 0 <= ny && ny < SIZE &&
		 sprinkler[index][X] - 1 <= nx && nx <= sprinkler[index][X] + 1 &&
		 sprinkler[index][Y] - 1 <= ny && ny <= sprinkler[index][Y] + 1) {
		dfs( sprinkler, index + 1, nx, ny );
		
	    }
	    if ( success ) {
		return true;
	    }
	}
	return success;
    }    
}