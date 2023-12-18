import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	final int T = stdin.nextInt();

	for ( int i = 1; i <= T; i++ ) {
	    int n = stdin.nextInt();

	    System.out.printf( "Case %d:\n", i );
	    for ( int j = 0; j < 10; j++ ) {
		n = (n * n / 100) % 10000;
		System.out.println(n);
	    }	    
	    
	}	
	
    }
    
}