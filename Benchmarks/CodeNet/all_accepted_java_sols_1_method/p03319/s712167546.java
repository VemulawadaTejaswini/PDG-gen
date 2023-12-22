
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = in.nextInt();
		}
		int n = N - 1;
		int k = K - 1;
		System.out.println((n + k - 1) / k);

	}
}