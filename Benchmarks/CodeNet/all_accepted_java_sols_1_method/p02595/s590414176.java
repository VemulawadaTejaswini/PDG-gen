import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextLong();
		int ans = 0;
		long dd = d * d;
		// System.out.println("d: " + d);
		// System.out.println("dd: " + dd);
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long aa = a * a;
			if (aa <= dd) {
				if (aa + b * b <= dd) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}






