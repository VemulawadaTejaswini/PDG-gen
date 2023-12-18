import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int n = 26, d;
	static int[] c, last;
	static int[][] s;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		d = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(sa[i]);
		}
		s = new int[d][n];
		for (int i = 0; i < d; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				s[i][j] = Integer.parseInt(sa[j]);
			}
		}
		int[] t = inputB(br);
		br.close();

		last = new int[n];
		int[] manzoku = calc(t);
		for (int i = 0; i < d; i++) {
			System.out.println(manzoku[i]);
		}
	}

	static int[] inputB(BufferedReader br) throws Exception {
		int[] t = new int[d];
		for (int i = 0; i < d; i++) {
			t[i] = Integer.parseInt(br.readLine()) - 1;
		}
		return t;
	}

	static int[] calc(int[] t) {
		int[] ret = new int[d];
		for (int i = 0; i < d; i++) {
			if (i > 0) {
				ret[i] += ret[i - 1];
			}
			ret[i] += s[i][t[i]];
			last[t[i]] = i + 1;
			for (int j = 0; j < n; j++) {
				ret[i] -= c[j] * (i + 1 - last[j]);
			}
		}
		return ret;
	}
}
