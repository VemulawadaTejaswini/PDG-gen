import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 2];
		for (int i = 1; i <= N; i++)
			A[i] = sc.nextInt();
		sc.close();

		long dist = 0;

		for (int i = 1; i <= N + 1; i++)
			dist += Math.abs(A[i] - A[i - 1]);

		for (int i = 1; i <= N; i++) {
			System.out.println(dist - Math.abs(A[i] - A[i - 1]) - Math.abs(A[i + 1] - A[i]) + Math.abs(A[i + 1] - A[i - 1]));
		}
	}
}