import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextLine() ) {

	    final String input = stdin.nextLine();
	    int[] n = new int[10];
	    for ( int i = 0; i < 10; i++ ) {
		n[i] = input.charAt( i ) - '0';
	    }

	    for ( int t = 9; t > 0; t-- ) {
		for ( int i = 0; i < t; i++ ) {
		    n[i] = ( n[i] + n[i + 1] ) % 10;
		}
	    }
	    System.out.println( n[0] );
	}
    }    
}