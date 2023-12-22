import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W[] = new int[N];

		int sum = 0;
		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			sum += W[i];
		}
		sc.close();

		int ans = 9999999;
		int sum2 = 0;
		for (int i = 0; i < N; i++) {
			sum2 += W[i];
			int sum3 = sum - sum2;
			if (ans > Math.abs(sum3 - sum2)) {
				ans = Math.abs(sum3 - sum2);
			}
		}
		System.out.println(ans);
	}
}
