import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();

		int sum = 100 * r + 10 * g + b;
		String ans = "";

		if ( sum % 4 == 0 ) {
			ans = "YES";
		} else {
			ans = "NO";
		}
		System.out.println(ans);
	}
}