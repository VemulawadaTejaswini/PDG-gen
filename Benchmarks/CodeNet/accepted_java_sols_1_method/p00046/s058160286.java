import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	double max = 0.0;
	double min = Double.MAX_VALUE;

	while ( stdin.hasNextDouble() ) {
	    double height = stdin.nextDouble();

	    max = Math.max( height, max );
	    min = Math.min( height, min );
	}
	System.out.println( max - min );
	
    }
    
}