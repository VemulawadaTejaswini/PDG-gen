import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int a = scan.nextInt(), b = scan.nextInt();

		if( b+w < a ) {
			System.out.println( a-(b+w));
		} else if ( a+w < b ){
			System.out.println( b-(a+w));
		} else {
			System.out.println(0);
		}

	}

}