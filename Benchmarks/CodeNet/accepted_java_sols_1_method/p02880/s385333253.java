import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int c = 0;
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {

				if (a * b == n)
					c = 1;

			}
		}
		if (c == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}