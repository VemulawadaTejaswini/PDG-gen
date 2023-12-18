import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( true ) {
	    int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    int count = 0;
	    while ( n != 1 ) {
		if ( n % 2 == 0 ) {
		    n /= 2;
		} else {
		    n = n * 3 + 1;
		}
		count++;
	    }
	    System.out.println( count );
	}	
    }    
}