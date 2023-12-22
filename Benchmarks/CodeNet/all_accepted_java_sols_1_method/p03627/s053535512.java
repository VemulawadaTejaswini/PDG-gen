import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		int c = 0;
		int j = N - 1;
		long k = 0;
		long S = 0;
		long x[] = { 0, 0 };
		while (c < 2 && j > 0) {
			k = A[j];
			j--;
			if (A[j] == k) {
				x[c] = k;
				c++;
				j--;
			}
		}
		S = x[0] * x[1];

		System.out.println(S);
	}
}
