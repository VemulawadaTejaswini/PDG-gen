import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		PriorityQueue<Obj> que2 = new PriorityQueue<>((o1, o2) -> {
			if (o1.r != o2.r) {
				return o1.r - o2.r;
			}
			return o1.c - o2.c;
		});
		for (int i = 0; i < k; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.r = Integer.parseInt(sa[0]);
			o.c = Integer.parseInt(sa[1]);
			o.v = Integer.parseInt(sa[2]);
			que2.add(o);
		}
		br.close();

		Obj[] arr = new Obj[k];
		for (int i = 0; i < k; i++) {
			arr[i] = que2.poll();
		}

		long[][] dp = new long[h + 1][w + 1];
		int r = 0;
		int idx = 0;
		int from = -1;
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				if (idx < k) {
					Obj o = arr[idx];
					if (o.r == i && o.c == j) {
						dp[i][j] = 0;
						if (o.r != r) {
							from = idx;
							r = o.r;
						}
						PriorityQueue<Integer> que = new PriorityQueue<>();
						for (int j2 = idx; j2 >= from; j2--) {
							que.add(arr[j2].v);
							if (que.size() > 3) {
								que.poll();
							}
							Integer[] vals = que.toArray(new Integer[0]);
							long sum = 0;
							for (int vv : vals) {
								sum += vv;
							}
							dp[i][j] = Math.max(dp[i][j], dp[i - 1][arr[j2].c] + sum);
						}
						idx++;
					}
				}
			}
		}
		System.out.println(dp[h][w]);
	}

	static class Obj {
		int r, c, v;
	}
}
