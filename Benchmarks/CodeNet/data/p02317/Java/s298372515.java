import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;
class Rev<A extends Comparable<A>> implements Comparable<Rev<A>> {
	A a;

	Rev(A a) {
		this.a = a;
	}

	static <A extends Comparable<A>> Rev<A> make(A a) {
		return new Rev<A>(a);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Rev))
			return false;
		Rev<?> r = (Rev<?>) o;
		return a == null ? r.a == null : a.equals(r.a);
	}

	public int compareTo(Rev<A> o) {
		return -a.compareTo(o.a);
	}

	public String toString() {
		return "-(" + a.toString() + ")";
	}
}

class Flat<A> implements Comparable<Flat<A>> {
	A a;

	Flat(A a) {
		this.a = a;
	}

	static <A> Flat<A> make(A a) {
		return new Flat<A>(a);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Flat))
			return false;
		Flat<?> r = (Flat<?>) o;
		return a == null ? r.a == null : a.equals(r.a);
	}

	public int compareTo(Flat<A> o) {
		return 0;
	}

	public String toString() {
		return "0(" + a.toString() + ")";
	}
}

class UP<A, B> { // Unordered Pair
	A a;
	B b;

	UP(A a, B b) {
		this.a = a;
		this.b = b;
	}

	static <A, B> UP<A, B> make(A a, B b) {
		return new UP<A, B>(a, b);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof UP))
			return false;
		UP<?, ?> p = (UP<?, ?>) o;
		boolean aok = a == null ? p.a == null : a.equals(p.a);
		boolean bok = b == null ? p.b == null : b.equals(p.b);
		return aok && bok;
	}

	public String toString() {
		return "(" + a.toString() + ", " + b.toString() + ")";
	}
}

class P<A extends Comparable<A>, B extends Comparable<B>> extends UP<A, B> implements Comparable<P<A, B>> { // Pair
	P(A a, B b) {
		super(a, b);
	}

	static <A extends Comparable<A>, B extends Comparable<B>> P<A, B> make(A a, B b) {
		return new P<A, B>(a, b);
	}

	public int compareTo(P<A, B> o) {
		int sa = a.compareTo(o.a);
		int sb = b.compareTo(o.b);
		return sa != 0 ? sa : sb;
	}
}

class UT<A, B, C> { // Unordered Tuple
	A a;
	B b;
	C c;

	UT(A a, B b, C c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	static <A, B, C> UT<A, B, C> make(A a, B b, C c) {
		return new UT<A, B, C>(a, b, c);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof UT))
			return false;
		UT<?, ?, ?> t = (UT<?, ?, ?>) o;
		boolean aok = a == null ? t.a == null : a.equals(t.a);
		boolean bok = b == null ? t.b == null : b.equals(t.b);
		boolean cok = c == null ? t.c == null : c.equals(t.c);
		return aok && bok && cok;
	}

	public String toString() {
		return "(" + a.toString() + ", " + b.toString() + ", " + c.toString() + ")";
	}
}

class T<A extends Comparable<A>, B extends Comparable<B>, C extends Comparable<C>> extends UT<A, B, C> implements
		Comparable<T<A, B, C>> { // Tuple
	T(A a, B b, C c) {
		super(a, b, c);
	}

	static <A extends Comparable<A>, B extends Comparable<B>, C extends Comparable<C>> T<A, B, C> make(A a, B b, C c) {
		return new T<A, B, C>(a, b, c);
	}

	public int compareTo(T<A, B, C> o) {
		int sa = a.compareTo(o.a);
		int sb = b.compareTo(o.b);
		int sc = c.compareTo(o.c);
		return sa != 0 ? sa : sb != 0 ? sb : sc;
	}
}
class U { // Utilities
	static <A> ArrayList<A> make(int n, FIX<A> maker) {
		ArrayList<A> res = new ArrayList<A>();
		for (int i = 0; i < n; i++)
			res.add(maker.f(i));
		return res;
	}

