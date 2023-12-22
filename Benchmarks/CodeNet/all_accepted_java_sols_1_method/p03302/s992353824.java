import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt(), b = sc.nextInt();
		if (a * b == 15) {
			System.out.println("*");
		} else if (a + b == 15) {
			System.out.println("+");
		} else {
			System.out.println("x");
		}
	}
}