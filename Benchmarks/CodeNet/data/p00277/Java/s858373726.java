
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(tokenizer.nextToken());
		int R = Integer.parseInt(tokenizer.nextToken());
		int L = Integer.parseInt(tokenizer.nextToken());
		Pair[] pairs = new Pair[N];
		TreeSet<Pair> set = new TreeSet<Pair>();
		int[] c = new int[N];
		for (int i = 0; i < N; i++) {
			pairs[i] = new Pair(i, 0);
		}
		int now = 0;
		int index = 0;

		for (int i = 0; i < R; i++) {
			tokenizer = new StringTokenizer(reader.readLine());
			int d = Integer.parseInt(tokenizer.nextToken()) - 1;
			int t = Integer.parseInt(tokenizer.nextToken());
			int x = Integer.parseInt(tokenizer.nextToken());
			c[index] += t - now;
			set.remove(pairs[d]);
			pairs[d].point += x;
			set.add(pairs[d]);
			index = set.first().id;
			now = t;
		}
		c[index] += L - now;
		int ans = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			if (max < c[i]) {
				max = c[i];
				ans = i;
			}
		}
		System.out.println(ans + 1);

	}

	class Pair implements Comparable<Pair> {
		int id, point;

		public Pair(int id, int point) {
			super();
			this.id = id;
			this.point = point;
		}

		@Override
		public String toString() {
			return "Pair [id=" + id + ", point=" + point + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + id;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (id != other.id)
				return false;
			return true;
		}

		@Override
		public int compareTo(Pair o) {
			if (this.point == o.point)
				return this.id - o.id;
			return o.point - this.point;
		}

		private Main getOuterType() {
			return Main.this;
		}

	}
}