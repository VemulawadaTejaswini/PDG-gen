import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final Stack<Integer> stack = new Stack<Integer>();
	
	while ( stdin.hasNextLine() ) {
	    final String input = stdin.nextLine().trim();
	    if ( new Scanner( input ).hasNextInt() ) {
		stack.push( Integer.parseInt( input ) );
	    } else {
		if ( "+".equals( input ) ) {
		    final int before = stack.pop();
		    final int next = Integer.parseInt( stdin.nextLine().trim() );
		    stack.push( before + next );
		} else if( "-".equals( input ) ) {
		    final int before = stack.pop();
		    final int next = Integer.parseInt( stdin.nextLine().trim() );
		    stack.push( before - next );
		} else if( "*".equals( input ) ) {
		    final int before = stack.pop();
		    final int next = Integer.parseInt( stdin.nextLine().trim() );
		    stack.push( before * next );
		} else if( "/".equals( input ) ) {
		    final int before = stack.pop();
		    final int next = Integer.parseInt( stdin.nextLine().trim() );
		    stack.push( before / next );
		}
	    }
	}
	System.out.println( stack.pop() );
    }    
}