import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Obj[] arr = new Obj[n + 1];
		for (int i = 0; i <= n; i++) {
			Obj o = new Obj();
			o.i = i;
			arr[i] = o;
		}
		int[] c = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[a[i]].cnt++;
			arr[b[i]].cnt++;
			c[b[i]]++;
		}
		for (int i = 0; i < n; i++) {
			if (arr[i].cnt > n) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

		Map<Integer, Queue<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			Queue<Integer> que = map.get(a[i]);
			if (que == null) {
				que = new ArrayDeque<>();
				map.put(a[i], que);
			}
			que.add(i);
		}

		Arrays.sort(arr, (o1, o2) -> o2.cnt - o1.cnt);
		int[] p = new int[n];
		int idx = 0;
		for (Obj o : arr) {
			Queue<Integer> que = map.get(o.i);
			if (que == null) {
				continue;
			}
			while (!que.isEmpty()) {
				p[idx] = que.poll();
				idx++;
			}
		}

		TreeSet<Obj2> set = new TreeSet<>((o1, o2) -> o1.i - o2.i);
		for (int i = 0; i < n; i++) {
			Obj2 o = new Obj2();
			o.i = i;
			o.idx = p[i];
			set.add(o);
		}

		Queue<Integer> que = new ArrayDeque<>();
		int[] ans = new int[n];
		for (Obj o : arr) {
			if (c[o.i] > 0) {
				Obj2[] arr2 = set.toArray(new Obj2[0]);
				for (Obj2 o2 : arr2) {
					if (ans[o2.idx] == 0 && a[o2.idx] != o.i) {
						c[o.i]--;
						ans[o2.idx] = o.i;
						set.remove(o2);
						if (c[o.i] == 0) {
							break;
						}
					}
				}
			}
			while (c[o.i] > 0) {
				que.add(o.i);
				c[o.i]--;
			}
		}

		int idx2 = -1;
		for (Obj2 o2 : set) {
			int x = que.poll();
			while (true) {
				idx2++;
				idx2 %= n;
				if (a[o2.idx] != ans[idx2] && a[idx2] != x) {
					ans[o2.idx] = ans[idx2];
					ans[idx2] = x;
					break;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}

	static class Obj {
		int i, cnt;
	}

	static class Obj2 {
		int i, idx;
	}
}
