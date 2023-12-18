import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		long[] a = new long[N + 1];
		long[] b = new long[M + 1];
		for (int i = 1; i <= N; i++) {
			a[i] = a[i - 1] + sc.nextInt();
		}
		for (int i = 1; i <= M; i++) {
			b[i] = b[i - 1] + sc.nextInt();
		}
      
		int max = 0;
		for (int i = 0, j = M; i <= N; i++) {
			while (j >= 0 && K < a[i] + b[j]) j--;
			if (j < 0) break;
			max = Math.max(max, i + j);
		}
		System.out.println(max);
	}
}
