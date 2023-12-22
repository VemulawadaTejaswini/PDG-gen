import java.util.Scanner;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean ans = true;
		if (a % 2 == 0) {
			ans = false;
		}
		if (b % 2 == 0) {
			ans = false;
		}
		if (ans) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}
	}
}
