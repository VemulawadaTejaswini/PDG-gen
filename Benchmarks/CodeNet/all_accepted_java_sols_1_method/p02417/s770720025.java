import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			int[] Count = new int[29];
	        String str;
			while( null != ( str = kb.readLine() ) ) {
	            int len = str.length();
	            if( null == str || 0 == len ) { break; }
	            char c;
	       		for( int i=0; i<len; i++ ) {
	       			c = Character.toUpperCase( str.charAt( i ) );
	       			if(  'A' <= c && c <= 'Z' ) {
	       				Count[ c - 'A' ]++;
	       			}
	       		}
       		}
       		for( int i=0; i<26; i++ ) {
				System.out.printf( "%c : %d\n", ('a'+i ), Count[ i ] );
       		}
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}