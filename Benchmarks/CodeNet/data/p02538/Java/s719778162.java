import java.util.*;
import java.io.*;
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
	long[] mods;
	long mod = 0L;
	long MOD = 998244353L;
	int[] L, R, D;
	int[] lasts;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		Q = Integer.parseInt(tokens[1]);

		L = new int[Q + 1];
		R = new int[Q + 1];
		D = new int[Q + 1];
		L[0] = 0;
		R[0] = N - 1;
		D[0] = 1;
		for (int i = 0; i < Q; ++i) {
			tokens = in.readLine().split(" ");
			L[i + 1] = Integer.parseInt(tokens[0]) - 1;
			R[i + 1] = Integer.parseInt(tokens[1]) - 1;
			D[i + 1] = Integer.parseInt(tokens[2]);
		}

		mods = new long[N];
		mods[N - 1] = 1L;
		for (int i = N - 2; i >= 0; --i) {
			mods[i] = mods[i + 1] * 10L % MOD;
		}

		for (int i = 0; i < N; ++i) {
			mod += mods[i];
			mod %= MOD;
		}

		lasts = new int[N];
		Arrays.fill(lasts, 1);
	}

	void update(int l, int r, int d) {
		// update操作
		for (int i = l; i <= r; ++i) {
			mod += mods[i] * (long) (d - lasts[i]) + MOD;
			mod %= MOD;
			lasts[i] = d;
		}
	}

	void calc() {
		// 初手だけ
		for (int i = 1; i <= Q; ++i) {
			update(L[i], R[i], D[i]);
			System.out.println(mod);
		}
	}

	void showResult() {
	}
}