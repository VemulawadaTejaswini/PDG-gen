import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	final int n = stdin.nextInt();

	for ( int i = 0; i < n; i++ ) {
	    int[][] map = new int[9][9];
	    for ( int c = 0; c < 9; c++ ) {
		for ( int r = 0; r < 9; r++ ) {
		    map[c][r] = stdin.nextInt();
		}
	    }

	    boolean[][] ok = new boolean[9][9];
	    for ( int c = 0; c < 9; c++ ) {
		Arrays.fill( ok[c], true );
	    }

	    for ( int r = 0; r < 9; r++ ) {
		for ( int c = 0; c < 9; c++ ) {
		    if ( checkCol( r, c, map ) ) {
			ok[c][r] = false;
		    } 
		}
	    }

	    for ( int c = 0; c < 9; c++ ) {
		for ( int r = 0; r < 9; r++ ) {
		    if ( checkRow( r, c, map ) ) {
			ok[c][r] = false;
		    } 
		}
	    }

	    for ( int c = 0; c < 9; c++ ) {
		for ( int r = 0; r < 9; r++ ) {
		    if ( checkGrid( r, c, map ) ) {
			ok[c][r] = false;
		    } 
		}
	    }

	    for ( int c = 0; c < 9; c++ ) {
		for ( int r = 0; r < 9; r++ ) {
		    if ( ok[c][r] ) {
			System.out.print(" ");
		    } else {
			System.out.print("*");
		    }
		    System.out.print( map[c][r] );
		}
		System.out.println();
	    }

	    if ( i < n - 1 ) {
		System.out.println();
	    }
	    
	}	
    }

    static boolean checkCol( int r, int c, int[][] map ) {
	for ( int i = 0; i < 9; i++ ) {
	    if ( i != c && map[c][r] == map[i][r] ) {
		return true;
	    }
	}
	return false;
    }

    static boolean checkRow( int r, int c, int[][] map ) {
	for ( int i = 0; i < 9; i++ ) {
	    if ( i != r && map[c][r] == map[c][i] ) {
		return true;
	    }
	}
	return false;
    }

    static boolean checkGrid( int r, int c, int[][] map ) {
	final int ic = c / 3;
	final int ir = r / 3;

	for ( int i = ic * 3; i < (ic + 1) * 3; i++ ) {
	    for ( int j = ir * 3; j < (ir + 1) * 3; j++ ) {
		if ( i != c && j != r && map[c][r] == map[i][j] ) {
		    return true;
		}
	    }
	}
	
	return false;
    }
    
}