import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	final int T = stdin.nextInt();

	for ( int i = 0; i < T; i++ ) {

	    int n = stdin.nextInt();
	    int[] up = new int[8];
	    for ( int j = 0; j < 8; j++ ) {
		up[j] = n % 10;
		n /= 10;
	    }
	    Arrays.sort( up );
	    
	    int max = 0;
	    for ( int j = 7; j >= 0; j-- ) {
		max = max * 10 + up[j];
	    }

	    int min = 0;
	    for ( int j = 0; j < 8; j++ ) {
		min = min * 10 + up[j];
	    }

	    System.out.println( max - min );	    
	}
	
    }
    
}