import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
		
			int[] nx= new int[5];
			int count=0;
			String[] tmpArray;	
			while( true ) {
				String str = kb.readLine();
				tmpArray = str.split( " " );
				if( "0".equals( tmpArray[0] ) && "0".equals( tmpArray[1] ) ) {
					break;
				}
				for( int i=0; i<2; i++ ) {
					nx[i]=Integer.parseInt( tmpArray[i] );
				}
				
				count=0;
				for( int i=1; i<=nx[0]-2; i++ ) {
					for( int j=i+1; j<=nx[0]-1; j++ ) {
						for( int k=j+1; k<=nx[0]; k++ ) {
							if( nx[1] == (i+j+k) ) {
								count++;
							}
						}
					}				
				}
				System.out.println( count );	
			}
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}