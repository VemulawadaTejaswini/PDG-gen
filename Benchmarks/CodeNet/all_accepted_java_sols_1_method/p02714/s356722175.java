import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int[] r = new int[n + 1];
		int[] g = new int[n + 1];
		int[] b = new int[n + 1];
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'R') {
				r[i + 1]++;
			} else if (s.charAt(i) == 'G') {
				g[i + 1]++;
			} else {
				b[i + 1]++;
			}
		}
		for (int i = 1; i <= n; i++) {
			r[i] += r[i - 1];
			g[i] += g[i - 1];
			b[i] += b[i - 1];
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			Set<Character> set = new HashSet<>();
			set.add(s.charAt(i));
			for (int j = i + 1; j < n; j++) {
				char sj = s.charAt(j);
				if (!set.contains(sj)) {
					set.add(sj);
					if (!set.contains('R')) {
						ans += r[n] - r[j + 1];
						int k = j + j - i;
						if (k < n && k - j == j - i && s.charAt(k) == 'R') {
							ans--;
						}
					} else if (!set.contains('G')) {
						ans += g[n] - g[j + 1];
						int k = j + j - i;
						if (k < n && k - j == j - i && s.charAt(k) == 'G') {
							ans--;
						}
					} else if (!set.contains('B')) {
						ans += b[n] - b[j + 1];
						int k = j + j - i;
						if (k < n && k - j == j - i && s.charAt(k) == 'B') {
							ans--;
						}
					}
					set.remove(sj);
				}
			}
		}
		System.out.println(ans);
	}
}
