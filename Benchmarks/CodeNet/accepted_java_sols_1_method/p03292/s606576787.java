import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[3];
		for (int i = 0; i < 3; i++) {
			A[i] = sc.nextInt();
		}

		Arrays.sort(A);

		int sum = 0;
		for (int i = 1; i < A.length; i++) {
			sum += A[i] - A[i - 1];
		}

		System.out.println(sum);
	}
}