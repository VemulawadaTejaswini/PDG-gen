import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final int n = stdin.nextInt();

	int d = 0;
	while ( true ) {
	    if ( isPalindrome( n - d ) ) {
		System.out.println( n - d );
		break;
	    } else if ( isPalindrome( n + d ) ) {
		System.out.println( n + d );
		break;
	    }
	    d++;
	}	
    }

    static boolean isPalindrome( final int num ) {
	final String numStr = Integer.toString( num );
	return numStr.equals( reverse( numStr ) );
    }

    static String reverse( String str ) {
	return new StringBuilder( str ).reverse().toString();
    }
}