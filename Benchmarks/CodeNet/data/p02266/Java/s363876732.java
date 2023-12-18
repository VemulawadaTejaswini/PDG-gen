import java.util.*;
import java.io.*;

class Pool {
	int position;
	int area;
	
	public Pool( int p, int a )
	{
		this.position = p;
		this.area = a;
	}
	public int getPosition( ) 
	{
		return this.position;
	}
	public int getArea( ) 
	{
		return this.area;	
	}
} 

class Main {

    public static void main( String[] args ) {
        try {
	      	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
			String buf = kb.readLine( );
			     
			ArrayDeque<Integer> stack = new ArrayDeque<Integer>( );
			ArrayDeque<Pool> areas = new ArrayDeque<Pool>( );
			int sum = 0;
            for( int i=0; i<buf.length( ); i++ ) {
				if( '\\' == buf.charAt( i ) ) {
					stack.push( Integer.valueOf( i ) );
				} else if( !stack.isEmpty( ) && '/' == buf.charAt( i ) ) {
					int j = stack.pop( ).intValue( );
					int pool = i - j;
					sum += pool;
					while( !areas.isEmpty( ) ) {
						Pool t = areas.getFirst( );
						if( j < t.getPosition( ) ) {
							pool += t.getArea( );
							areas.pop( );
						} else {
							break;
						}
					}
					areas.push( new Pool( j, pool ) );
				}
			}
			
			StringBuilder output = new  StringBuilder( );
			output.append( sum ).append( "\n" );
			output.append( areas.size( ) );
            while( !areas.isEmpty( ) ) {
            	output.append( " " ).append( areas.removeLast( ).getArea( ) );
            }
            System.out.println( output );
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}