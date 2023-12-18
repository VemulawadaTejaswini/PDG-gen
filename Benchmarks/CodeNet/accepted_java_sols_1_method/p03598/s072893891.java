import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		int x[] = new int[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			if (K - x[i] < x[i]) {
				ans += (K - x[i]) * 2;
			} else {
				ans += x[i] * 2;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}
