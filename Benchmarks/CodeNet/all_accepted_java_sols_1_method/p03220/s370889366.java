import java.util.Scanner;

public class Main {
	static int N;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();

		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}

		double min = Integer.MAX_VALUE;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (min > Math.abs(A - (T - H[i] * 0.006))) {
				ans = i + 1;
				min = Math.abs(A - (T - H[i] * 0.006));
			}
		}

		System.out.println(ans);
	}

}