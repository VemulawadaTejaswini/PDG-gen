import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in );

		String str = kb.nextLine();
		int n = Integer.parseInt( str );
		
		boolean[] cards= new boolean[53]; 
		for( int i=0; i<n; i++ ) {
			String pattern = kb.next();
			int num = kb.nextInt();
			if( "S".equals(  pattern ) ) {
				cards[ num-1 ]=true;
			} else if( "H".equals(  pattern ) ) {
				cards[ 12+num ]=true;
			} else if( "C".equals(  pattern ) ) {
				cards[ 25+num ]=true;
			} else if( "D".equals(  pattern ) ) {
				cards[ 38+num ]=true;			
			}
		}

		for( int i=0; i<52; i++ ) {
			if( false == cards[ i ] ) {
				int num = i/13;
				if( 0 == num ) {
					num=(i%13)+1;
					System.out.println( "S "+ num);
				} else if( 1 == num ) {
					num=(i%13)+1;
					System.out.println( "H "+num );
				} else if( 2 == num ) {
					num=(i%13)+1;
					System.out.println( "C "+num );
				} else if( 3 == num ) {
					num=(i%13)+1;
					System.out.println( "D "+num );				
				}
			}
		}
	}
}