	static <A> ArrayList<A> filter(ArrayList<A> as, FXB<A> pred) {
		ArrayList<A> res = new ArrayList<A>();
		for (A a : as)
			if (pred.f(a))
				res.add(a);
		return res;
	}

	static <A> int count(ArrayList<A> as, FXB<A> pred) {
		int res = 0;
		for (A a : as)
			if (pred.f(a))
				res++;
		return res;
	}

	static <A> ArrayList<A> concat(ArrayList<A> as, ArrayList<A> bs) {
		ArrayList<A> res = new ArrayList<A>();
		res.addAll(as);
		res.addAll(bs);
		return res;
	}

	static <A> boolean any(ArrayList<A> as, FXB<A> pred) {
		for (A a : as)
			if (pred.f(a))
				return true;
		return false;
	}

	static <A> boolean all(ArrayList<A> as, FXB<A> pred) {
		for (A a : as)
			if (!pred.f(a))
				return false;
		return true;
	}

	static <A> ArrayList<A> flatten(ArrayList<ArrayList<A>> ass) {
		ArrayList<A> res = new ArrayList<A>();
		for (ArrayList<A> as : ass)
			res.addAll(as);
		return res;
	}

	static <A, B> B foldl(ArrayList<A> as, FXXX<B, A, B> f, B e) {
		B res = e;
		for (A a : as)
			res = f.f(res, a);
		return res;
	}

	static <A, B> B foldr(ArrayList<A> as, FXXX<A, B, B> f, B e) {
		B res = e;
		for (int i = as.size() - 1; i >= 0; i--)
			res = f.f(as.get(i), res);
		return res;
	}

	static <A> ArrayList<A> reverse(ArrayList<A> as) {
		int size = as.size();
		return make(size, i -> as.get(size - 1 - i));
	}

	static <A> void forEach(ArrayList<A> as, FXV<A> f) {
		for (A a : as)
			f.f(a);
	}

	static <A extends Comparable<A>> UP<TreeMap<A, Integer>, ArrayList<A>> compress(ArrayList<A> as) {
		TreeSet<A> set = new TreeSet<A>(as);
		TreeMap<A, Integer> map = new TreeMap<A, Integer>();
		ArrayList<A> imap = new ArrayList<A>();
		int i = 0;
		for (A a : set) {
			map.put(a, i++);
			imap.add(a);
		}
		return UP.make(map, imap);
	}

	static <A, B> ArrayList<B> map(ArrayList<A> as, FXX<A, B> f) {
		return make(as.size(), (i) -> f.f(as.get(i)));
	}

	static <A, B> ArrayList<B> mapi(ArrayList<A> as, FXIX<A, B> f) {
		return make(as.size(), (i) -> f.f(as.get(i), i));
	}

	static <A, B> ArrayList<UP<A, B>> zip(ArrayList<A> as, ArrayList<B> bs) {
		return make(min(as.size(), bs.size()), (i) -> UP.make(as.get(i), bs.get(i)));
	}

