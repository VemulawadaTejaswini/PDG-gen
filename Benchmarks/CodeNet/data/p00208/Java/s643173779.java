import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

		final Scanner stdin = new Scanner( System.in );
		final long[] convert = {0, 1, 2, 3, 5, 7, 8, 9};
		
		while ( true ) {

			long n = stdin.nextLong();
			if ( n == 0L ) break;

			long maxdigit = 1;
			long n8 = 0;
			while ( n > 0 ) {
				final int val = (int)( n % 8L );
				final long digit = convert[ val ];
				n8 += maxdigit * digit;
				maxdigit *= 10L;
				n /= 8;
			}
			System.out.println( n8 );	    
		}	
    }    
}