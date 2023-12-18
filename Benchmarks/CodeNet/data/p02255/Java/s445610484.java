import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			int n = Integer.parseInt( kb.readLine() );
			String[] nums = kb.readLine().split( " " );
			int len = nums.length;
			int[] A = new int[ len ];
			int i, len2 = len-1;

			StringBuilder output = new StringBuilder( 100+1 );									
			for( i=0; i<len; i++ ) {
				A[i] = Integer.parseInt( nums[i] );
				output.append( A[i]  );
				output.append( " "  );
			}
			output.deleteCharAt( output.lastIndexOf( " " ) );
			output.append( "\n"  );

			int key;
			int j, k;
 			for( i=1; i<len; i++ ) {
				key = A[i];
				j = i - 1;
				while( 0 <= j && key < A[j] ) {
					A[ j+1 ] = A[j];
					j--;
				}
				A[ j+1 ] = key;
				for( k=0; k<len; k++ ) {
					output.append( A[k]  );
					output.append( " "  );
				}
				output.deleteCharAt( output.lastIndexOf( " " ) );
				output.append( "\n"  );
			}
			System.out.print( output  );
			
 			kb.close();
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}