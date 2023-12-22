import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N+1];
		int sum = 0;
		int ans = 0, pre = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		b[0] = 0;
		for (int i = 1; i <= N; i++) {
			b[i] = sc.nextInt();
			sum += b[i];
		}
		
		ans = sum;
		
		for (int i = 0; i < N; i++) {
			ans = ans + a[i] - b[i];
			if (ans > pre) {
				pre = ans;
			}
		}

		System.out.println(pre);

		sc.close();
	}
}
