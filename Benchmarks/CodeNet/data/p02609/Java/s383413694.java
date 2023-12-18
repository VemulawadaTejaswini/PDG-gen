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

	int N;
	String xStr;
	int[] plusMods, minusMods;
	int plusMod, minusMod;
	int oneCount = 0;
	Map<Integer, Integer> fMemo, popCount;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		xStr = in.readLine();
		for (int i = 0; i < xStr.length(); ++i) {
			if (xStr.charAt(i) == '1') {
				++oneCount;
			}
		}
		fMemo = new HashMap<>();
		popCount = new HashMap<>();
		init();
	}

	void init() {
		plusMods = new int[N];
		minusMods = new int[N];
		plusMods[N - 1] = 1;
		minusMods[N - 1] = 1;
		for (int i = N - 2; i >= 0; --i) {
			plusMods[i] = plusMods[i + 1] * 2 % (oneCount + 1);
			minusMods[i] = minusMods[i + 1] * 2 % (oneCount - 1);
		}
		plusMod = 0;
		minusMod = 0;
		for (int i = 0; i < N; ++i) {
			if (xStr.charAt(i) == '1') {
				plusMod += plusMods[i];
				plusMod %= (oneCount + 1);
				minusMod += minusMods[i];
				minusMod %= (oneCount - 1);
			}
		}
	}

	int f(int val) {

		if (fMemo.containsKey(val)) {
			return fMemo.get(val);
		}
		int p = -1;
		if (popCount.containsKey(val)) {
			p = popCount.get(val);
		} else {
			p = popCount(val);
			popCount.put(val, p);
		}
		int mod = val % p;
		if (mod == 0) {
			fMemo.put(val, 1);
			return 1;
		} else {
			int result = f(mod) + 1;
			fMemo.put(val, result);
			return result;
		}
	}

	int popCount(int val) {
		String s = Integer.toString(val, 2);
		int count = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == '1') {
				++count;
			}
		}
		return count;
	}

	void calc() {
		if (oneCount == 0) {
			// 必ず1回で0になる
			for (int i = 0; i < N; ++i) {
				System.out.println(1);
			}
		} else if (oneCount == 1) {
			// 1のところを反転させるときだけ注意？
			for (int i = 0; i < N; ++i) {
				if (xStr.charAt(i) == '0') {
					// plus側が用いられる
					int mod = plusMod;
					mod += plusMods[i];
					mod %= (oneCount + 1);
					if (mod == 0) {
						System.out.println(1);
					} else if (mod == 1) {
						System.out.println(2);
					} else {
						int result = f(mod) + 1;
						System.out.println(result);
					}
				} else {
					System.out.println(0);
				}
			}
		} else {
			for (int i = 0; i < N; ++i) {
				if (xStr.charAt(i) == '0') {
					// plus側が用いられる
					int mod = plusMod;
					mod += plusMods[i];
					mod %= (oneCount + 1);
					if (mod == 0) {
						System.out.println(1);
					} else if (mod == 1) {
						System.out.println(2);
					} else {
						int result = f(mod) + 1;
						System.out.println(result);
					}
				} else {
					// minus側が用いられる
					int mod = minusMod;
					mod += (oneCount - 1);
					mod -= minusMods[i];
					mod %= (oneCount - 1);
					// System.out.print(minusMod + " " + minusMods[i] + " " + mod + " ");
					if (mod == 0) {
						System.out.println(1);
					} else if (mod == 1) {
						System.out.println(2);
					} else {
						int result = f(mod) + 1;
						System.out.println(result);
					}
				}
			}
		}
	}

	void showResult() {
	}
}