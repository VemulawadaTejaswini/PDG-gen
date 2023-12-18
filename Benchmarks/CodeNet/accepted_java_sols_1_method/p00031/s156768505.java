import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNext() ) {
	    int n = stdin.nextInt();
	    if ( n > 0 ) {
		boolean first = true;
		int weight = 1;
		while ( n > 0 ) {
		    if ( n % 2 == 1 ) {
			if ( first ) {
			    System.out.print( weight );
			} else {
			    System.out.print( " " + weight );
			}
			first = false;
		    }
		    n /= 2;
		    weight *= 2;
		}
		System.out.println();
	    } else {
		System.out.println( 0 );
	    }
	}
	
    }
    
}