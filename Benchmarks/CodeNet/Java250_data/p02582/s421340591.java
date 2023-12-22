import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		setIO();

		char[] s = f.readLine().toCharArray();
		
		int ans = 0;
		
		for (int i = 0; i < 3; i++) {
			if (s[i] == 'R') {
				int j = i;
				while (j < 2 && s[j+1] == 'R') {
					j++;
				}
				ans = Math.max(ans, j - i + 1);
			}
		}
		
		out.println(ans);
		
		f.close();
		out.close();
	}
	
	static boolean[] generate(int x, int n) {
		boolean[] s = new boolean[n];
		for (int i = 0; i < n; i++) {
			s[i] = (x & (1 << i)) >> i == 1;
		}
		return s;
	}
	
	static boolean valid(int K, char[][] A, boolean[] h, boolean[] v) {
		for (int i = 0; i < h.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (h[i] && v[i] && A[i][j] == '#') K--;
			}
		}
		
		return K == 0;
	}

	static BufferedReader f;
	static PrintWriter out;
	static StringTokenizer st;

	static int ni(StringTokenizer st) {
		return Integer.parseInt(st.nextToken());
	}

	static int ni() throws IOException {
		return Integer.parseInt(f.readLine());
	}

	static StringTokenizer nl() throws IOException {
		return new StringTokenizer(f.readLine());
	}

	static int[] nia(int N) throws IOException {
		StringTokenizer st = nl();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = ni(st);
		return A;
	}

	static void setIn(String s) throws IOException {
		f = new BufferedReader(new FileReader(s));
	}

	static void setOut(String s) throws IOException {
		out = new PrintWriter(new FileWriter(s));
	}

	static void setIn() {
		f = new BufferedReader(new InputStreamReader(System.in));
	}

	static void setOut() {
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	}

	static void setIO(String s) throws IOException {
		setIn(s + ".in");
		setOut(s + ".out");
	}

	static void setIO() {
		setIn();
		setOut();
	}
}
