import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		
		int a = 0;
		int b = 0;
		
		a = sc.nextInt ();
		b = sc.nextInt ();
		
		if ( a < b ) {
			System.out.println ( "a < b" );
		} else if ( b < a ) {
			System.out.println ( "a > b" );
		} else if ( a == b ) {
			System.out.println ( "a == b" );
		}
	}
}