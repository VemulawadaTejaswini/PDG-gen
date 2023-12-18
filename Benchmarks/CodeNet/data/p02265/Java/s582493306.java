import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
			int n = Integer.parseInt( kb.readLine() );
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			
			String[] str;
            for( int i=0; i<n; i++ ) {
                str = kb.readLine().split( " " );
                if( "insert".equals( str[0] ) ) {
                	list.add( 0, Integer.parseInt( str[1] ) );
                } else if( "delete".equals( str[0] ) ) {
                	if(  -1 != list.indexOf( Integer.parseInt( str[1] ) ) ) {
                		list.remove(  );
                	}
                } else if( "deleteFirst".equals( str[0] ) ) {
                	list.remove( 0 );
                } else if( "deleteLast".equals( str[0] ) ) {
                	list.remove( list.size()-1 );
                }
            }
            
			StringBuilder output = new  StringBuilder( );
            for( int i=0; i<list.size(); i++ ) {
				output.append( list.get( i ) );
				output.append( " " );
 			}
 			output.deleteCharAt( output.lastIndexOf( " " ) );
			System.out.println( output );

	    } catch( IOException e ) {
	        System.err.println( e );
	    }
	}
}