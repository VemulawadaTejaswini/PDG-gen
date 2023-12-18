
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if ((a + b) % 2 == 1) {
			System.out.print((a + b) / 2 + 1);
		} else {
			System.out.print((a + b) / 2);
		}
	}
}
