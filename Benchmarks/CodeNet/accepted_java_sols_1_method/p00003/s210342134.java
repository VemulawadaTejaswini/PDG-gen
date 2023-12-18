import java.util.Scanner;

class Main {
	public static void main( String[] args ) {
		Scanner stdIn = new Scanner( System.in );
	
		int n = stdIn.nextInt();
		
		for ( int i = 0; i < n; i++ ) {
			int a = stdIn.nextInt(), b = stdIn.nextInt(), c = stdIn.nextInt();
			
			if ( a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a )
				System.out.println( "YES" );
			else
				System.out.println( "NO" );
			}
	}
}