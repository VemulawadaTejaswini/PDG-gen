import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    int[][] map = new int[n][n];
	    int x = n / 2;
	    int y = n / 2 + 1;
	    for ( int i = 1; i <= n * n; i++ ) {
		map[y][x] = i;
		final int ny = ( y + 1 ) % n;
		final int nx = ( x + 1 ) % n;
		if ( map[ny][nx] > 0 ) {
		    y = ( y + 2 ) % n;
		} else {
		    y = ny;
		    x = nx;
		}
	    }
	    for ( int[] rows : map ) {
		for ( int row = 0; row < rows.length; row++ ) {
		    System.out.printf( "%4d", rows[row] );
		}
		System.out.println();
	    }
	}
	
    }
    
}