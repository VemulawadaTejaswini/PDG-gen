import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
	        String word = kb.readLine();
	        word = word.toUpperCase();
	        
	        String str;
	        int cnt = 0;
	       	boolean endoftext = false;
	       	int i=0;
	        while( null != ( str = kb.readLine() ) ) {
	        	for( String wd: str.split( " ", 0 ) ) {
					if( wd.equals( "END_OF_TEXT" ) ) {
		        		endoftext = true;
		        		break;
		        	}
		        	wd = wd.toUpperCase();
		        	i++;
		        	if( wd.equals( word ) ) {
		        		cnt++;
		        	}
		        }
	        	if( endoftext ) { break; }
	        }
			System.out.println( cnt );
			
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}