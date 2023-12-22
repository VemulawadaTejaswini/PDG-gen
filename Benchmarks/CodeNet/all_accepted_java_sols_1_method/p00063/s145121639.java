import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	int count = 0;
	while ( stdin.hasNext() ) {

	    final String input = stdin.nextLine();
	    final String reverse = new StringBuilder( input ).reverse().toString();
	    if ( input.equals( reverse ) ) {
		count++;
	    }	    
	}
	System.out.println( count );
    }
    
}