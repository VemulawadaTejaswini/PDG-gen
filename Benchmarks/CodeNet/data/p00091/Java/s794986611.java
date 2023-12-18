import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Drop {

    static final int SMALL = 1;
    static final int MIDDLE = 2;
    static final int LARGE = 3;
    
    final int x;
    final int y;
    final int size;

    Drop ( final int x, final int y, final int size ) {
	this.x = x;
	this.y = y;
	this.size = size;
    }

    public String toString() {
	return String.format( "%d %d %d", x, y, size );
    }
}

class Main {
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int n = stdin.nextInt();
	final int[][] map = new int[10][10];
	for ( int i = 0; i < 10; i++ ) {
	    for ( int j = 0; j < 10; j++ ) {
		map[i][j] = stdin.nextInt();
	    }		
	}

	ArrayList<Drop> answer = new ArrayList<Drop>();
	dfs( map, answer, n );

	for ( Drop d : answer ) {
	    System.out.println( d );
	}
    }

    static boolean hasNoDrop( final int[][] map ){
	for ( int[] rows : map ) {
	    for ( int val : rows ) {
		if ( val != 0 ) {
		    return false;
		}
	    }
	}
	return true;
    }

    static boolean finish( int[][] map, ArrayList<Drop> answer, final int noOfDrop ) {
	return ( noOfDrop == answer.size() && hasNoDrop( map ) );
    }

    static void printMap( int[][] map ) {
	for ( int[] rows : map ) {
	    System.err.println( Arrays.toString( rows ) );
	}
    }

    static boolean hasNoDrop( int[][] map, int my ) {
	for ( int y = 0; y <= my; y++ ) {
	    for ( int val : map[y] ) {
		if ( val != 0 ) {
		    return false;
		}
	    }
	}
	return true;
    }

    static void dfs( int[][] map, ArrayList<Drop> answer, final int noOfDrop ) {

	if ( noOfDrop == answer.size() ) {
	    return;
	}

	for ( int y = 1; y < 9; y++ ) {
	    if ( y >= 3 && !hasNoDrop( map, y - 3 ) ) {
		return;
	    }
	    
	    for ( int x = 1; x < 9; x++ ) {
		if ( map[y][x] > 0 ) {
		    if ( canPutLarge( map, x, y ) ) {
			addLarge( map, x, y, -1 );
			answer.add( new Drop( x, y, Drop.LARGE ) );
			//System.err.printf( "PUT LARGE @ (%d %d)\n", x, y );
			dfs( map, answer, noOfDrop );
			if ( finish( map, answer, noOfDrop ) ) {
			    return;
			}
			addLarge( map, x, y, 1 );
			answer.remove( answer.size() - 1 );
		    }
		    if ( canPutMiddle( map, x, y ) ) {
			addMiddle( map, x, y, -1 );
			answer.add( new Drop( x, y, Drop.MIDDLE ) );
			//System.err.printf( "PUT MIDDLE @ (%d %d)\n", x, y );
			dfs( map, answer, noOfDrop );
			if ( finish( map, answer, noOfDrop ) ) {
			    return;
			}
			addMiddle( map, x, y, 1 );
			answer.remove( answer.size() - 1 );
		    }
		    if ( canPutSmall( map, x, y ) ) {
			addSmall( map, x, y, -1 );
			answer.add( new Drop( x, y, Drop.SMALL ) );
			//System.err.printf( "PUT SMALL @ (%d %d)\n", x, y );
			dfs( map, answer, noOfDrop );
			if ( finish( map, answer, noOfDrop ) ) {
			    return;
			}
			addSmall( map, x, y, 1 );
			answer.remove( answer.size() - 1 );
		    }
		}
	    }
	}
    }

    static boolean canPutSmall( int[][] map, int cx, int cy ) {
	return  map[cy][cx] > 0 && map[cy + 1][cx] > 0 &&
	    map[cy][cx + 1] > 0 && map[cy][cx - 1] > 0 && 
	    map[cy - 1][cx] > 0;
    }
    
    static void addSmall( int[][] map, int cx, int cy, int val ) {
	map[cy][cx] += val;
	map[cy + 1][cx] += val;
	map[cy][cx + 1] += val;
	map[cy][cx - 1] += val;
	map[cy - 1][cx] += val;	
    }

    static boolean canPutMiddle( int[][] map, int cx, int cy ) {
	for ( int y = cy - 1; y <= cy + 1; y++ ) {
	    for ( int x = cx - 1; x <= cx + 1; x++ ) {
		if ( map[y][x] <= 0 ) {
		    return false;
		}		    
	    }
	}
	return true;
    }
        
    static void addMiddle( int[][] map, int cx, int cy, int val ) {
	for ( int y = cy - 1; y <= cy + 1; y++ ) {
	    for ( int x = cx - 1; x <= cx + 1; x++ ) {
		map[y][x] += val;
	    }
	}
    }

    static boolean canPutLarge( int[][] map, int cx, int cy ) {
	if ( 2 <= cx && cx <= 7 && 2 <= cy && cy <= 7 ) {
	    return ( map[cy + 2][cx] > 0 && map[cy - 2][cx] > 0 && 
		     map[cy][cx + 2] > 0 && map[cy][cx - 2] > 0 &&
		     canPutMiddle( map, cx, cy ) );
	} else {
	    return false;
	}
    }    
    
    static void addLarge( int[][] map, int cx, int cy, int val ) {
	map[cy + 2][cx] += val;
	map[cy - 2][cx] += val;
	map[cy][cx + 2] += val;
	map[cy][cx - 2] += val;
	addMiddle( map, cx, cy, val );	
    }    
}