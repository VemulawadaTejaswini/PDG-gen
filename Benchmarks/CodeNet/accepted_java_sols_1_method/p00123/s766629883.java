import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final double[] limit500 = { 35.5, 37.5, 40.0, 43.0, 50.0, 55.0, 70.0 };
	final double[] limit1000 = { 71.0, 77.0, 83.0, 89.0, 105.0, 116.0, 148.0 };
	final String[] rank = { "AAA", "AA", "A", "B", "C", "D", "E", "NA" };
	
	while ( stdin.hasNextDouble() ) {

	    final double time500 = stdin.nextDouble();
	    final double time1000 = stdin.nextDouble();
	    
	    int i = limit500.length;
	    while ( 0 < i && time500 < limit500[i - 1] && time1000 < limit1000[i - 1] ) {
		i--;
	    }
	    System.out.println( rank[i] );
	}	
    }    
}