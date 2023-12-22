import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		outer: while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] s1 = new int[n];
			int[] s2 = new int[m];
			int sum1 = 0, sum2 = 0;
			for (int i = 0; i < n; ++i) {
				s1[i] = sc.nextInt();
				sum1 += s1[i];
			}
			for (int i = 0; i < m; ++i) {
				s2[i] = sc.nextInt();
				sum2 += s2[i];
			}
			Arrays.sort(s1);
			Arrays.sort(s2);

			int diff = sum2 - sum1;
			int t = 0;
			for (int i = 0; i < n; ++i) {
				while (t + 1 < m && 2 * (s2[t] - s1[i]) < diff) {
					++t;
				}
				if (2 * (s2[t] - s1[i]) == diff) {
					System.out.println(s1[i] + " " + s2[t]);
					continue outer;
				}
			}
			System.out.println(-1);
		}
		sc.close();
	}
}