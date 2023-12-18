import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = Integer.parseInt(sc.next());
			int n = Integer.parseInt(sc.next());
			if (m == 0 && n == 0) break;
			int w = (m + n) * 15;
			int f[] = new int[w + 1];
			for (int i = m; i <= w; i++) {
				f[i] = i;
			}
			for (int i = m; i <= Math.sqrt(w); i++) {
				for (int j = i + i; j <= w; j += i) {
					f[j] = 0;
				}
			}
			int[] a = new int[n];
			int index = m;
			for (int i = 0; i < n; i++) {
				while (f[index] == 0)
					index++;
				a[i] = index;
				index++;
			}
			int ans[] = new int[w + 1];
			for (int i = 0; i < n; i++) {
				int b = 1;
				while (a[i] * b <= w) {
					ans[a[i] * b] = 1;
					b++;
				}
			}
			for (int i = m; i <= w; i++) {
				if (ans[i] == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
