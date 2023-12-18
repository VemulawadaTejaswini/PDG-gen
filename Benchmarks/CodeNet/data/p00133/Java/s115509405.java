import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	char[][] map = new char[8][];
	for ( int i = 0; i < 8; i++ ) {
	    map[i] = stdin.nextLine().toCharArray();
	}

	System.out.println(90);
	for ( int i = 0; i < 8; ++i ){
	    for( int j = 7; j >= 0; j-- ) {
		System.out.print( map[j][i] );
	    }
	    System.out.println();
	}
	
	System.out.println(180);
	for ( int i = 7; i >= 0; i-- ){
	    for( int j = 7; j >= 0; j-- ) {
		System.out.print( map[i][j] );
	    }
	    System.out.println();
	}
	
	System.out.println(270);
	for ( int i = 7; i >= 0; i-- ){
	    for( int j = 0; j < 8; j++ ) {
		System.out.print( map[j][i] );
	    }
	    System.out.println();
	}
    }    
}