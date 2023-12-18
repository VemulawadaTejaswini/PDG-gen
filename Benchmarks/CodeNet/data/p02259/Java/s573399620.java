import java.io.*;
 
class Main {
	
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            int n = Integer.parseInt( kb.readLine() );
			String[] nums = kb.readLine().split( " " );
			int[] A = new int[n];
            int i, j;
            
            for( i=0; i<n; i++ ) {
            	A[i] = Integer.parseInt( nums[i] );
            }
            
            int cnt = 0;
			cnt = bubbleSort( A, n );
			
            StringBuilder output = new StringBuilder( 200+1 );
            for( i=0; i<n; i++ ) {
            	output.append( A[i]  );
            	output.append( " "  );
            }
            output.deleteCharAt( output.lastIndexOf( " " ) );

            System.out.println( output );
            System.out.println( cnt );
			 
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }        
    }
    
    static int bubbleSort( int[] A, int n ) 
    {
    	int tmp;
    	int i, j, cnt;
    	
    	cnt = 0;
   		for( i=0; i<n; i++ ) {
   			for( j=n-1; i<j; j-- ) {
   				if( A[j] < A[ j-1 ] ) {
   					tmp = A[ j-1 ];
   					A[ j-1 ] = A[ j ];
   					A[ j ] = tmp;
   					cnt++;
   				}
   			}
   		}
   		return cnt;
    }
}