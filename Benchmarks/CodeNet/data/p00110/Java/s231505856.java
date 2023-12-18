import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextLine() ) {
	    final String input = stdin.nextLine();

	    boolean flag = true;
	    for ( char ch = '0'; ch <= '9'; ch++ ) {
		String replaced = input.replace( 'X', ch );
		String[] splited = replaced.split( "[+=]" );
		if ( !isFrontZero( splited ) && sumEqual( splited ) ) {
		    System.out.println( ch );
		    flag = false;
		    break;
		}
	    }
	    if ( flag ) {
		System.out.println( "NA" );
	    }
	}
    }

    static boolean isFrontZero ( String[] array ){
	for ( String str : array ) {
	    if ( str.length() >= 2 && str.charAt( 0 ) == '0' ) {
		return true;
	    }
	}
	return false;
    }

    static boolean sumEqual ( String[] array ) {
	final BigInteger a = new BigInteger( array[0] );
	final BigInteger b = new BigInteger( array[1] );
	final BigInteger c = new BigInteger( array[2] );
	return a.add( b ).equals( c );
    }    
}