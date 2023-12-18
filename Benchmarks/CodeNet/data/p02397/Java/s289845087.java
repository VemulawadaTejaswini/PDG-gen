import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		StringBuilder output = new StringBuilder ();

		int x = 0;
		int y = 0;
		int tmp = 0;
		
		while ( true ) {
			x = sc.nextInt ();
			y = sc.nextInt ();

			if ( y < x ) {
				tmp = y;
				y = x;
				x = tmp;
			}

			if ( x == 0 && y == 0 ) {
				break;
			}
			
			output.append ( x + " " + y + "\n" );
		}
		
		System.out.println ( output );
	}
}