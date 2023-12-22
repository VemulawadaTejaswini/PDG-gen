import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			if (n == 0 && m == 0) break;
			int[] sa = new int[n];
			int[] sb = new int[m];
			int suma = 0;
			int sumb = 0;
			for (int i = 0; i < n; i++) {
				sa[i] = Integer.parseInt(sc.next());
				suma += sa[i];
			}
			for (int i = 0; i < m; i++) {
				sb[i] = Integer.parseInt(sc.next());
				sumb += sb[i];
			}
			boolean e = false;
			loop:for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (suma - sa[i] + sb[j] == sumb - sb[j] + sa[i]) {
						System.out.println(sa[i] + " " + sb[j]);
						e = true;
						break loop;
					}
				}
			}
			if (!e)
				System.out.println(-1);
		}
	}
}
