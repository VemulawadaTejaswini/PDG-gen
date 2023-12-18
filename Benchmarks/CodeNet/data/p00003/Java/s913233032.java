import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner date = new Scanner(System.in);

		int n = date.nextInt();
		int a, b, c;

		while (n > 0) {
			a = date.nextInt();
			b = date.nextInt();
			c = date.nextInt();

			if ((a == Math.sqrt(b * b + c * c)) || (b == Math.sqrt(c * c + a * a)) || (c == Math.sqrt(a * a + b * b))) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			n--;
		}


	}

}