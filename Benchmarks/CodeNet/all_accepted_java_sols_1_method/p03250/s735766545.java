import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.print(a * 10 + b + c);
		} else if (b >= c && b >= a) {
			System.out.print(b * 10 + c + a);
		} else {
			System.out.print(c * 10 + a + b);
		}
	}
}