	static <A extends Comparable<A>> A min(A a, A b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	static <A extends Comparable<A>> A max(A a, A b) {
		return a.compareTo(b) > 0 ? a : b;
	}

	static <A extends Comparable<A>> A clamp(A a, A min, A max) {
		return a.compareTo(min) < 0 ? min : a.compareTo(max) > 0 ? max : a;
	}

	static <A> ArrayList<A> toAL(A[] as) {
		return make(as.length, i -> as[i]);
	}

	static <A> A[] doubleSize(A[] as) {
		return Arrays.copyOf(as, as.length << 1);
	}

	static long bsl(long ng, long ok, FLB isOk) {
		while (ng - ok > 1 || ok - ng > 1) {
			long mid = ng + ok >> 1;
			if (isOk.f(mid))
				ok = mid;
			else
				ng = mid;
		}
		return ok;
	}

	static int bsi(int ng, int ok, FIB isOk) {
		return (int) bsl((long) ng, (long) ok, (mid) -> isOk.f((int) mid));
	}
}

//Javaはラムダ式の型記法を導入しろ
//Javaは可変長型引数を導入しろ
interface FVV { void f(); }
interface FBV { void f(boolean a); }
interface FBXV<A> { void f(boolean a, A b); }
interface FBXXV<A, B> { void f(boolean a, A b, B c); }
interface FBXXXV<A, B, C> { void f(boolean a, A b, B c, C d); }
interface FXBV<A> { void f(A a, boolean b); }
interface FXXBV<A, B> { void f(A a, B b, boolean c); }
interface FXXXBV<A, B, C> { void f(A a, B b, C c, boolean d); }
interface FIV { void f(int a); }
interface FIXV<A> { void f(int a, A b); }
interface FIXXV<A, B> { void f(int a, A b, B c); }
interface FIXXXV<A, B, C> { void f(int a, A b, B c, C d); }
interface FXIV<A> { void f(A a, int b); }
interface FXXIV<A, B> { void f(A a, B b, int c); }
interface FXXXIV<A, B, C> { void f(A a, B b, C c, int d); }
interface FLV { void f(long a); }
interface FLXV<A> { void f(long a, A b); }
interface FLXXV<A, B> { void f(long a, A b, B c); }
interface FLXXXV<A, B, C> { void f(long a, A b, B c, C d); }
interface FXLV<A> { void f(A a, long b); }
interface FXXLV<A, B> { void f(A a, B b, long c); }
interface FXXXLV<A, B, C> { void f(A a, B b, C c, long d); }
interface FXV<A> { void f(A a); }
interface FXXV<A, B> { void f(A a, B b); }
interface FXXXV<A, B, C> { void f(A a, B b, C c); }
interface FXXXXV<A, B, C, D> { void f(A a, B b, C c, D d); }
interface FVB { boolean f(); }
interface FBB { boolean f(boolean a); }
interface FBXB<A> { boolean f(boolean a, A b); }
interface FBXXB<A, B> { boolean f(boolean a, A b, B c); }
interface FBXXXB<A, B, C> { boolean f(boolean a, A b, B c, C d); }
interface FXBB<A> { boolean f(A a, boolean b); }
interface FXXBB<A, B> { boolean f(A a, B b, boolean c); }
interface FXXXBB<A, B, C> { boolean f(A a, B b, C c, boolean d); }
interface FIB { boolean f(int a); }
interface FIXB<A> { boolean f(int a, A b); }
interface FIXXB<A, B> { boolean f(int a, A b, B c); }
interface FIXXXB<A, B, C> { boolean f(int a, A b, B c, C d); }
interface FXIB<A> { boolean f(A a, int b); }
interface FXXIB<A, B> { boolean f(A a, B b, int c); }
interface FXXXIB<A, B, C> { boolean f(A a, B b, C c, int d); }
interface FLB { boolean f(long a); }
interface FLXB<A> { boolean f(long a, A b); }
interface FLXXB<A, B> { boolean f(long a, A b, B c); }
interface FLXXXB<A, B, C> { boolean f(long a, A b, B c, C d); }
interface FXLB<A> { boolean f(A a, long b); }
interface FXXLB<A, B> { boolean f(A a, B b, long c); }
interface FXXXLB<A, B, C> { boolean f(A a, B b, C c, long d); }
interface FXB<A> { boolean f(A a); }
interface FXXB<A, B> { boolean f(A a, B b); }
interface FXXXB<A, B, C> { boolean f(A a, B b, C c); }
interface FXXXXB<A, B, C, D> { boolean f(A a, B b, C c, D d); }
interface FVI { int f(); }
interface FBI { int f(boolean a); }
interface FBXI<A> { int f(boolean a, A b); }
interface FBXXI<A, B> { int f(boolean a, A b, B c); }
interface FBXXXI<A, B, C> { int f(boolean a, A b, B c, C d); }
interface FXBI<A> { int f(A a, boolean b); }
interface FXXBI<A, B> { int f(A a, B b, boolean c); }
interface FXXXBI<A, B, C> { int f(A a, B b, C c, boolean d); }
interface FII { int f(int a); }
interface FIXI<A> { int f(int a, A b); }
interface FIXXI<A, B> { int f(int a, A b, B c); }
interface FIXXXI<A, B, C> { int f(int a, A b, B c, C d); }
interface FXII<A> { int f(A a, int b); }
interface FXXII<A, B> { int f(A a, B b, int c); }
interface FXXXII<A, B, C> { int f(A a, B b, C c, int d); }
interface FLI { int f(long a); }
interface FLXI<A> { int f(long a, A b); }
interface FLXXI<A, B> { int f(long a, A b, B c); }
interface FLXXXI<A, B, C> { int f(long a, A b, B c, C d); }
interface FXLI<A> { int f(A a, long b); }
interface FXXLI<A, B> { int f(A a, B b, long c); }
interface FXXXLI<A, B, C> { int f(A a, B b, C c, long d); }
interface FXI<A> { int f(A a); }
interface FXXI<A, B> { int f(A a, B b); }
interface FXXXI<A, B, C> { int f(A a, B b, C c); }
interface FXXXXI<A, B, C, D> { int f(A a, B b, C c, D d); }
interface FVL { long f(); }
interface FBL { long f(boolean a); }
interface FBXL<A> { long f(boolean a, A b); }
interface FBXXL<A, B> { long f(boolean a, A b, B c); }
interface FBXXXL<A, B, C> { long f(boolean a, A b, B c, C d); }
interface FXBL<A> { long f(A a, boolean b); }
interface FXXBL<A, B> { long f(A a, B b, boolean c); }
interface FXXXBL<A, B, C> { long f(A a, B b, C c, boolean d); }
interface FIL { long f(int a); }
interface FIXL<A> { long f(int a, A b); }
interface FIXXL<A, B> { long f(int a, A b, B c); }
interface FIXXXL<A, B, C> { long f(int a, A b, B c, C d); }
interface FXIL<A> { long f(A a, int b); }
interface FXXIL<A, B> { long f(A a, B b, int c); }
interface FXXXIL<A, B, C> { long f(A a, B b, C c, int d); }
interface FLL { long f(long a); }
interface FLXL<A> { long f(long a, A b); }
interface FLXXL<A, B> { long f(long a, A b, B c); }
interface FLXXXL<A, B, C> { long f(long a, A b, B c, C d); }
interface FXLL<A> { long f(A a, long b); }
interface FXXLL<A, B> { long f(A a, B b, long c); }
interface FXXXLL<A, B, C> { long f(A a, B b, C c, long d); }
interface FXL<A> { long f(A a); }
interface FXXL<A, B> { long f(A a, B b); }
interface FXXXL<A, B, C> { long f(A a, B b, C c); }
interface FXXXXL<A, B, C, D> { long f(A a, B b, C c, D d); }
interface FVX<A> { A f(); }
interface FBX<A> { A f(boolean a); }
interface FBXX<A, B> { B f(boolean a, A b); }
interface FBXXX<A, B, C> { C f(boolean a, A b, B c); }
interface FBXXXX<A, B, C, D> { D f(boolean a, A b, B c, C d); }
interface FXBX<A, B> { B f(A a, boolean b); }
interface FXXBX<A, B, C> { C f(A a, B b, boolean c); }
interface FXXXBX<A, B, C, D> { D f(A a, B b, C c, boolean d); }
interface FIX<A> { A f(int a); }
interface FIXX<A, B> { B f(int a, A b); }
interface FIXXX<A, B, C> { C f(int a, A b, B c); }
interface FIXXXX<A, B, C, D> { D f(int a, A b, B c, C d); }
interface FXIX<A, B> { B f(A a, int b); }
interface FXXIX<A, B, C> { C f(A a, B b, int c); }
interface FXXXIX<A, B, C, D> { D f(A a, B b, C c, int d); }
interface FLX<A> { A f(long a); }
interface FLXX<A, B> { B f(long a, A b); }
interface FLXXX<A, B, C> { C f(long a, A b, B c); }
interface FLXXXX<A, B, C, D> { D f(long a, A b, B c, C d); }
interface FXLX<A, B> { B f(A a, long b); }
interface FXXLX<A, B, C> { C f(A a, B b, long c); }
interface FXXXLX<A, B, C, D> { D f(A a, B b, C c, long d); }
interface FXX<A, B> { B f(A a); }
interface FXXX<A, B, C> { C f(A a, B b); }
interface FXXXX<A, B, C, D> { D f(A a, B b, C c); }
interface FXXXXX<A, B, C, D, E> { E f(A a, B b, C c, D d); }

class Algebra {
	static <A extends Comparable<A>> A gcd(A a, A b, FXXX<A, A, A> mod, FXX<A, A> neg, A zero) {
		int sa = a.compareTo(zero);
		int sb = b.compareTo(zero);
		if (sa == 0)
			return b;
		if (sb == 0)
			return a;
		if (sa < 0)
			a = neg.f(a);
		if (sb < 0)
			b = neg.f(b);
		if (a.compareTo(b) < 0) {
			A tmp = a;
			a = b;
			b = tmp;
		}
		while (true) {
			A c = mod.f(a, b);
			if (c.equals(zero))
				return b;
			a = b;
			b = c;
		}
	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		if (a < 0)
			a = -a;
		if (b < 0)
			b = -b;
		if (a < b) {
			a ^= b;
			b ^= a;
			a ^= b;
		}
		while (true) {
			long c = a % b;
			if (c == 0)
				return b;
			a = b;
			b = c;
		}
	}

