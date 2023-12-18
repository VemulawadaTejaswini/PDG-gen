import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		String ans = "";

		if (X == 25) {
			ans = "Christmas";
		} else if ( X == 24 ) {
			ans = "Christmas Eve";
		} else if ( X == 23 ) {
			ans = "Christmas Eve Eve";
		}else if ( X == 22 ) {
				ans = "Christmas Eve Eve Eve";
		}
		System.out.println( ans );
	}
}