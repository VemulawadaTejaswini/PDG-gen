import java.util.*;
import java.io.*;

class Main {

    public static void main( String[] args ) {

	Scanner stdin = new Scanner(System.in);

	while ( true ) {
	    int[] size = new int[3];
	    size[0] = stdin.nextInt();
	    size[1] = stdin.nextInt();
	    size[2] = stdin.nextInt();

	    if ( size[0] == 0 && size[1] == 0 && size[2] == 0 ) {
		break;
	    }

	    Arrays.sort( size );
	    
	    int n = stdin.nextInt();
	    for ( int i = 0; i < n; i++ ) {
		int r = stdin.nextInt();
		
		if ( size[0] * size[0] + size[1] * size[1] < r * r * 4 ) {
		    System.out.println( "OK" );
		} else {
		    System.out.println( "NA" );
		}
	    }
	    
	}
	
    }
    
}