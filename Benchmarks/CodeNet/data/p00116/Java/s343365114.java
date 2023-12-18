import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( true ) {
	    final String[] input = stdin.nextLine().split( " " );
	    final int height = Integer.parseInt( input[0] );
	    final int width = Integer.parseInt( input[1] );
	    
	    if ( height == 0 && width == 0 ) {
		break;
	    }

	    final char[][] map = new char[height][];
	    
	    for ( int i = 0; i < height; i++ ) {
		map[i] = stdin.nextLine().toCharArray(); 
	    }

	    final int[][] acCol = new int[height][width];
	    for ( int r = 0; r < width; r++ ) {
		acCol[0][r] = ( map[0][r] == '.' ) ? 1 : 0;
		for ( int c = 1; c < height; c++ ) {
		    if ( map[c][r] == '.' ) {
			acCol[c][r] = acCol[c - 1][r] + 1;
		    } else {
			acCol[c][r] = 0;	
		    }
		}
	    }

	    final int[][] acRow = new int[height][width];
	    for ( int c = 0; c < height; c++ ) {
		acRow[c][0] = ( map[c][0] == '.' ) ? 1 : 0;
		for ( int r = 1; r < width; r++ ) {
		    if ( map[c][r] == '.' ) {
			acRow[c][r] = acRow[c][r - 1] + 1;
		    } else {
			acRow[c][r] = 0;	
		    }
		}
	    }

	    int maxArea = 0;
	    
	    for ( int c = 0; c < height; c++ ) {
		for ( int r = 0; r < width; r++ ) {

		    int minHeight = Integer.MAX_VALUE;
		    for ( int ri = 0; ri < acRow[c][r]; ri++) {
			final int cr = r - ri;
			minHeight = Math.min( minHeight, acCol[c][cr] );
			final int area = ( r - cr + 1 ) * minHeight;
			maxArea = Math.max( maxArea, area );
		    }
		    
		}
	    }

	    System.out.println( maxArea );
	}
    }

    static void printArray( int[][] array ) {
	for ( int[] ar : array ) {
	    System.err.println( Arrays.toString( ar ) );
	}	
    }

    static void printArray( char[][] array ) {
	for ( char[] ar : array ) {
	    System.err.println( Arrays.toString( ar ) );
	}	
    }
    
}