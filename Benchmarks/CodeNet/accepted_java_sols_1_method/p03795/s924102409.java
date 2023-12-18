import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		int x = (n - (n % 15)) / 15;
		int amount = 800 * n - 200 * x;
		System.out.println(amount);
	}
}