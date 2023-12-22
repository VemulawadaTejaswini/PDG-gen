import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, T;
		N = sc.nextInt();
		T = sc.nextInt();
		int c[] = new int[N];
		int t[] = new int[N];
		int ans = 1001;
		for (int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
			if (t[i] <= T && ans > c[i]) {
				ans = c[i];
			}
		}
		sc.close();
		if (ans == 1001) {
			System.out.println("TLE");
		} else {
			System.out.println(ans);
		}
	}
}
