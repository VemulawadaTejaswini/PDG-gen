import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( true ) {
	    long n = stdin.nextLong();
	    if ( n == 0L ) {
		break;
	    }

	    long count = 0;
	    while ( n > 0 ) {
		count += n / 5L;
		n /= 5L;
	    }

	    System.out.println( count );
	    
	}
	
    }
    
}