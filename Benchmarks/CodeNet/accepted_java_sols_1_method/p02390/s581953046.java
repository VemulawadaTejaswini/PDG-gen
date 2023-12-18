import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );

		int s = sc.nextInt ();

		int s1 = s % 60;
		int s2 = ( s / 60 ) % 60;
		int s3 = s / 60 / 60;
		
		System.out.println ( s3 + ":" + s2 + ":" + s1 );
	}
}