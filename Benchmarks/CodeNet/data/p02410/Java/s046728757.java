import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			String str = kb.readLine();
			String[] tmpArr = str.split( " " );
			int n = Integer.parseInt( tmpArr[0] );
			int m = Integer.parseInt( tmpArr[1] );
						
			int[][] a = new int[n][m];
			int[] b = new int[m];
			int c;


			for( int i=0; i<n; i++ ) {
				str = kb.readLine();
				tmpArr = str.split( " " );
				for( int j=0; j<m; j++ ) {
					a[i][j]=Integer.parseInt( tmpArr[j] );
				}
			}
			for( int j=0; j<m; j++ ) {
				str = kb.readLine();
				b[j]=Integer.parseInt( str );
			}
			
			for( int i=0; i<n; i++ ) {
				c=0;
				for( int j=0; j<m; j++ ) {
					c+=a[i][j]*b[j];
				}
				System.out.print( c+"\n" ); 
			}
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}