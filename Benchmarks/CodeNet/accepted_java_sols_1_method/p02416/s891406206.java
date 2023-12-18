import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
		
            String str;
            int sum=0;
			while( true ) {
				str = kb.readLine();
				if( "0".equals( str ) ) { break; }
				
				char[] strArr = str.toCharArray();
				sum=0;
           		for( int i=0; i<strArr.length; i++ ) {
           			sum += ( strArr[i] - '0' );
           		}
				System.out.println( sum );
			}
			
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}