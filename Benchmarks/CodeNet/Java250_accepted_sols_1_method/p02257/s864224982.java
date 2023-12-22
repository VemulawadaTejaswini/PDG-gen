import java.io.*;
  
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            int n = Integer.parseInt( kb.readLine() );
             
            int num;
			int cnt = n;
            int i, j;
			int[] nums = new int[n];
            for( i=0; i<n; i++ ) {
				nums[i] = Integer.parseInt( kb.readLine() );
			}
			for( i=0; i<n; i++ ) {
				if( 2 == nums[i] ) { continue; }
				if( 0 == nums[i]%2 ) {
					cnt--;
					continue;
				}
                for( j=3; j*j<=nums[i]; j+=2 ) {
                    if( 0 == nums[i]%j ) {
                        cnt--;
						break;
                    }
                }
            }
             
            System.out.println( cnt  );
              
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}