import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		int result = 0;

		if (a < b) {
			result += a;
		} else {
			result += b;
		}

		if (c < d) {
			result += c;
		} else {
			result += d;
		}

		System.out.println(result);
	}
}