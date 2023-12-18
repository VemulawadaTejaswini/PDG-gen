import java.io.*;

class Main {
	
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            int n = Integer.parseInt( kb.readLine() );
			int[] A = new int[n];
            int i, j;
                        
            for( i=0; i<n; i++ ) {
            	A[i] = Integer.parseInt( kb.readLine() );
            }
			
			shellSort( A, n );
			
			StringBuilder output = new StringBuilder( n+1 );	
			output.append( A[0] );
            for( i=1; i<n; i++ ) {
            	output.append( "\n" );
               	output.append( A[i] );
            }
            System.out.println( output );

	 
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }        
    }
    static void shellSort( int[] A, int n ) 
    {
        int i, j;
        
        int cnt = 0;
        int m = n/2;
        int mcnt;
        int[] G = new int[ 100+1 ];

        G[0] = (2==m)?1:m;
        for( mcnt=1; mcnt<100; mcnt++ ) {
        	G[mcnt] = G[mcnt-1]/3;
        	if( G[mcnt] <= 0 ) { break; }
        }

		StringBuilder output = new StringBuilder( 200 );
        output.append( mcnt );
        output.append( "\n" );
        output.append( G[0] );
         for( i=1; i<mcnt; i++ ) {
 	        output.append( " " );
	        output.append( G[i] );
	    }  
        System.out.println( output );
        
        for( i=0; i<mcnt; i++ ) {
        	cnt += insertionSort( A, n, G[i] );
        }
        System.out.println( cnt );
        return;
    }    
    static int insertionSort( int[] A, int n, int g ) 
    {
    	int i, j;
    	int v;
		int cnt = 0;
   		for( i=g; i<n; i++ ) {
   			v = A[i];
   			j = i - g;
   			while( 0 <= j && v < A[j] ) {
   				A[ j+g ] = A[j];
   				j = j - g;
   				cnt++;
   			}
   			A[ j+g ] = v;
   		}
   		return cnt;
    }
}