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
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
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

	int M;
	int C;
	int[] B;
	int ans;

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		M = Integer.parseInt(strArr[1]);
		C = Integer.parseInt(strArr[2]);
		B = new int[M];
		ans = 0;
	}

	public void readB(String str) {
		String[] strArr = str.split(" ");
		for (int i = 0; i < M; i++)
			B[i] = Integer.parseInt(strArr[i]);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		int[] a = new int[M];
		for (int i = 0; i < M; i++)
			a[i] = Integer.parseInt(strArr[i]);

		int v = C;
		for (int i = 0; i < M; i++) {
			v += a[i] * B[i];
		}
		if (v > 0)
			ans++;

		cnt++;
	}

	public void solve() {
		System.out.println(ans);
	}
}
