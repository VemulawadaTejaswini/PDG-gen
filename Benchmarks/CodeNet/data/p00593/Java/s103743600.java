import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static final int UR = 0;
    static final int DL = 1;
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	int turn = 1;
	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ){
		break;
	    }
	    final int[][] map = new int[ n ][ n ];
	    map[ 0 ][ 0 ] = 1;
	    int x = 1;
	    int y = 0;
	    int num = 2;
	    int dir = DL;
	    for ( int i = 0; i < 10; i++ ) {
	    //while ( num <= n * n ) {
		if ( dir == DL ) {
		    while ( canMove( x, y, n ) ) {
			map[ y ][ x ] = num;			     
			num++;
			x--;
			y++;
		    }
		    x++;
		    y--;
		    if ( x == 0 && y == n - 1 ) {
			x++;
		    } else if ( x == 0 ) {
			y++;
		    } else {
			x++;
		    }
		    dir = UR;
		} else { // if ( dir == UR ) {
		    while ( canMove( x, y, n ) ) {
			map[ y ][ x ] = num;
			num++;
			x++;
			y--;
		    }
		    x--;
		    y++;
		    if ( y == 0 && x == n - 1 ){
			y++;
		    } else if ( y == 0 ){
			x++;
		    } else {
			y++;
		    }
		    dir = DL;
		}
	    }

	    System.out.printf( "Case %d:\n", turn );
	    for ( int i = 0; i < n; i++ ){
		for ( int j = 0; j < n; j++ ) {
		    System.out.printf( "%3d", map[ i ][ j ] );
		}
		System.out.println();
	    }		
	    turn++;
	}	
    }

    public static boolean canMove( final int x, final int y, final int n ) {
	return ( 0 <= x && x < n && 0 <= y && y < n );
    }
}