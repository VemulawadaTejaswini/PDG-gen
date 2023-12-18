import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		
		int W = sc.nextInt (); // ????§???§?¨?X
		int H = sc.nextInt (); // ????§???§?¨?y
		int x = sc.nextInt (); // ?????§?¨?x
		int y = sc.nextInt (); // ?????§?¨?y
		int r = sc.nextInt (); // ?????????
		
		if ( x + r <= W && y + r <= H && x - r >= 0 && y - r >= 0 ) {
			System.out.println ( "Yes" );
		} else {
			System.out.println ( "No" );
		}
	}
}