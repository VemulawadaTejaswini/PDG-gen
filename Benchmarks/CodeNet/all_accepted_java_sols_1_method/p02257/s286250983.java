import java.io.*;
 
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            int n = Integer.parseInt( kb.readLine() );
            
            int num, cnt = 0;
            int i, j;
            boolean isprime = true;
            for( i=0; i<n; i++ ) {
            	isprime = true;
            	num = Integer.parseInt( kb.readLine() );
            	for( j=2; j<=(num/j); j++ ) {
            		if( 0 == num%j ) {
            			isprime = false;
            			break;
            		}
            	}
            	if( isprime ) {
            		cnt++;
            	}
            }
            
            System.out.println( cnt  );
             
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}