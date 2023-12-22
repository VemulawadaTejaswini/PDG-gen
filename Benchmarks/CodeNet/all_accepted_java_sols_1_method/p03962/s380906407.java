import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		String ans = "";

		if (a == b && b == c && c == a) {
			ans = "1";
		} else if (a == b && b != c) {
			ans = "2";
		} else if (a == c && c != b) {
			ans = "2";
		} else if (b == c && b != a) {
			ans = "2";
		} else if (a != b && b != c && c != a) {
			ans = "3";
		}
		System.out.println(ans);

	}

}