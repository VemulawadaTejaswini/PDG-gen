import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[Integer.parseInt(sa[i]) - 1] = i;
		}
		br.close();

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(-1);
		set.add(n);
		long ans = 0;
		for (int i = 0; i < n; i++) {
			long x = a[i] - set.lower(a[i]);
			long y = set.higher(a[i]) - a[i];
			ans += x * y * (i + 1);
			set.add(a[i]);
		}
		System.out.println(ans);
	}
}
