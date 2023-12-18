import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		long S = 0;
		int a = 0;
		int[] num = new int[100005];
		for (int i = 0; i < N; i++) {
			a = scan.nextInt();
			num[a]++;
			S += a;
		}

		int Q = scan.nextInt();
		int b = 0;
		int c = 0;
		long[] ans = new long[Q];

		for (int i = 0; i < Q; i++) {
			b = scan.nextInt();
			c = scan.nextInt();
			S += num[b] * (c-b);
			num[c] += num[b];
			num[b] = 0;
			ans[i] = S;
		}

		for (int i = 0; i < Q; i++) {
			System.out.println(ans[i]);
		}

	}

}