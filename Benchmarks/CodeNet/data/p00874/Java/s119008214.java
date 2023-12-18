import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt();
			int d = sc.nextInt();
			if (w == 0 && d == 0)
				break;
			int[] h1 = new int[w];
			int[] h2 = new int[d];
			int[] count1 = new int[21];
			int ans = 0;
			for (int i = 0; i < h1.length; ++i) {
				h1[i] = sc.nextInt();
				++count1[h1[i]];
				ans += h1[i];
			}
			for (int i = 0; i < h2.length; ++i) {
				h2[i] = sc.nextInt();
				ans += h2[i];
				if (count1[h2[i]] > 0) {
					ans -= h2[i];
					--count1[h2[i]];
				}
			}
			System.out.println(ans);
		}
	}
}