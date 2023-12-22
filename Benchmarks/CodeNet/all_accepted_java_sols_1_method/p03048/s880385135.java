import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		// long[] a = new long[n];
		// for (int i = 0; i < n; i++) {
		// a[i] = sc.nextLong();
		// }
		sc.close();
		int ans = 0;
		for (int R = 0; R <= n / r; R++) {
			for (int G = 0; G <= (n - r * R) / g; G++) {
				// System.out.println(R + " " + G + "");
				if ((n - r * R - g * G) % b == 0)
					ans++;
			}
		}
		System.out.println(ans);
	}
}
