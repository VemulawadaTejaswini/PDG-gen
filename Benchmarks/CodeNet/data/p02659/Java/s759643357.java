import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long A = scan.nextLong();
		float B =scan.nextFloat();
		int[] C = new int[3];

		B *= 100;

		C[0] = (int)B / 100;
		C[1] = (int)B / 10 - C[0] * 10;
		C[2] = (int)B - 100 * C[0] - 10 * C[1];

		long X = A * C[0] + A * C[1] / 10 + A * C[2] / 100;

		System.out.println(X);
	}
}