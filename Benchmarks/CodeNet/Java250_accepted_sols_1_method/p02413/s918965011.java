import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {

			String str = kb.readLine();
			String[] tmpArray = str.split( " " );
			int r=Integer.parseInt( tmpArray[0] );
			int c=Integer.parseInt( tmpArray[1] );
			
			int[][] spredsheet = new int[r+1][c+1];
			for( int i=0; i<r; i++ ) {
				spredsheet[i][c]=0;
				str = kb.readLine();
				tmpArray = str.split( " " );
				for( int j=0; j<c; j++ ) {
					if( 0 == i ) { spredsheet[r][j]=0; }
					spredsheet[i][j]=Integer.parseInt( tmpArray[j] );
					spredsheet[i][c]+=spredsheet[i][j];
					spredsheet[r][j]+=spredsheet[i][j];
					System.out.print( tmpArray[j]+" " );	
				}
				System.out.println( spredsheet[i][c] );
			}
			spredsheet[r][c]=0;
			for( int j=0; j<c; j++ ) {
				spredsheet[r][c]+=spredsheet[r][j];
				System.out.print( spredsheet[r][j]+" " );	
			}
			System.out.println( spredsheet[r][c] );
			
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}