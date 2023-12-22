import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	int N, Q;
	String S;
	int[] l, r;
	List<Integer> acIndexes;
	int[] memo;
	PrintWriter out = new PrintWriter(System.out);

	Main() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		Q = Integer.parseInt(tokens[1]);
		S = in.readLine();
		l = new int[Q];
		r = new int[Q];
		for (int i = 0; i < Q; ++i) {
			tokens = in.readLine().split(" ");
			l[i] = Integer.parseInt(tokens[0]);
			r[i] = Integer.parseInt(tokens[1]);
		}
		in.close();
	}

	void calc() {
		this.memo = new int[N];
		Arrays.fill(this.memo, 0);
		int count = 0;
		char[] c = S.toCharArray();
		for (int i = 0; i < c.length - 1; ++i) {
			if (c[i] == 'A' && c[i + 1] == 'C') {
				++count;
				this.memo[i] = count;
				this.memo[i + 1] = count;
				++i;
			} else {
				this.memo[i] = count;
			}
		}
		this.memo[this.memo.length - 1] = this.memo[this.memo.length - 2];
		/*
		 * for (int i = 0; i < this.memo.length; ++i) { System.out.println(" " +
		 * this.memo[i]); }
		 */

		for (int i = 0; i < Q; ++i) {
			int left = 0;
			if (l[i] == 1) {
				left = 0;
			} else {
				left = this.memo[l[i] - 2];
			}
			int right = this.memo[r[i] - 2];
			// int left = findRight(this.acIndexes, l[i] - 1);
			// int right = findRight(this.acIndexes, r[i] - 1);
			// System.out.println(left + ", " + right);
			int result = right - left;
			out.println(result);
		}

	}

	public static void main(String[] args) throws IOException {
		Main ins = new Main();
		ins.calc();
		ins.out.flush();
	}

}