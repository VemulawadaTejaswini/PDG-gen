import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sa[i]);
		}
		sa = br.readLine().split(" ");
		long[] b = new long[m];
		for (int i = 0; i < m; i++) {
			b[i] = Long.parseLong(sa[i]);
		}
		br.close();

		long[] ans = Convolution.convolutionLL(a, b, 998244353);
		int end = n + m - 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < end; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}

/**
 * 畳み込み
 */
class Convolution {

	/**
	 * 畳み込み<br>
	 * 制約：n = |a|+|b|として、n - 1 ≦ 2^c かつ (mod - 1)が2^cで割り切れる<br>
	 * O(n log n + log mod)
	 *
	 * @param a 数列
	 * @param b 数列
	 * @param mod NTT用素数（998244353, 1053818881, 1004535809, ...）
	 * @return ret[i] = sum(j=0～i) {a[j] * b[i-j]}
	 */
	public static long[] convolution(long[] a, long[] b, int mod) {
		int n = a.length;
		int m = b.length;
		if (n == 0 || m == 0) {
			return new long[0];
		}

		int z = 1 << ceilPow2(n + m - 1);
		{
			long[] na = new long[z];
			long[] nb = new long[z];
			System.arraycopy(a, 0, na, 0, n);
			System.arraycopy(b, 0, nb, 0, m);
			a = na;
			b = nb;
		}

		int g = primitiveRoot(mod);
		long[] sume = sumE(mod, g);
		long[] sumie = sumIE(mod, g);

		butterfly(a, sume, mod);
		butterfly(b, sume, mod);
		for (int i = 0; i < z; i++) {
			a[i] = a[i] * b[i] % mod;
		}
		butterflyInv(a, sumie, mod);
		a = Arrays.copyOf(a, n + m - 1);

		long iz = powMod(z, mod - 2, mod);
		for (int i = 0; i < n + m - 1; i++)
			a[i] = a[i] * iz % mod;
		return a;
	}

	/**
	 * 畳み込み<br>
	 * 制約：n = |a|+|b|として、n - 1 ≦ 2^24<br>
	 * O(n log n)
	 *
	 * @param a 数列
	 * @param b 数列
	 * @param mod 任意のmod
	 * @return ret[i] = sum(j=0～i) {a[j] * b[i-j]}
	 */
	public static long[] convolutionLL(long[] a, long[] b, int mod) {
		int n = a.length;
		int m = b.length;
		if (n == 0 || m == 0)
			return new long[0];

		int mod1 = 754974721;
		int mod2 = 167772161;
		int mod3 = 469762049;

		long[] c1 = convolution(a, b, mod1);
		long[] c2 = convolution(a, b, mod2);
		long[] c3 = convolution(a, b, mod3);

		int retSize = c1.length;
		long[] ret = new long[retSize];
		int[] mods = { mod1, mod2, mod3, mod };
		for (int i = 0; i < retSize; ++i) {
			ret[i] = garner(new long[] { c1[i], c2[i], c3[i] }, mods);
		}
		return ret;
	}

	private static int primitiveRoot(int m) {
		if (m == 2) return 1;
		if (m == 167772161) return 3;
		if (m == 469762049) return 3;
		if (m == 754974721) return 11;
		if (m == 998244353) return 3;

		int[] divs = new int[20];
		divs[0] = 2;
		int cnt = 1;
		int x = (m - 1) / 2;
		while (x % 2 == 0) {
			x /= 2;
		}
		for (int i = 3; (long) (i) * i <= x; i += 2) {
			if (x % i == 0) {
				divs[cnt++] = i;
				while (x % i == 0) {
					x /= i;
				}
			}
		}
		if (x > 1) {
			divs[cnt++] = x;
		}
		for (int g = 2;; g++) {
			boolean ok = true;
			for (int i = 0; i < cnt; i++) {
				if (powMod(g, (m - 1) / divs[i], m) == 1) {
					ok = false;
					break;
				}
			}
			if (ok) return g;
		}
	}

