import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static long mincost;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		List<Integer> u = new ArrayList<>();
		List<Integer> d = new ArrayList<>();
		long cost = 0;
		int n = Integer.parseInt(str);
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			String[] dataset = str.split(" ");
			u.add(Integer.parseInt(dataset[0]));
			d.add(Integer.parseInt(dataset[1]));
		}
		mincost = (long) Math.pow(2, 31) - 1;
		Search(cost, n - 1, 0, u, d);

		System.out.println(mincost);
	}

	public static void Search(long cost, int maxdepth, int depth,
			List<Integer> a, List<Integer> b) {
		if (depth == maxdepth && cost < mincost)
			mincost = cost;
		else {
			for (int i = 0; i < maxdepth - depth; i++) {
				long costs = cost
						+ (a.get(i) * a.get(i + 1) * b.get(i) * b.get(i + 1));
				if (costs >= mincost)
					continue;
				List<Integer> u = new ArrayList<>(a);
				List<Integer> d = new ArrayList<>(b);
				u.remove(i + 1);
				d.remove(i);
				int dep = depth + 1;
				Search(costs, maxdepth, dep, u, d);
				u = null;
				d = null;
			}
		}
	}
}