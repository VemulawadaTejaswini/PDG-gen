// ITP1_4-C

import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );

		int a;
		int b;
		String op;
		int c = 0;

		while ( true ) {
			a = sc.nextInt ();
			op = sc.next ();
			b = sc.nextInt ();
			
			if ( op.equals ( "+" ) ) {
				c = a + b;
			} else if ( op.equals ( "-" ) ) {
				c = a - b;
			} else if ( op.equals ( "*" ) ) {
				c = a * b;
			} else if ( op.equals ( "/" ) ) {
				c = a / b;
			} else if ( op.equals ( "?" ) ) {
				break;
			}
		System.out.println ( c );
		}
	}
}