import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			if (a[i] == 1)
				index = i;
		}
		int ans = 0;
		loop: while (true) {
			int i = 0;
			while (a[i] != 1)
				i++;
			if (i == 0) {
				while (i < n && a[i] == 1)
					i++;
				if (i == n) break loop;
				for (int j = i - 1; j < Math.min(i - 1 + k, n); j++)
					a[j] = 1;
			}
			else {
				int s = i - k + 1;
				if (s < 0) s = 0;
				else {
					while (s % (k - 1) != 0)
						s++;
				}
				for (int j = s; j < Math.min(s + k, n); j++) {
					a[j] = 1;
				}
			}
			ans++;
		}
		System.out.println(ans);
	}
}