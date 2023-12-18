import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	int T = stdin.nextInt();
	for ( int t = 0; t < T; t++ ) {
	    int[] ar = new int[10];
	    for (int i = 0; i < ar.length; ++i){
		ar[i] = stdin.nextInt();
	    }

	    boolean success = false;
	    for ( int i = 0; i < (1 << 10); i++ ) {
		if ( success( ar, i ) ){
		    success = true;
		    break;
		}
	    }
	    if ( success ) {
		System.out.println( "YES" );
	    } else {
		System.out.println( "NO" );
	    }
	    
	}	
    }

    static boolean success( int[] array, int n ) {
	int left = -1;
	int right = -1;
	for ( int i = 0; i < array.length; i++ ) {
	    if ( n % 2 == 1 ) {
		if ( left < array[i] ) {
		    left = array[i];
		} else {
		    return false;
		}
	    } else {
		if ( right < array[i] ) {
		    right = array[i];
		} else {
		    return false;
		}
	    }
	    n /= 2;
	}
	return true;
    }    
}