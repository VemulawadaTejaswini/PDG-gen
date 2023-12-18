import java.util.*;
 
public class Main {
	
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );

        while( true ) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			
			if ( n == 0 && x == 0 ) {
				break;
			}
			
			int count = 0;
			
			for( int i = 1; i <= n; i++ ) {
				for( int j = 1; j <= n; j++ ) {
					if ( j == i ) break;
					
					for( int k = 1; k <= n; k++ ) {
						if ( k == i || k == j ) break;
						
						
						if ( ( i + j + k ) == x ) {
							count++;
							
						}
						
					}
				}
			}
			
			System.out.println(count);
			
		}
		
    }
	
}