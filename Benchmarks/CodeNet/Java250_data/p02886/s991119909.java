import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readD(in.readLine());
		// for (; solver.hasNext();) {
		// solver.readBody(in.readLine());
		// }
		// solver.solve();
	}
}

class Solver {
	int N;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split("\\s+");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public void readD(String str) {
		String[] strArr = str.split("\\s+");
		int[] d = new int[N];
		for (int i = 0; i < N; i++)
			d[i] = Integer.parseInt(strArr[i]);
		int ans = 0;
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				if (x == y)
					continue;
				ans += d[x] * d[y];
			}
		}
		System.out.println(ans / 2);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}

	public void solve() {

	}
}
