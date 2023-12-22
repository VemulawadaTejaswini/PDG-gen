import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] A = new int[N];
		float votes = 0;
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
			votes += A[i];
		}

		Arrays.sort(A);
		int k = A[N-M];

		if (k >= votes/(4*M)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}