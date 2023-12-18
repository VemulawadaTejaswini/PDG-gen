import java.util.*;
import java.io.*;

class Main {

    public static void main( String[] args ) {
        try {
	      	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
			int n = Integer.parseInt( kb.readLine( ) );        
			ArrayDeque<Integer> dq = new ArrayDeque<Integer>( );
            String[] str;
            for( int i=0; i<n; i++ ) {
                str = kb.readLine().split( " " );
                if( "insert".equals( str[0] ) ) {
                    dq.addFirst( Integer.parseInt( str[1] ) );
                } else if( "deleteFirst".equals( str[0] ) ) {
                    dq.removeFirst( );
                } else if( "deleteLast".equals( str[0] ) ) {
                    dq.removeLast(  );
                } else {
                    dq.removeFirstOccurrence( Integer.parseInt( str[1] ) );
                }
            }
        	
			StringBuilder output = new  StringBuilder( );
            for( Iterator itr = dq.iterator( ); itr.hasNext( ); ) {
                output.append( itr.next( ) ).append( " " );
            }
            output.deleteCharAt( output.lastIndexOf( " " ) );
            System.out.println( output );
            
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}