	static int gcd(int a, int b) {
		return (int) gcd((long) a, (long) b);
	}

	static <A extends Comparable<A>> int[] lis(FIX<A> access, int size) {
		Object[] dp = new Object[size];
		int[][] dpIndices = new int[size][2];
		dp[0] = access.f(0);
		int len = 1;
		int lidx = 0;
		for (int i = 1; i < size; i++) {
			A ai = access.f(i);
			@SuppressWarnings("unchecked")
			int idx = U.bsi(-1, len, j -> ai.compareTo((A) dp[j]) <= 0);
			dp[idx] = ai;
			dpIndices[idx][0] = i;
			if (idx == len) {
				lidx = i;
				len++;
			}
			if (idx > 0)
				dpIndices[i][1] = dpIndices[idx - 1][0];
		}
		int[] res = new int[len];
		res[len - 1] = lidx;
		for (int i = len - 1; i >= 0; i--) {
			res[i] = lidx;
			lidx = dpIndices[lidx][1];
		}
		return res;
	}
}

public class Main {
	private static void solve() {
		int n = nei();
		long[] as = nls(n);
		out(Algebra.lis(i -> as[i], n).length);
	}

	// returns (x, y, d) s.t. ax + by = d
	static long[] exgcd(long a, long b) {
		int sa = a < 0 ? -1 : 1;
		int sb = b < 0 ? -1 : 1;
		a *= sa;
		b *= sb;
		long x = 1;
		long y = 0;
		long z = 0;
		long w = 1;
		while (b > 0) {
			long q = a / b;
			long t = z;
			z = x - q * z;
			x = t;
			t = w;
			w = y - q * w;
			y = t;
			t = b;
			b = a - q * b;
			a = t;
		}
		return new long[] { x * sa, y * sb, a };
	}

