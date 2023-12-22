import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String ans = "";

		if ( S.compareTo( "2019/04/30" ) <= 0) {
			ans = "Heisei";
		} else {
			ans = "TBD";
		}

		System.out.println( ans );
	}
}