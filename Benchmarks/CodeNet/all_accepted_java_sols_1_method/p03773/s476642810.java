import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = a + b ;

		if ( i <= 23 ) {

			System.out.println( i );

		} else {

			System.out.println( i - 24);

		}
	}
}
