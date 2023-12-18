import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N, Q;
	int[] c;
	int[] l, r;
	Map<Integer, Integer>[] memos;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		Q = Integer.parseInt(tokens[1]);
		c = new int[N];
		l = new int[Q];
		r = new int[Q];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			c[i] = Integer.parseInt(tokens[i]);
		}
		for (int i = 0; i < Q; ++i) {
			tokens = in.readLine().split(" ");
			l[i] = Integer.parseInt(tokens[0]) - 1;
			r[i] = Integer.parseInt(tokens[1]) - 1;
		}
		init();
	}

	void init() {
		memos = new Map[N];
		for (int i = 0; i < N; ++i) {
			memos[i] = new HashMap<>();
		}
		memos[0].put(c[0], 0);
		for (int i = 1; i < N; ++i) {
			// 前回分をコピー
			for (Integer key : memos[i - 1].keySet()) {
				memos[i].put(key, memos[i - 1].get(key));
			}
			// 今回分を反映
			memos[i].put(c[i], i);
		}
	}

	int eval(int l, int r) {
		if (l == 0) {
			return memos[r].size();
		}
		int count = 0;
		for (Integer key : memos[r].keySet()) {
			if (memos[l - 1].get(key) != memos[r].get(key)) {
				++count;
			}
		}
		return count;
	}

	void calc() {
		for (int i = 0; i < Q; ++i) {
			System.out.println(eval(l[i], r[i]));
		}

	}

	void showResult() {
	}
}
