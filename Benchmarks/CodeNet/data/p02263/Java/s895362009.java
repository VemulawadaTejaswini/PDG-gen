import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
	    BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
	    try {
	    	Stack<Integer> stack = new Stack<Integer>();
			
		    String str = kb.readLine();
			int a, b;
		    for( String wd: str.split( " " ) ) {
			    if( "+".equals( wd ) ) {
			    	b = stack.pop();
			    	a = stack.pop();
			    	stack.push( a + b );			    
			    } else if( "-".equals( wd ) ) {
			    	b = stack.pop();
			    	a = stack.pop();
			    	stack.push( a - b );			    
			    } else if( "*".equals( wd ) ) {
			    	b = stack.pop();
			    	a = stack.pop();
			    	stack.push( a * b );			    
			    } else {
			    	stack.push( Integer.parseInt( wd ) );
			    }
		    }

            System.out.println( stack.pop() );
	    } catch( IOException e ) {
	        System.err.println( e );
	    }
	}
}