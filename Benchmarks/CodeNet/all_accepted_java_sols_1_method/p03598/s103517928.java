import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int tmp = Math.min(2*x[i], 2*(K-x[i]));
			ans += tmp;
		}
		System.out.println(ans);
	}
}