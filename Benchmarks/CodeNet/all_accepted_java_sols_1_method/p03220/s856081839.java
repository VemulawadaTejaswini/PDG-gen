import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();

		int ans = 0;
		double min = 100000000;
		for (int i = 0; i < n; i++) {
			double d = Math.abs(t - h[i] * 0.006 - a);
			if (d < min) {
				ans = i;
				min = d;
			}
		}
		System.out.println(ans + 1);
	}
}