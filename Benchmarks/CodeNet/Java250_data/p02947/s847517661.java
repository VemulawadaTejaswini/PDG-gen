import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

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
		Ana = new HashMap<String, Integer>();
		Hist = new int[26];

	}

	public boolean hasNext() {
		return cnt < N;
	}

	HashMap<String, Integer> Ana;
	int[] Hist;

	public void readBody(String str) {
		// System.out.println(str);
		for (int i = 0; i < 26; i++)
			Hist[i] = 0;
		for (int i = 0; i < 10; i++)
			Hist[str.charAt(i) - 'a']++;
		String key = "";
		for (int i = 0; i < 26; i++) {
			if (Hist[i] == 0)
				continue;
			char c = (char) ('a' + i);
			key = key + c + Hist[i];
		}
		if (!Ana.containsKey(key))
			Ana.put(key, 1);
		else
			Ana.put(key, Ana.get(key) + 1);

		cnt++;
	}

	public void solve() {
		long ans = 0;
		for (String key : Ana.keySet()) {
			// System.out.println(key + " " + Ana.get(key));
			if (Ana.get(key) < 2)
				continue;
			long n = Ana.get(key);
			ans += (n * (n - 1) / 2);
		}
		System.out.println(ans);
	}
}
