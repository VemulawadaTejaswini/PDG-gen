import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(), b = sc.next();

		int s = Integer.parseInt(a + b);

		double sqrt = Math.floor(Math.sqrt(s));

		if (sqrt * sqrt == s) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}