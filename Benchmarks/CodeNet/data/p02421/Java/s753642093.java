import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			int n = Integer.parseInt( kb.readLine() );
			String[] cards = new String[ 2 ];
			int hanakoScore = 0, taroScore = 0;
			int i,j,hlen,tlen;
			i=0;			
	        while( i<n ) {
				cards = kb.readLine().split( " " );
				if( cards[0].equals( cards[1] ) ) {
					hanakoScore += 1;
					taroScore += 1;
				} else {
					j=0;
					hlen = cards[0].length();
					tlen = cards[1].length();
					while( true ) {
						if( cards[0].charAt( j ) < cards[1].charAt( j ) ) {
							taroScore += 3;
							break;
						} else if( cards[0].charAt( j ) > cards[1].charAt( j ) ) {
							hanakoScore += 3;
							break;						
						}
						j++;
						if( j == hlen || j == tlen ) {
							if( hlen < tlen ) {
								taroScore += 3;
								break;
							} else if( hlen > tlen ) {
								hanakoScore += 3;
								break;
							}
						}			
					}
				}
				i++;
	        }
	        
        	System.out.println( hanakoScore+" "+taroScore );				
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}