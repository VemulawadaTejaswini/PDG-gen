import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.next();

		String ans = " ";

		if ( N.charAt(0) == N.charAt(1) && N.charAt(1) == N.charAt(2)) {
			ans = "Yes";
		} else if (  N.charAt(1) == N.charAt(2) && N.charAt(2) == N.charAt(3) ) {
			ans = "Yes";
		} else {
			ans = "No";
		}

		System.out.println( ans );
	}
}