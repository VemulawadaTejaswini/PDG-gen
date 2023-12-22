import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String c = sc.next();
		String ans = "";

		if ( c.equals("a") || c.equals("i") || c.equals("u") || c.equals("e") || c.equals("o")) {
			ans = "vowel";
		} else {
			ans = "consonant";
		}

		System.out.println( ans );
	}
}