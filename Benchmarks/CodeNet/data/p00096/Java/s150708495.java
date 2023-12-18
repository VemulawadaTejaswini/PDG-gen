import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextInt() ) {

	    final int n = stdin.nextInt();
	    System.out.println( solve( n ) );
	    
	}
	
    }

    static long solve( final int n ) {

	long sum = 0;
	final long end = min( 2000L, n );
	final long start = max( 0, n - 2000L );
	for ( long i = start; i <= end; i++ ) {
	    final long sumAB = i;
	    final long combAB = min( sumAB, 2000L - sumAB ) + 1;
	    final long sumCD = n - i;
	    final long combCD = min( sumCD, 2000L - sumCD ) + 1;
	    sum += combAB * combCD;
	}
	return sum;
    }
    
}