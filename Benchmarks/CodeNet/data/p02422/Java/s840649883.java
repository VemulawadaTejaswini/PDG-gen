import java.util.*;
 
public class Main {
	
	public static final int A = 0;
	public static final int B = 1;
	
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );

		String str		= scan.next();
		int	strLength	= str.length();
		int orderNum	= scan.nextInt();
		
		
		for( int i = 0; i < orderNum; i++ ) {
			int[] option	= new int[2];
			String order	= scan.next();
			int A			= scan.nextInt();
			int B			= scan.nextInt();
	
			if ( order.equals( "print" ) ) {
				str = str.substring( A, B+1 );	
				System.out.println( str );
				
			} else if ( order.equals( "reverse" ) ) {
				StringBuffer strBuf = new StringBuffer( str.substring( A, B+1 ) );
				String temp			= strBuf.reverse().toString();
				str					= str.substring( 0, A ) + temp + str.substring( B+1, strLength );
				
			} else if ( order.equals( "replace" ) ) {
				String replaceStr	= scan.next();
				str					= str.substring( 0, A ) + replaceStr + str.substring( B+1, strLength );
				
			}
			
		}

	}
	
	
	
}