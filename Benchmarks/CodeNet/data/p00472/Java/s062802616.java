import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] D = new int[N];
		for (int i = 0; i < N - 1; ++i) {
			D[i + 1] = D[i] + sc.nextInt();
		}
		long ans = 0;
		int pos = 0;
		for (int i = 0; i < M; ++i) {
			int m = sc.nextInt();
			ans += D[m > 0 ? pos + m : pos] - D[m > 0 ? pos : pos + m];
			pos += m;
		}
		System.out.println(ans % 100000);
	}

}