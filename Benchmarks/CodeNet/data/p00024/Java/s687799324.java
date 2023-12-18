import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	while ( stdin.hasNextDouble() ) {

	    final double minV = stdin.nextDouble();
	    final double t = minV / 9.8;
	    final double y = 4.9 * t * t;
	    for ( int i = 0; i < 100000; i++ ) {
		if ( y <= 5 * i - 5 ) {
		    System.out.println( i );
		    break;
		}
	    }
	}	
    }    
}