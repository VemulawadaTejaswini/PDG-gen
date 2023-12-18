// ITP_1_4-B

import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		

		final double PI = Math.PI;
		double r;
		double en_menseki;
		double en_shu;

		r = sc.nextDouble ();
		en_menseki = r * r * PI;
		en_shu = 2 * PI * r;

		System.out.println ( String.format ( "%.6f", en_menseki ) + " " + String.format ( "%.6f", en_shu ) );
	}
}