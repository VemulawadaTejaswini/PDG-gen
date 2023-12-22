
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a, b;

		n = sc.nextInt();
		if (n == 2) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		} else {
			System.out.println("Hello World");
		}

		sc.close();
	}

}
