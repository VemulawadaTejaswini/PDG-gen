import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
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

	public void readHead(String str) {
		String[] strArr = str.split("\\s+");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		A = new int[N];
	}

	public boolean hasNext() {
		return cnt < N;
	}

	int[] A;
	int First = 1;
	int Second = 1;

	public void readBody(String str) {
		// System.out.println(str);
		int a = Integer.parseInt(str);
		A[cnt] = a;
		if (First < a)
			First = a;
		else if (Second < a)
			Second = a;
		cnt++;
	}

	public void solve() {
		for (int i = 0; i < N; i++) {
			if (A[i] == First)
				System.out.println(Second);
			else
				System.out.println(First);
		}
	}
}
