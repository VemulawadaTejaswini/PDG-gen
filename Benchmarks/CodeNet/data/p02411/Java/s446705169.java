import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
		
			int[] mfr= new int[5];
			int sum=0;
			String[] tmpArray;	
			while( true ) {
				String str = kb.readLine();
				tmpArray = str.split( " " );
				if( "-1".equals( tmpArray[0] ) && "-1".equals( tmpArray[1] ) 
						&& "-1".equals( tmpArray[2] ) ) {
					break;
				}
				sum=0;
				for( int i=0; i<3; i++ ) {
					mfr[i]=Integer.parseInt( tmpArray[i] );
					if( -1 != mfr[i] && 2 != i ) {
						sum+=mfr[i];
					}
				}
				if( sum<30 || -1==mfr[0] || -1==mfr[1] ) {
					System.out.println( "F" );
				} else if( 80 <= sum ) {
					System.out.println( "A" );
				} else if( 65<=sum && sum<80 ) {
					System.out.println( "B" );
				} else if( 50<=sum && sum<65 ) {
					System.out.println( "C" );
				} else if( 30<=sum && sum<50 ) {
					if( 50<=mfr[2] ) {
						System.out.println( "C" );
					} else {
						System.out.println( "D" );
					}
				}
			}
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}