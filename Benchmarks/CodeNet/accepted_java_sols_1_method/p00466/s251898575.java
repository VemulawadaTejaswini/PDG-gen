import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    int sum = stdin.nextInt();

	    if ( sum == 0 ) {
		break;
	    }

	    for ( int i = 0; i < 9; i++ ) {
		sum -= stdin.nextInt();
	    }
	    System.out.println( sum );
	}	
    }    
}