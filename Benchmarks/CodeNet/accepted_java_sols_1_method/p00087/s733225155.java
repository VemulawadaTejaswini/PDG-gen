import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextLine() ) {
	    
	    final String[] input = stdin.nextLine().split( " " );
	    final Stack<Double> stack = new Stack<Double>();

	    for ( String token : input ) {
		if ( "+".equals( token ) ) {
		    stack.push( stack.pop() + stack.pop() );
		} else if ( "-".equals( token ) ) {
		    stack.push( -stack.pop() + stack.pop() );
		} else if ( "*".equals( token ) ) {
		    stack.push( stack.pop() * stack.pop() );
		} else if ( "/".equals( token ) ) {
		    stack.push( 1.0 / stack.pop() * stack.pop() );
		} else {
		    stack.push( Double.parseDouble( token ) );
		}
	    }
	    System.out.println( stack.pop() );
	}
	
    }
    
}