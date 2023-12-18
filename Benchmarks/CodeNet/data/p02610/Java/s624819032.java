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
			Arrays.sort(arr, (o1, o2) -> o1.k - o2.k);

			long ans = 0;
			TreeSet<Obj> ok = new TreeSet<>((o1, o2) -> o1.d - o2.d);
			Set<Obj> ng = new HashSet<>();
			int used = 0;
			for (int i = 0; i < n; i++) {
				Obj o = arr[i];
				if (o.l == o.r) {
					ok.add(o);
				} else if (o.l > o.r) {
					if (o.k > used) {
						ok.add(o);
						used++;
					} else {
						Obj f = ok.first();
						if (o.d > f.d) {
							ng.add(ok.pollFirst());
							ok.add(o);
						} else {
							ng.add(o);
						}
					}
				}
			}

			TreeSet<Obj> ok2 = new TreeSet<>((o1, o2) -> o1.d - o2.d);
			Set<Obj> ng2 = new HashSet<>();
			used = n;
			for (int i = n - 1; i >= 0; i--) {
				Obj o = arr[i];
				if (o.l < o.r) {
					if (o.k < used) {
						ok2.add(o);
						used--;
					} else {
						if (!ok2.isEmpty() && o.d > ok2.first().d) {
							ng2.add(ok2.pollFirst());
							ok2.add(o);
						} else {
							ng2.add(o);
						}
					}
				}
			}
			for (Obj o : ok) {
				ans += Math.max(o.l, o.r);
			}
			for (Obj o : ok2) {
				ans += Math.max(o.l, o.r);
			}
			for (Obj o : ng) {
				ans += Math.min(o.l, o.r);
			}
			for (Obj o : ng2) {
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
