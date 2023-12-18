import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sa[i]);
		}
		int[] a = new int[m];
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
		}
		br.close();

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < m; i++) {
			if (h[a[i]] > h[b[i]]) {
				set.add(b[i]);
			}
			if (h[a[i]] < h[b[i]]) {
				set.add(a[i]);
			}
			if (h[a[i]] == h[b[i]]) {
				set.add(a[i]);
				set.add(b[i]);
			}
		}
		System.out.println(n - set.size());
	}
}
