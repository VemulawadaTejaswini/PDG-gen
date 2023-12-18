import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {

			String str = kb.readLine();
			char[] strArr = str.toCharArray();
			for( int i=0; i<strArr.length; i++ ) {
				if( 'a'<=strArr[i] && strArr[i]<='z' ) {
					System.out.printf( "%s", String.valueOf( strArr[i] ).toUpperCase() );
				} else if( 'A'<=strArr[i] && strArr[i]<='Z' ) {
					System.out.printf( "%s", String.valueOf( strArr[i] ).toLowerCase() );
				} else {
					System.out.printf( "%c", strArr[i] );
				}	
			}
			System.out.printf( "\n");
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}