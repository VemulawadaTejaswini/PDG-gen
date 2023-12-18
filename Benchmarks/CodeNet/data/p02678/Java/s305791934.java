import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		List<List<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		int[] ans = new int[n];
		Arrays.fill(ans, -1);
		Queue<Integer> que = new ArrayDeque<>();
		que.add(0);
		ans[0] = 0;
		while (!que.isEmpty()) {
			int cur = que.poll();
			for (int next : list.get(cur)) {
				if (ans[next] == -1) {
					que.add(next);
					ans[next] = cur;
				}
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Yes");
		for (int i = 1; i < n; i++) {
			pw.println(ans[i] + 1);
		}
		pw.flush();
	}
}