	static int[] lis(int[] s) {
		int n = s.length;
		int[] dp = new int[n];
		int[] ids = new int[n];
		int[] pids = new int[n];
		dp[0] = s[0];
		int len = 1;
		int lidx = 0;
		for (int i = 1; i < n; i++) {
			int idx = bs(s[i], dp, 0, len);
			dp[idx] = s[i];
			ids[idx] = i;
			if (idx == len) {
				lidx = i;
				len++;
			}
			if (idx > 0)
				pids[i] = ids[idx - 1];
		}
		int[] lis = new int[len];
		lis[len - 1] = s[lidx];
		for (int i = len - 1; i >= 0; i--) {
			lis[i] = s[lidx];
			lidx = pids[lidx];
		}
		return lis;
	}

	static int bs(int a, int[] as, int from, int num) {
		int min = from;
		int max = from + num - 1;
		while (min < max) {
			int mid = min + max >> 1;
			if (as[mid] < a)
				min = mid + 1;
			else if (as[mid] > a)
				max = mid;
			else
				return mid;
		}
		return as[min] < a ? min + 1 : min;
	}

	static int gcd(int x, int y) {
		x = (x ^ x >> 31) - (x >> 31);
		y = (y ^ y >> 31) - (y >> 31);
		if (x < y) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		int z = x % y;
		if (z == 0)
			return y;
		return gcd(y, z);
	}

