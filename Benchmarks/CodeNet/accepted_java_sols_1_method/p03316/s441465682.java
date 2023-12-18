import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int t = 0;
		int c = n;

		while (c != 0) {
			t += c % 10;
			c /= 10;
		}

		if (n % t == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}