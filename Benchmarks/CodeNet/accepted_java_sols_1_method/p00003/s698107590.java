import java.util.Scanner;

class Main {
	public static void main( String[] args ) {
		Scanner stdIn = new Scanner( System.in );

		int a, b, c;
		for ( int n = stdIn.nextInt(); n-- > 0; System.out.println( a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b ? "YES" : "NO" ) ) {
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			c = stdIn.nextInt();
		}
	}
}