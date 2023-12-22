import java.util.*;
import java.io.*;

class Main {

    static final int A = 0;
    static final int B = 1;
    static final int AB = 2;
    static final int O = 3;
    
    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	int[] sum = new int[4];

	while ( stdin.hasNextLine() ) {

	    final String[] input = stdin.nextLine().split( "," );
	    if ( "A".equals( input[1] ) ) {
		sum[A]++;
	    } else if ( "B".equals( input[1] ) ) {
		sum[B]++;
	    } else if ( "AB".equals( input[1] ) ) {
		sum[AB]++;
	    } else {
		sum[O]++;
	    }
	    
	}

	System.out.println( sum[A] );
	System.out.println( sum[B] );
	System.out.println( sum[AB] );
	System.out.println( sum[O] );
	
    }
    
}