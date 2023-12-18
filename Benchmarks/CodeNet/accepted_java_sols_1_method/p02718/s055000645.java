import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		Arrays.sort(A);
		if (A[N - M] >= sum / (4 * (double) M)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