	private static long powMod(long x, long n, int m) {
		if (m == 1) return 0;
		long r = 1;
		long y = x % m;
		while (n > 0) {
			if ((n & 1) != 0) r = (r * y) % m;
			y = (y * y) % m;
			n >>= 1;
		}
		return r;
	}

	private static int ceilPow2(int n) {
		int x = 0;
		while ((1L << x) < n) {
			x++;
		}
		return x;
	}

	private static long[] sumE(int mod, int g) {
		long[] sum_e = new long[30];
		long[] es = new long[30];
		long[] ies = new long[30];
		int cnt2 = Integer.numberOfTrailingZeros(mod - 1);
		long e = powMod(g, (mod - 1) >> cnt2, mod);
		long ie = powMod(e, mod - 2, mod);
		for (int i = cnt2; i >= 2; i--) {
			es[i - 2] = e;
			ies[i - 2] = ie;
			e = e * e % mod;
			ie = ie * ie % mod;
		}
		long now = 1;
		for (int i = 0; i < cnt2 - 2; i++) {
			sum_e[i] = es[i] * now % mod;
			now = now * ies[i] % mod;
		}
		return sum_e;
	}

	private static long[] sumIE(int mod, int g) {
		long[] sum_ie = new long[30];
		long[] es = new long[30];
		long[] ies = new long[30];

		int cnt2 = Integer.numberOfTrailingZeros(mod - 1);
		long e = powMod(g, (mod - 1) >> cnt2, mod);
		long ie = powMod(e, mod - 2, mod);
		for (int i = cnt2; i >= 2; i--) {
			es[i - 2] = e;
			ies[i - 2] = ie;
			e = e * e % mod;
			ie = ie * ie % mod;
		}
		long now = 1;
		for (int i = 0; i < cnt2 - 2; i++) {
			sum_ie[i] = ies[i] * now % mod;
			now = now * es[i] % mod;
		}
		return sum_ie;
	}

	private static void butterfly(long[] a, long[] sumE, int mod) {
		int n = a.length;
		int h = ceilPow2(n);

		for (int ph = 1; ph <= h; ph++) {
			int w = 1 << (ph - 1), p = 1 << (h - ph);
			long now = 1;
			for (int s = 0; s < w; s++) {
				int offset = s << (h - ph + 1);
				for (int i = 0; i < p; i++) {
					long l = a[i + offset];
					long r = a[i + offset + p] * now % mod;
					a[i + offset] = (l + r) % mod;
					a[i + offset + p] = (l - r + mod) % mod;
				}
				int x = Integer.numberOfTrailingZeros(~s);
				now = now * sumE[x] % mod;
			}
		}
	}

	private static void butterflyInv(long[] a, long[] sumIE, int mod) {
		int n = a.length;
		int h = ceilPow2(n);

		for (int ph = h; ph >= 1; ph--) {
			int w = 1 << (ph - 1), p = 1 << (h - ph);
			long inow = 1;
			for (int s = 0; s < w; s++) {
				int offset = s << (h - ph + 1);
				for (int i = 0; i < p; i++) {
					long l = a[i + offset];
					long r = a[i + offset + p];
					a[i + offset] = (l + r) % mod;
					a[i + offset + p] = (mod + l - r) * inow % mod;
				}
				int x = Integer.numberOfTrailingZeros(~s);
				inow = inow * sumIE[x] % mod;
			}
		}
	}

	private static long garner(long[] c, int[] mods) {
		int n = c.length + 1;
		long[] cnst = new long[n];
		long[] coef = new long[n];
		Arrays.fill(coef, 1);
		for (int i = 0; i < n - 1; i++) {
			int m1 = mods[i];
			long v = (c[i] - cnst[i] + m1) % m1;
			v = v * powMod(coef[i], m1 - 2, m1) % m1;

			for (int j = i + 1; j < n; j++) {
				long m2 = mods[j];
				cnst[j] = (cnst[j] + coef[j] * v) % m2;
				coef[j] = (coef[j] * m1) % m2;
			}
		}
		return cnst[n - 1];
	}
}
