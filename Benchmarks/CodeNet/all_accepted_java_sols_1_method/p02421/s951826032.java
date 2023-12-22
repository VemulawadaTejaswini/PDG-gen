import java.util.*;
 
public class Main {
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
		
		int n = scan.nextInt();
		
		int TPoint = 0;
		int HPoint = 0;
		for ( int i = 0; i < n; i++ ) {
			String T = scan.next();
			String H = scan.next();
			
			int result = T.compareToIgnoreCase(H);
			if ( result > 0 ) {
				TPoint += 3;
								
			} else if ( result == 0) {
				TPoint += 1;
				HPoint += 1;
				
			} else if ( result < 0 ) {
				HPoint += 3;
				
			}
			
		}
		System.out.println( TPoint + " " + HPoint );
		
	}
	
}