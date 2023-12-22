import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n % 2 == 0)
			System.out.println(0.5);
		else
			System.out.println((double) (n + 1) / (2 * n));

	}
}