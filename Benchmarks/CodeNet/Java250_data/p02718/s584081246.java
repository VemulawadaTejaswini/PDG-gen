import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N;
		long M;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		long[] a = new long[(int) N];
		double check = 0;
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			check += a[i];
		}
		;
		check = check / (4 *M);
		int count = 0;
		while (N - 1 >= 0) {
			count += (a[N - 1] >= check) ? 1 : 0;
			N--;
		}
		System.out.println(count >= M ? "Yes" : "No");
	}
}