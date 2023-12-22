import java.io.*;

class Main {
	public static void main(String[] args) {
	    BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
	    try {
	     
			int n, x;
			int cnt, ave3, ave2;
			String[] tmpArray;  
			while( true ) {
			    String str = kb.readLine();
			    tmpArray = str.split( " " );
			    n = Integer.parseInt( tmpArray[0] );
			    x = Integer.parseInt( tmpArray[1] );
			
			    if( 0 == n && 0 == x ) {  break; }
			
			    cnt = 0;
			    ave3 = x / 3;
			    int i, j, k;
	            for( i=1; i<ave3; i++ ) {
					ave2 = ( x-i ) / 2;
					for( j=i+1; j<=ave2; j++ ) {
						k = x - i - j;
					    if( j < k && k <= n ) {
					        cnt++;
					    }
					}
	            }
	            System.out.println( cnt );    
	        }
	    } catch( IOException e ) {
	        System.err.println( e );
	    }
	}
}