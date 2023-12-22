import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int N = stdin.nextInt();
	int[][] number = new int[ 3 ][ N ];

	for ( int i = 0; i < N; i++ ) {
	    for ( int j = 0; j < 3; j++ ) {
		number[ j ][ i ] = stdin.nextInt();
	    }
	}

	int[] score = new int[ N ];
	for ( int i = 0; i < 3; i++ ) {
	    int[] existed = new int[ 101 ];
	    for ( final int val : number[ i ] ) {
		existed[ val ]++;
	    }
	    for ( int j = 0; j < N; j++ ) {
		if ( existed[ number[ i ][ j ] ] == 1 ) {
		    score[ j ] += number[ i ][ j ];
		}
	    }
	}

	for ( final int val : score ) {
	    System.out.println( val );
	}
    }    
}