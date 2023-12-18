import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		String ans = "";

		if (a < b) {
			ans = "a < b";
		} else if (a > b) {
			ans = "a > b";
		} else if (a == b) {
			ans = "a == b";
		}

		System.out.println(ans);
	}

}

