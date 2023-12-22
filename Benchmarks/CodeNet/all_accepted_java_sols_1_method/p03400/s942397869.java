import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		int ans = 0, sum = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += (d - 1)/a[i] + 1;
		}
		
		ans = x + sum;
		

		System.out.println(ans);

		sc.close();
	}
}
