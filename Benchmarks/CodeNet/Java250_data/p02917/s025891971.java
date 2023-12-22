import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readB(in.readLine());
		// for (; solver.hasNext();) {
		// solver.readBody(in.readLine());
		// }
		solver.solve();
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
		B = new int[N];
	}

	public void readB(String str) {
		String[] strArr = str.split("\\s+");
		for (int i = 0; i < N - 1; i++)
			B[i + 1] = Integer.parseInt(strArr[i]);
	}

	int[] B;

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}

	public void solve() {
		long ans = 0;
		for (int i = 1; i <= N; i++) {
			if (i == 1)
				ans += B[i];
			else if (i == N)
				ans += B[i - 1];
			else
				ans += Integer.min(B[i], B[i - 1]);
		}
		System.out.println(ans);
	}
}
