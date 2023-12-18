import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextInt() ) {
	    int[] in = new int[4];
	    int[] think = new int[4];

	    for ( int j = 0; j < 4; j++ ) {
		in[j] = stdin.nextInt();
	    }
	    for ( int j = 0; j < 4; j++ ) {
		think[j] = stdin.nextInt();
	    }
	    
	    int hit = 0;
	    int brow = 0;
	    for ( int i = 0; i < 4; i++ ) {
		if ( in[i] == think[i] ) {
		    hit++;
		} else if ( contains( in[i], think ) ) {
		    brow++;
		}
	    }
	    System.out.printf( "%d %d\n", hit, brow );
	}	   
    }

    static boolean contains( int num, int[] array ) {
	for ( int i : array ) {
	    if ( num == i ) {
		return true;
	    }
	}
	return false;
    }
    
}