import java.io.*;
import java.util.*;
 
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
 
            String[] str = kb.readLine().split( " " );
            int n = Integer.parseInt( str[0] );
            int q = Integer.parseInt( str[1] );
			
			LinkedList<String> ps = new LinkedList<String>();
			LinkedList<Integer> times = new LinkedList<Integer>();
			
            for( int i=0; i<n; i++ ) {
                str = kb.readLine().split( " " );
                ps.offer( str[0] );
                times.offer( Integer.parseInt( str[1] ) );
            }

            StringBuilder output = new	StringBuilder( );	            
            String job;
            int time, t;
            t = 0;
            while( null != ( job = ps.peek() )) {
            	time = times.peek();
            	if( times.peek() <= q ) {
            		output.append( job );
            		output.append( " " );
            		output.append(  t + time );
            		output.append( "\n" );
            		t += time;          		
            	} else {
            		ps.offer( job );
	                times.offer( time - q );
	                t += q;           
            	}
            	ps.poll();
            	times.poll();
            }
            System.out.print( output );
             
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}