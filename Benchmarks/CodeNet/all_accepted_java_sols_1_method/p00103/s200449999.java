import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {
	
	Scanner stdin = new Scanner(System.in);
	final int T = stdin.nextInt();

	for ( int t = 0; t < T; t++ ) {
	    final boolean[] b = new boolean[3];
	    int noOfOut = 0;
	    int score = 0;
	    while ( noOfOut < 3 ) {
		final String s = stdin.next();

		if ( "HIT".equals(s) ){
		    if ( b[2] ) {
			b[2] = false;
			score++;
		    }
		    b[2] = b[1];
		    b[1] = b[0];
		    b[0] = true;
		} else if( "HOMERUN".equals(s) ){
		    score++;
		    if ( b[0] ) score++;
		    if ( b[1] ) score++;
		    if ( b[2] ) score++;
		    Arrays.fill(b, false);
		} else if( "OUT".equals(s) ){
		    noOfOut++;
		}
	    }
	    System.out.println(score);
	}	
    }
    
}