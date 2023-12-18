import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var x = sc.nextInt();
		var y = sc.nextInt();
		sc.close();

		var a = 4 * x - y;
		var b = y - 2 * x;
		if (a % 2 == 0 && b % 2 == 0 && a >= 0 && b >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
