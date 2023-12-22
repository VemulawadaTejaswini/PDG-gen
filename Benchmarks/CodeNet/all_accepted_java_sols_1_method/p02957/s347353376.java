import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt() ;
		int B = scan.nextInt() ;
		int sum = A + B ;

		if (sum % 2 == 0 ) {
			System.out.println( sum/2 );
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}