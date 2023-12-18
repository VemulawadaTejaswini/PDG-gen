import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextLine() ) {
	    String[] input = stdin.nextLine().split( " " );

	    final double xA = Double.parseDouble( input[0] );
	    final double yA = Double.parseDouble( input[1] );
	    final double xB = Double.parseDouble( input[2] );
	    final double yB = Double.parseDouble( input[3] );
	    final double xC = Double.parseDouble( input[4] );
	    final double yC = Double.parseDouble( input[5] );
	    final double xD = Double.parseDouble( input[6] );
	    final double yD = Double.parseDouble( input[7] );

	    final double v1x = xA - xB;
	    final double v1y = yA - yB;
	    final double v2x = xC - xD;
	    final double v2y = yC - yD;

	    if ( v1x * v2x + v1y * v2y == 0.0 ) {
		System.out.println( "YES" );
	    } else {
		System.out.println( "NO" );
	    }	    
	}	
    }    
}