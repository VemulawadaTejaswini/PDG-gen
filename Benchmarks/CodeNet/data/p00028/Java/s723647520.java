import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	int[] count = new int[101];
	Scanner stdin = new Scanner( System.in );
	while ( stdin.hasNextInt() ) {
	    count[stdin.nextInt()]++;
	}

	final int max = max( count );
	for ( int i = 0; i < count.length; i++ ) {
	    if ( count[i] == max ) {
		System.out.println( i );
	    }
	}
	
    }

    static int max( int[] array ) {
	int max = 0;
	for ( int i : array ) {
	    if ( max < i ) {
		max = i;
	    }
	}
	return max;
    }
    
}