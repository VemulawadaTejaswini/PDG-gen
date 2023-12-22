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
				output.append( i<(len2)? A[i]+" ": A[i]  );
			}
			System.out.println( output  );
			output.setLength( 0 );

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
					output.append( k<(len2)? A[k]+" ": A[k]  );
				}
				System.out.println( output  );
				output.setLength( 0 );
			}
			
 			kb.close();
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}