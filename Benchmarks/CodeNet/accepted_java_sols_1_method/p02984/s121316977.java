
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextLong() * 2;
		}
		long offset = 0;
		for (int i = 0; i < N; ++i) {
			offset = A[i] - offset;
		}
		long x = offset / 2;
		long cur = x;
		for (int i = 0; i < N; ++i) {
			System.out.println(cur);
			cur = A[i] - cur;
		}
		in.close();
	}
}