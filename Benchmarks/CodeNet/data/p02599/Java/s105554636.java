import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(sa[i]);
		}
		Obj[] arr = new Obj[q];
		Obj[] arr2 = new Obj[q];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.i = i;
			o.l = Integer.parseInt(sa[0]);
			o.r = Integer.parseInt(sa[1]);
			arr[i] = o;
			arr2[i] = o;
		}
		br.close();

		int[] pre = new int[n + 1];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(c[i])) {
				pre[i + 1] = map.get(c[i]);
			}
			map.put(c[i], i + 1);
		}

		Arrays.sort(arr, (o1, o2) -> o1.r - o2.r);
		BIT bit = new BIT(n);
		int j = 1;
		for (Obj o : arr) {
			while (j <= o.r) {
				bit.add(j, 1);
				if (pre[j] > 0) {
					bit.add(pre[j], -1);
				}
				j++;
			}
			o.ans = bit.sum(o.r) - bit.sum(o.l - 1);
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			pw.println(arr2[i].ans);
		}
		pw.flush();
	}

	static class Obj {
		int i, l, r;
		long ans;
	}

	static class BIT {
		int n;
		long[] arr;

		public BIT(int n) {
			this.n = n;
			arr = new long[n + 1];
		}

		void add(int idx, long val) {
			for (int i = idx; i <= n; i += i & -i) {
				arr[i] += val;
			}
		}

		long sum(int idx) {
			long sum = 0;
			for (int i = idx; i > 0; i -= i & -i) {
				sum += arr[i];
			}
			return sum;
		}
	}
}
