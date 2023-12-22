import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x_n = new int[n];
		for (int i = 0; i < n; i++) {
			x_n[i] = sc.nextInt();
		}
		sc.close();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int aDistance = Math.abs(0 - x_n[i]) * 2;
			int bDistance = Math.abs(x_n[i] - k) * 2;
			ans += Math.min(aDistance, bDistance);
		}
		System.out.println(ans);
	}

}
