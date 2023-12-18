import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int t[], h[];
		int t2[], h2[];
		int sumT, sumH;
		int diff;
		int ansT, ansH;

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			t = new int[n];
			h = new int[m];
			sumT = sumH = 0;
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				sumT += t[i];
			}
			for (int i = 0; i < m; i++) {
				h[i] = sc.nextInt();
				sumH += h[i];
			}
			Arrays.sort(t);
			Arrays.sort(h);
			diff = sumT - sumH;

			ansT = ansH = 1000;
			if (diff % 2 == 1 || (sumT + sumH) % 2 == 1) {
				System.out.println("-1");
			} else {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						if (diff / 2 == t[i] - h[j] && t[i] + h[j] < ansT + ansH) {
							ansT = t[i];
							ansH = h[j];
						}
					}
				}
				if (ansT == 1000) {
					System.out.println("-1");
				} else {
					System.out.println(ansT + " " + ansH);
				}
			}
		}
	}
}