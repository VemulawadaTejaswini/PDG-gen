import java.util.*;
import java.io.*;

class Main {

    static final int[] dx = {-1, 0, 1, 0};
    static final int[] dy = {0, -1, 0, 1};

    static final int LEFT = 0;
    static final int UP = 1;
    static final int RIGHT = 2;
    static final int DOWN = 3;
    static final String[] dirStr = {"L", "U", "R", "D"};
    
    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	char[][] map = new char[9][];
	for ( int i = 0; i < 9; i++ ) {
	    map[i] = stdin.nextLine().toCharArray();
	}

	int x = 0;
	int y = 0;
	int direction = -1;
	
	do {

	    if ( !hasLine( direction, map, y, x ) ) {
		for ( int i = 0; i < 4; i++ ) {
		    final int nd = ( direction + i + 3 ) % 4;
		    if ( hasLine( nd, map, y, x ) ) {
			direction = nd;
			break;
		    }
		}
	    }
	    x += dx[direction];
	    y += dy[direction];

	    System.out.print( dirStr[direction] );
	    
	} while ( x != 0 || y != 0 );
	
	System.out.println();	
    }

    static boolean hasLine( int direction, char[][] map, int y, int x ) {
	
	if ( 0 <= direction && direction < 4 ) {
	    final int nx = x + dx[direction];
	    final int ny = y + dy[direction];
	    
	    if ( 0 <= nx && nx <= map[0].length &&
		 0 <= ny && ny <= map[0].length ) {
		
		switch( direction ) {
		case RIGHT:
		    return map[y * 2][x] == '1';
		case DOWN:
		    return map[y * 2 + 1][x] == '1';
		case LEFT:
		    return map[y * 2][x - 1] == '1';
		case UP:
		    return map[y * 2 - 1][x] == '1';
		default:
		    return false;
		}
		
	    } else {
		return false;
	    }
	} else {
	    return false;
	}
    }
    
}