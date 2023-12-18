import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);

		sa = br.readLine().split(" ");
		int[] pre = new int[n + 1];
		int[] last = new int[n + 1];
		for (int i = 0; i < n; i++) {
			int c = Integer.parseInt(sa[i]);
			pre[i + 1] = last[c];
			last[c] = i + 1;
		}

		PriorityQueue<Obj> que = new PriorityQueue<>((o1, o2) -> o1.r - o2.r);
		Obj[] arr = new Obj[q];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.i = i;
			o.l = Integer.parseInt(sa[0]);
			o.r = Integer.parseInt(sa[1]);
			que.add(o);
			arr[i] = o;
		}
		br.close();

		BIT bit = new BIT(n);
		int j = 1;
		while (!que.isEmpty()) {
			Obj o = que.poll();
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
			pw.println(arr[i].ans);
		}
		pw.flush();
	}

	static class Obj {
		int i, l, r, ans;
	}

	static class BIT {
		int n;
		int[] arr;

		public BIT(int n) {
			this.n = n;
			arr = new int[n + 1];
		}

		void add(int idx, int val) {
			for (int i = idx; i <= n; i += i & -i) {
				arr[i] += val;
			}
		}

		int sum(int idx) {
			int sum = 0;
			for (int i = idx; i > 0; i -= i & -i) {
				sum += arr[i];
			}
			return sum;
		}
	}
}