	static long gcd(long x, long y) {
		x = (x ^ x >> 63) - (x >> 63);
		y = (y ^ y >> 63) - (y >> 63);
		if (x < y) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		long z = x % y;
		if (z == 0)
			return y;
		return gcd(y, z);
	}

	static long modinv(long a, long mod) {
		return modpow(a, mod - 2, mod);
	}

	static long modpow(long a, long b, long mod) {
		if (b == 0)
			return 1;
		if ((b & 1) == 0) {
			long sqrt = modpow(a, b >> 1, mod);
			return sqrt * sqrt % mod;
		}
		return a * modpow(a, b - 1, mod) % mod;
	}

	static long fact(long n) {
		if (n <= 1)
			return 1;
		long res = 2;
		for (long i = 3; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	static long modfact(long n, long mod) {
		if (n <= 1)
			return 1 % mod;
		long res = 2;
		for (long i = 3; i <= n; i++) {
			res *= i;
			res %= mod;
		}
		return res % mod;
	}

	// returns facts([0]) and invfacts([1])
	static long[][] enumfacts(int n, long mod) {
		int num = n + 10;
		long[][] res = new long[2][num];
		long[] facts = res[0];
		long[] invfacts = res[1];
		for (int i = 0; i < num; i++) {
			if (i <= 1) {
				facts[i] = 1;
				invfacts[i] = 1;
			} else {
				facts[i] = facts[i - 1] * i % mod;
				invfacts[i] = modinv(facts[i], mod);
			}
		}
		return res;
	}

	static long modcomb(long n, long m, long mod) {
		if (m > n)
			return 0;
		if (m > n - m) {
			m = n - m;
		}
		long numer = 1;
		for (int i = 0; i < m; i++) {
			numer = numer * (n - i) % mod;
		}
		long denom = modfact(m, mod);
		return numer * modinv(denom, mod) % mod;
	}

	static long modcomb(int n, int m, long[] facts, long[] invfacts, long mod) {
		if (m > n)
			return 0;
		long numer = facts[n];
		long denom = invfacts[m] * invfacts[n - m] % mod;
		return numer * denom % mod;
	}

	// res[i][0]: prime factor, res[i][1]: exponent
	static int[][] factorize(int n) {
		int[][] pfs = new int[32][2];
		int num = 0;
		for (int i = 2; i * i <= n; i++) {
			int count = 0;
			while (n % i == 0) {
				n /= i;
				count++;
			}
			if (count > 0) {
				pfs[num][0] = i;
				pfs[num][1] = count;
				num++;
			}
		}
		if (n > 1) {
			pfs[num][0] = n;
			pfs[num][1] = 1;
			num++;
		}
		int[][] res = new int[num][2];
		for (int i = 0; i < num; i++) {
			res[i][0] = pfs[i][0];
			res[i][1] = pfs[i][1];
		}
		return res;
	}

	static long lcm(long x, long y) {
		x = (x ^ x >> 63) - (x >> 63);
		y = (y ^ y >> 63) - (y >> 63);
		return x / gcd(x, y) * y;
	}

	static int abs(int x) {
		return x < 0 ? -x : x;
	}

	static long abs(long x) {
		return x < 0 ? -x : x;
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}

	static long min(long a, long b) {
		return a < b ? a : b;
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static long max(long a, long b) {
		return a > b ? a : b;
	}

	static int clamp(int a, int min, int max) {
		return a < min ? min : a > max ? max : a;
	}

	static long clamp(long a, long min, long max) {
		return a < min ? min : a > max ? max : a;
	}

	static double clamp(double a, double min, double max) {
		return a < min ? min : a > max ? max : a;
	}

	static void out(String val) {
		IO.out(val);
	}

	static void out(Object val) {
		IO.out(String.valueOf(val));
	}

	static void out(int val) {
		IO.out(String.valueOf(val));
	}

	static void out(long val) {
		IO.out(String.valueOf(val));
	}

	static void out(char val) {
		IO.out(String.valueOf(val));
	}

	static void out(double val) {
		IO.out(Double.isFinite(val) ? BigDecimal.valueOf(val).toPlainString() : String.valueOf(val));
	}

	static void out(boolean val) {
		IO.out(val ? "true" : "false");
	}

	static void kil(String val) {
		IO.out(val);
		IO.flush();
		System.exit(0);
	}

	static void kil(Object val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(int val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(long val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(char val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(double val) {
		IO.out(Double.isFinite(val) ? BigDecimal.valueOf(val).toPlainString() : String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(boolean val) {
		IO.out(val ? "true" : "false");
		IO.flush();
		System.exit(0);
	}

	static String nes() {
		return IO.next();
	}

	static int nei() {
		return IO.nextInt();
	}

	static long nel() {
		return IO.nextLong();
	}

	static double ned() {
		return IO.nextDouble();
	}

	static char nec() {
		return IO.nextChar();
	}

	static String[] nss(int n) {
		String[] as = new String[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.next();
		}
		return as;
	}

	static int[] nis(int n) {
		int[] as = new int[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextInt();
		}
		return as;
	}

	static long[] nls(int n) {
		long[] as = new long[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextLong();
		}
		return as;
	}

	static double[] nds(int n) {
		double[] as = new double[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextDouble();
		}
		return as;
	}

	static char[] ncs(int n) {
		char[] as = new char[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextChar();
		}
		return as;
	}

	static String[][] nss2(int n, int m) {
		String[][] as = new String[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.next();
			}
		}
		return as;
	}

	static int[][] nis2(int n, int m) {
		int[][] as = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextInt();
			}
		}
		return as;
	}

	static long[][] nls2(int n, int m) {
		long[][] as = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextLong();
			}
		}
		return as;
	}

	static double[][] nds2(int n, int m) {
		double[][] as = new double[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextDouble();
			}
		}
		return as;
	}

	static char[][] ncs2(int n, int m) {
		char[][] as = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextChar();
			}
		}
		return as;
	}

	static int parseInt(String val) {
		return Integer.parseInt(val);
	}

	static int parseInt(char val) {
		return Integer.parseInt(String.valueOf(val));
	}

	static long parseLong(String val) {
		return Long.parseLong(val);
	}

	public static void main(String[] args) {
		try {
			solve();
			IO.flush();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}

final class IO {
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out, false);
	private static final byte[] buffer = new byte[1024];
	private static int ptr = 0;
	private static int len = 0;

	private static boolean hasNextByte() {
		if (ptr < len)
			return true;
		ptr = 0;
		try {
			len = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return len > 0;
	}

	private static int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	static boolean hasNext() {
		byte c;
		while (hasNextByte() && ((c = buffer[ptr]) < '!' || c > '~'))
			ptr++;
		return hasNextByte();
	}

	static String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (b >= '!' && b <= '~') {
			sb.append((char) b);
			b = readByte();
		}
		return sb.toString();
	}

	static char nextChar() {
		if (!hasNext())
			throw new NoSuchElementException();
		return (char) readByte();
	}

	static long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	static int nextInt() {
		if (!hasNext())
			throw new NoSuchElementException();
		int n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	static double nextDouble() {
		return Double.parseDouble(next());
	}

	static void out(String val) {
		out.println(val);
	}

	static void flush() {
		out.flush();
	}
}

