import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int r = sc.nextInt();
		final int d = sc.nextInt();
		final int x = sc.nextInt();

		sc.close();

		int prevx = x;
		for (int i = 1; i < 11; i++) {
			int result = r * prevx - d;
			System.out.println(result);
			prevx = result;
		}

	}

}