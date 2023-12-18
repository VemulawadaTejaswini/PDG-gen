import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		for (int x = 0; x < t; x++) {
			int n = Integer.parseInt(br.readLine());
			Obj[] arr = new Obj[n];
			for (int i = 0; i < n; i++) {
				String[] sa = br.readLine().split(" ");
				Obj o = new Obj();
				o.k = Integer.parseInt(sa[0]);
				o.l = Integer.parseInt(sa[1]);
				o.r = Integer.parseInt(sa[2]);
				o.d = Math.abs(o.l - o.r);
				arr[i] = o;
			}
			Arrays.sort(arr, (o1, o2) -> o2.d - o1.d);

			TreeSet<Integer> set = new TreeSet<>();
			for (int i = 1; i <= n; i++) {
				set.add(i);
			}

			long ans = 0;
			Set<Obj> ok = new HashSet<>();
			Set<Obj> ng = new HashSet<>();
			for (Obj o : arr) {
				if (o.l == o.r) {
					ok.add(o);
				} else if (o.l > o.r) {
					Integer m = set.floor(o.k);
					if (m == null) {
						ng.add(o);
					} else {
						set.remove(m);
						ans += o.l;
					}
				} else {
					Integer m = set.higher(o.k);
					if (m == null) {
						ng.add(o);
					} else {
						set.remove(m);
						ans += o.r;
					}
				}
			}
			for (Obj o : ok) {
				ans += Math.max(o.l, o.r);
			}
			for (Obj o : ng) {
				ans += Math.min(o.l, o.r);
			}
			pw.println(ans);
		}
		br.close();
		pw.flush();
	}

	static class Obj {
		int k, l, r, d;
	}
}
