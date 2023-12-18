import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	int score = -1;
	for ( int i = 0; i < 2; i++ ) {
	    int pscore = 0;
	    for ( int j = 0; j < 4; j++ ) {
		pscore += stdin.nextInt();
	    }
	    score = Math.max( score, pscore );
	}
	System.out.println( score );
    }    
}