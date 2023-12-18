import java.io.*;
 
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            String[] nums = kb.readLine().split( " " );
            int a = Integer.parseInt( nums[0] );
            int b = Integer.parseInt( nums[1] );
            
            System.out.println( gcd( Math.max( a, b ), Math.min( a, b ) )  );
             
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
    
	public static int gcd( int x, int y )
	{
		if( 0 == y ) {
			return x;
		} else {
			return gcd( y, x%y );
		}
	}
}