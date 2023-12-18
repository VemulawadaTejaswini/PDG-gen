import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	int[] in = new int[5];

	for ( int i = 0; i < 5; i++ ) {
	    in[i] = stdin.nextInt();
	}
	Arrays.sort( in );
	System.out.print( in[4] );
	for (int i = 3; i >= 0; i-- ) {
	    System.out.print( " " + in[i] );
	}
	System.out.println();
    }
    
}