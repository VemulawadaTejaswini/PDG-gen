// ITP1_4

import java.util.Scanner;
import java.io.*;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );

		double a = 0.0;
		double b = 0.0;
		int d = 0;
		int r = 0;
		double f = 0.0;

		a = sc.nextInt ();
		b = sc.nextInt ();
		
		d = ( int )a / ( int )b;
		r = ( int )a % ( int )b;
		f = a / b;

		System.out.println ( d + " " + r + " " + String.format ( "%7f", f ) );
	}
}