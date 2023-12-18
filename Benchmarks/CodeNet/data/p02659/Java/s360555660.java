import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long A = scan.nextLong();
		float B =scan.nextFloat();
		int[] C = new int[3];

		for(int i = 0; i < 3; i++) {
			C[i] = (int)B % 10;
			B *= 10;
		}

		long X = A * C[0] + A * C[1] / 10 + A * C[2] / 100;

		System.out.println(X);
	}
}