
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = in.nextInt();
		}
		double min = Double.MAX_VALUE;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			double diff = Math.abs(a - (t - h[i] * 0.006));
			if (min > diff) {
				min = diff;
				ans = i + 1;
			}
		}
		System.out.println(ans);
		in.close();
	}
}