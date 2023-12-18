import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextDouble() ) {

	    double a = stdin.nextDouble();
	    double sum = a;
	    for ( int i = 2; i <= 10; i++ ) {
		if ( i % 2 == 0 ) {
		    a *= 2; 
		} else {
		    a /= 3;
		}
		sum += a;
	    }
	    System.out.println( sum );	    
	}	
    }    
}