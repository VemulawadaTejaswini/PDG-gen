import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		int d = n;
		while (d > 0) {
			sum += d % 10;
			d /= 10;
		}

		if (n % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

}
