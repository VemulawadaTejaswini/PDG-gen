import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( stdin.hasNextInt() ) {

	    final int a = stdin.nextInt();
	    final int b = stdin.nextInt();

	    System.out.println( a + b );	    
	}	
    }    
}