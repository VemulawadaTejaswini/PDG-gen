import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

		if (0 < a - 2 * b)
			System.out.print(a - 2 * b);
		else
			System.out.print(0);

	}
}