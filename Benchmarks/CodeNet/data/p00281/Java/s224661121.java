
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	@SuppressWarnings("unchecked")
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(tokenizer.nextToken());
		int m = Integer.parseInt(tokenizer.nextToken());
		List<Pair>[] lists = new ArrayList[n];
		for (int i = 0; i < n; i++)
			lists[i] = new ArrayList<Pair>();
		while (true) {
			tokenizer = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(tokenizer.nextToken());
			int b = Integer.parseInt(tokenizer.nextToken());
			int c = Integer.parseInt(tokenizer.nextToken());
			if ((a | b | c) == 0)
				break;
			lists[a - 1].add(new Pair(b - 1, c));
		}
		int r = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();
		while (r-- > 0) {
			int[] b = new int[m];
			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < m; i++)
				b[i] = Integer.parseInt(tokenizer.nextToken());
			int res = 0;
			for (Pair p : lists[0]) {
				res += b[p.b] * p.cost;
			}
			builder.append(res);
			for (int i = 1; i < n; i++) {
				res = 0;
				for (Pair pair : lists[i]) {
					res += b[pair.b] * pair.cost;
				}
				builder.append(' ').append(res);
			}
			builder.append('\n');
		}
		System.out.print(builder);
	}

	class Pair {
		int b, cost;

		public Pair(int b, int cost) {
			super();
			this.b = b;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Pair [b=" + b + ", cost=" + cost + "]";
		}

	}
}