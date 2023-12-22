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
			
			for( i=0; i<len; i++ ) {
				A[i] = Integer.parseInt( nums[i] );
				System.out.print( i<(len2)? A[i]+" ": A[i]+"\n" );
			}
			
			int key;
			int j;
 			for( i=1; i<len; i++ ) {
				key = A[i];
				j = i - 1;
				while( 0 <= j && key < A[j] ) {
					A[ j+1 ] = A[j];
					j--;
				}
				A[ j+1 ] = key;
				for( int k=0; k<len; k++ ) {
					System.out.print( k<(len2)? A[k]+" ": A[k]+"\n" );
				}
			}

 			kb.close();
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}