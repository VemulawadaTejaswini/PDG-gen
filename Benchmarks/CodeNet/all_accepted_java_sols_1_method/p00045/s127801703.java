import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	int m = 0;
	int sumNum = 0;
	int line = 0;

	while ( stdin.hasNextLine() ) {

	    final String[] input = stdin.nextLine().split( "," );
	    final int mpn = Integer.parseInt( input[0] );
	    final int num = Integer.parseInt( input[1] );
	    m += mpn * num;
	    sumNum += num;
	    line++;
	    
	}
	System.out.println( m );
	System.out.println( ( int )Math.round( ( double )sumNum / ( double )line ) );
    }
    
}