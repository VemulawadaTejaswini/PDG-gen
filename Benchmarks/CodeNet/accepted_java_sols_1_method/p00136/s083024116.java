import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	int[] ar = new int[6];
	final int n = stdin.nextInt();
	for ( int i = 0; i < n; i++ ) {
	    final double w = stdin.nextDouble();
	    if ( w < 165.0 ) {
		ar[0]++;
	    } else if ( 165.0 <= w && w < 170.0 ) {
		ar[1]++;
	    } else if ( 170.0 <= w && w < 175.0 ) {
		ar[2]++;
	    } else if ( 175.0 <= w && w < 180.0 ) {
		ar[3]++;
	    } else if ( 180.0 <= w && w < 185.0 ) {
		ar[4]++;
	    } else {
		ar[5]++;
	    }
	}
	for ( int i = 0; i < 6; i++ ) {
	    System.out.printf( "%d:", i + 1 );
	    for ( int j = 0; j < ar[i]; j++ ) {
		System.out.print( "*" );
	    }
	    System.out.println();
	}
    }    
}