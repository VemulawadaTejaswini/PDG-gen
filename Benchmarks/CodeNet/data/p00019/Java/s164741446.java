import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	final long n = stdin.nextLong();
	System.out.println( solve( n ) );
	
    }

    static long solve( long n ) {
	if ( n <= 1 ) {
	    return 1L;
	} else {
	    return n * solve( n - 1L );
	}
    }    
}