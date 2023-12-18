import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]a = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		sc.close();
		int x = sum / N;
		int ans1 = 0;
		int ans2 = 0;
		for(int i = 0; i < N; i++) {
			int t1 = x - a[i];
			int t2 = x + 1 - a[i];
			ans1 += t1 * t1;
			ans2 += t2 * t2;
		}
		System.out.println(Math.min(ans1, ans2));
	}
}