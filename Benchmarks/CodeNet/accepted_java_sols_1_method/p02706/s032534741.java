import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] A = new int [M];
		for (int i = 0; i < M; i++) {
			A[i] = scan.nextInt();
		}

		for (int i = 0; i < M; i++) {
			N -= A[i];
		}

		if (N < 0) {
			System.out.println(-1);
		} else {
			System.out.println(N);
		}
	}

}