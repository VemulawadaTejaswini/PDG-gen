import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int nSum = n * (n - 1) / 2;
		int mSum = m * (m - 1) / 2;

		int sum = nSum + mSum;

		System.out.println(sum);

		scanner.close();

	}

}
