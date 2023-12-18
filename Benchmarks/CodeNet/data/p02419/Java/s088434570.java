import java.util.*;
 
public class Main {
	
    public static void main( String args[] ) {
        Scanner scan	= new Scanner( System.in );
		
        String W		= scan.nextLine().toUpperCase();
		
		int count = 0;
		while( true ) {
			String T = scan.next();
			if ( T.equals("END_OF_TEXT") ) {
				break;
			} else if ( T.toUpperCase().equals( W ) ) {
				count++;
				
			}
			
		}
		
	}
}