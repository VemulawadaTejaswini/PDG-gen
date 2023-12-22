import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A1 = scanner.nextInt();
		int A2 = scanner.nextInt();
		int A3 = scanner.nextInt();
		scanner.close();

		int[] A = { A1, A2, A3 };
		Arrays.sort(A);

		System.out.println(A[2] - A[0]);
	}
}
