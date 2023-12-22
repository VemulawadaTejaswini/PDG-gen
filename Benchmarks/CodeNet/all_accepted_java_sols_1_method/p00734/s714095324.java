import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) break;
			int[] a = new int[n];
			int[] b = new int[m];
			int sumA = 0;
			int sumB = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sumA += a[i];
			}
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
				sumB += b[i];
			}
			int resA = 1000;
			int resB = 1000;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (sumA - a[i] + b[j] == sumB - b[j] + a[i] && resA + resB > a[i] + b[j]) {
						resA = a[i]; resB = b[j];
					}
				}
			}
			if (resA == 1000 && resB == 1000) {
				System.out.println(-1);
			} else {
				System.out.println(resA + " " + resB);
			}
		}
	}
}