import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static int gcd( final int a, final int b ) {
	if ( a < b ) {
	    return gcd( b, a );
	} else if ( b == 0 ) {
	    return a;
	} else {
	    return gcd( b, a % b );
	}	
    }

    static int lcm( final int a, final int b ) {
	return a / gcd( a, b ) * b;
    }
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = stdin.nextInt();
	    final int a = stdin.nextInt();
	    final int b = stdin.nextInt();

	    if ( n == 0 && a == 0 && b == 0 ) {
		break;
	    }

	    if ( gcd( a, b ) == 1 ) {
		final int lcm = lcm( a, b );
		boolean[] bs = new boolean[ lcm + 1 ];
		for ( int i = 0; i <= lcm; i += a ) {
		    for ( int j = 0; i + j <= lcm; j += b ) {
			bs[ i + j ] = true;
		    }
		}
		int count = 0;
		for ( boolean val : bs ) {
		    if ( !val ) {
			count++;
		    }
		}
		System.out.println( count );					    
	    } else {
		final int ans = n - ( n / a ) - ( n / b ) + ( n / lcm( a, b ) );
		System.out.println( ans );
	    }
	}
    }    
}