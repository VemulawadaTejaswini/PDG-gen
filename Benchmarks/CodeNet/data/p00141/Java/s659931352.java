import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	final int d = stdin.nextInt();

	int[] dx = {0, 1, 0, -1};
	int[] dy = {-1, 0, 1, 0};
	final int UP = 0;
	final int RIGHT = 1;
	final int DOWN = 2;
	final int LEFT = 3;
	
	for ( int t = 0; t < d; t++ ) {

	    final int n = stdin.nextInt();
	    char[][] map = new char[n][n];
	    for ( char[] array : map ) {
		Arrays.fill( array, ' ' );
	    }

	    int x = 0;
	    int y = n;
	    int dir = UP;

	    int[] move = getMoveDistance( n );		

	    for ( int i = 0; i < n; i++ ) {
		for ( int j = 0; j < move[i]; j++ ) {
		    x += dx[dir];
		    y += dy[dir];
		    map[y][x] = '#';
		}
		dir = ( dir + 1 ) % 4; 
	    }
	    for ( char[] array : map ) {
		System.out.println( new String( array ) );
	    }
	    if ( t < d - 1 ) {
		System.out.println();
	    }
	}	
    }

    static int[] getMoveDistance( final int n ) {

	if ( n == 1 ) {
	    int[] ans = {1};
	    return ans; 
	} else {
	    int[] ans = new int[n];
	    ans[0] = n;
	    int rest = n;
	    rest -= 1;
	    for ( int index = 1; index < n; ) {
		ans[index] = rest;
		index++;
		if ( index >= n ) {
		    break;
		}
		ans[index] = rest;
		index++;
		rest -= 2;
	    }
	    return ans;
	}
    }    
}