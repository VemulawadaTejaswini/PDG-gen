import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    static int MOD = 998244353;
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int q = sc.nextInt();
		S[] array = new S[n];
		for(int i = 0; i < n; i++){
		    array[i] = new S(1L, 1);
		}
		LazySegTree<S, F> seg = new LazySegTree<S, F>(array, S::op, S.E, F::map, F::composite, F.I);
		//System.out.println("array:" + Arrays.toString(array));
		//System.out.println("seg  :" + seg.toString());
		
		for(int i = 0; i < q; i++){
		    int l = sc.nextInt()-1;
		    int r = sc.nextInt()-1;
		    long d = sc.nextLong();
		    seg.apply(l, r+1, new F(d));
		    //System.out.println("array:" + Arrays.toString(array));
		    //System.out.println("seg  :" + seg.toString());
		    System.out.println(seg.allProd().s);
		}
		
		// 計算
		//int result = 0;
		
		// 出力
		//System.out.println(result);
	}
	
	static class S {
		// TODO：単位元Eの定義
		static final S E = new S(0, 0);

		// TODO：Sの元の定義
		long s;
		int keta;
		public S (long s, int keta) {
			this.s = s;
			this.keta = keta;
		}

		// TODO：S上の演算を定義（S×S→S）
		public static S op(S l, S r) {
			long s = (l.s*pow(10, r.keta, MOD) + r.s)%MOD;
			return new S(s, l.keta + r.keta);
		}

		// TODO：toString()の定義（オプション）
		public String toString() {
			return String.valueOf(s) + ":" + String.valueOf(keta);
		}
	}
	
	static class F {
		// TODO：恒等写像の定義
		static final F I = new F(0);
		
	    // TODO：関数のパラメータを定義
		long a;
		public F (long a) {
			this.a = a;
		}
		
		// TODO：関数f(s)の演算を定義
		public static S map(F f, S s) {
			return new S((pow(10, s.keta, MOD)-1+MOD)%MOD*inv(9, MOD)%MOD*f.a, s.keta);
		}

		// TODO：関数fとgの合成を定義（f(g(x))）
		public static F composite(F f, F g) {
		    if(f.a == 0) return g;
			return f;
		}
	}
	
	public static long pow(long a, long n, long MOD) {
		long res=1;
		while (n>0) {
			if ((n-n/2*2)==1) {
				res=(res*a)%MOD;
			}
			a=(a*a)%MOD;
			n>>=1;
		}
		return res%MOD;
	}
	
	public static long inv(long a, long MOD) {
		return pow(a, MOD - 2, MOD);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}

class LazySegTree<S, F> {
	final int MAX;

	final int N;
	final int Log;
	final java.util.function.BinaryOperator<S> Op;
	final S E;
	final java.util.function.BiFunction<F, S, S> Mapping;
	final java.util.function.BinaryOperator<F> Composition;
	final F Id;

	final S[] Dat;
	final F[] Laz;

	@SuppressWarnings("unchecked")
	public LazySegTree(int n, java.util.function.BinaryOperator<S> op, S e, java.util.function.BiFunction<F, S, S> mapping, java.util.function.BinaryOperator<F> composition, F id) {
		this.MAX = n;
		int k = 1;
		while (k < n) k <<= 1;
		this.N = k;
		this.Log = Integer.numberOfTrailingZeros(N);
		this.Op = op;
		this.E = e;
		this.Mapping = mapping;
		this.Composition = composition;
		this.Id = id;
		this.Dat = (S[]) new Object[N << 1];
		this.Laz = (F[]) new Object[N];
		java.util.Arrays.fill(Dat, E);
		java.util.Arrays.fill(Laz, Id);
	}

	public LazySegTree(S[] dat, java.util.function.BinaryOperator<S> op, S e, java.util.function.BiFunction<F, S, S> mapping, java.util.function.BinaryOperator<F> composition, F id) {
		this(dat.length, op, e, mapping, composition, id);
		build(dat);
	}

	private void build(S[] dat) {
		int l = dat.length;
		System.arraycopy(dat, 0, Dat, N, l);
		for (int i = N - 1; i > 0; i--) {
			Dat[i] = Op.apply(Dat[i << 1 | 0], Dat[i << 1 | 1]);
		}
	}

	private void push(int k) {
		if (Laz[k] == Id) return;
		int lk = k << 1 | 0, rk = k << 1 | 1;
		Dat[lk] = Mapping.apply(Laz[k], Dat[lk]);
		Dat[rk] = Mapping.apply(Laz[k], Dat[rk]);
		if (lk < N) Laz[lk] = Composition.apply(Laz[k], Laz[lk]);
		if (rk < N) Laz[rk] = Composition.apply(Laz[k], Laz[rk]);
		Laz[k] = Id;
	}

	private void pushTo(int k) {
		for (int i = Log; i > 0; i--) push(k >> i);
	}

	private void pushTo(int lk, int rk) {
		for (int i = Log; i > 0; i--) {
			if (((lk >> i) << i) != lk) push(lk >> i);
			if (((rk >> i) << i) != rk) push(rk >> i);
		}
	}

	private void updateFrom(int k) {
		k >>= 1;
		while (k > 0) {
			Dat[k] = Op.apply(Dat[k << 1 | 0], Dat[k << 1 | 1]);
			k >>= 1;
		}
	}

	private void updateFrom(int lk, int rk) {
		for (int i = 1; i <= Log; i++) {
			if (((lk >> i) << i) != lk) {
				int lki = lk >> i;
				Dat[lki] = Op.apply(Dat[lki << 1 | 0], Dat[lki << 1 | 1]);
			}
			if (((rk >> i) << i) != rk) {
				int rki = (rk - 1) >> i;
				Dat[rki] = Op.apply(Dat[rki << 1 | 0], Dat[rki << 1 | 1]);
			}
		}
	}

	public void set(int p, S x) {
		exclusiveRangeCheck(p);
		p += N;
		pushTo(p);
		Dat[p] = x;
		updateFrom(p);
	}

	public S get(int p) {
		exclusiveRangeCheck(p);
		p += N;
		pushTo(p);
		return Dat[p];
	}

	public S prod(int l, int r) {
		if (l > r) {
			throw new IllegalArgumentException(
				String.format("Invalid range: [%d, %d)", l, r)
			);
		}
		inclusiveRangeCheck(l);
		inclusiveRangeCheck(r);
		if (l == r) return E;
		l += N; r += N;
		pushTo(l, r);
		S sumLeft = E, sumRight = E;
		while (l < r) {
			if ((l & 1) == 1) sumLeft = Op.apply(sumLeft, Dat[l++]);
			if ((r & 1) == 1) sumRight = Op.apply(Dat[--r], sumRight);
			l >>= 1; r >>= 1;
		}
		return Op.apply(sumLeft, sumRight);
	}

	public S allProd() {
		return Dat[1];
	}

	public void apply(int p, F f) {
		exclusiveRangeCheck(p);
		p += N;
		pushTo(p);
		Dat[p] = Mapping.apply(f, Dat[p]);
		updateFrom(p);
	}

	public void apply(int l, int r, F f) {
		if (l > r) {
			throw new IllegalArgumentException(
				String.format("Invalid range: [%d, %d)", l, r)
			);
		}
		inclusiveRangeCheck(l);
		inclusiveRangeCheck(r);
		if (l == r) return;
		l += N; r += N;
		pushTo(l, r);
		for (int l2 = l, r2 = r; l2 < r2;) {
			if ((l2 & 1) == 1) {
				Dat[l2] = Mapping.apply(f, Dat[l2]);
				if (l2 < N) Laz[l2] = Composition.apply(f, Laz[l2]);
				l2++;
			}
			if ((r2 & 1) == 1) {
				r2--;
				Dat[r2] = Mapping.apply(f, Dat[r2]);
				if (r2 < N) Laz[r2] = Composition.apply(f, Laz[r2]);
			}
			l2 >>= 1; r2 >>= 1;
		}
		updateFrom(l, r);
	}

	public int maxRight(int l, java.util.function.Predicate<S> g) {
		inclusiveRangeCheck(l);
		if (!g.test(E)) {
			throw new IllegalArgumentException("Identity element must satisfy the condition.");
		}
		if (l == MAX) return MAX;
		l += N;
		pushTo(l);
		S sum = E;
		do {
			l >>= Integer.numberOfTrailingZeros(l);
			if (!g.test(Op.apply(sum, Dat[l]))) {
				while (l < N) {
					push(l);
					l = l << 1;
					if (g.test(Op.apply(sum, Dat[l]))) {
						sum = Op.apply(sum, Dat[l]);
						l++;
					}
				}
				return l - N;
			}
			sum = Op.apply(sum, Dat[l]);
			l++;
		} while ((l & -l) != l);
		return MAX;
	}

	public int minLeft(int r, java.util.function.Predicate<S> g) {
		inclusiveRangeCheck(r);
		if (!g.test(E)) {
			throw new IllegalArgumentException("Identity element must satisfy the condition.");
		}
		if (r == 0) return 0;
		r += N;
		pushTo(r - 1);
		S sum = E;
		do {
			r--;
			while (r > 1 && (r & 1) == 1) r >>= 1;
			if (!g.test(Op.apply(Dat[r], sum))) {
				while (r < N) {
					push(r);
					r = r << 1 | 1;
					if (g.test(Op.apply(Dat[r], sum))) {
						sum = Op.apply(Dat[r], sum);
						r--;
					}
				}
				return r + 1 - N;
			}
			sum = Op.apply(Dat[r], sum);
		} while ((r & -r) != r);
		return 0;
	}

	private void exclusiveRangeCheck(int p) {
		if (p < 0 || p >= MAX) {
			throw new IndexOutOfBoundsException(
				String.format("Index %d is not in [%d, %d).", p, 0, MAX)
			);
		}
	}

	private void inclusiveRangeCheck(int p) {
		if (p < 0 || p > MAX) {
			throw new IndexOutOfBoundsException(
				String.format("Index %d is not in [%d, %d].", p, 0, MAX)
			);
		}
	}

	// **************** DEBUG **************** //

	private int indent = 6;

	public void setIndent(int newIndent) {
		this.indent = newIndent;
	}

	@Override
	public String toString() {
		return toSimpleString();
	}

	private S[] simulatePushAll() {
		S[] simDat = java.util.Arrays.copyOf(Dat, 2 * N);
		F[] simLaz = java.util.Arrays.copyOf(Laz, 2 * N);
		for (int k = 1; k < N; k++) {
			if (simLaz[k] == Id) continue;
			int lk = k << 1 | 0, rk = k << 1 | 1;
			simDat[lk] = Mapping.apply(simLaz[k], simDat[lk]);
			simDat[rk] = Mapping.apply(simLaz[k], simDat[rk]);
			if (lk < N) simLaz[lk] = Composition.apply(simLaz[k], simLaz[lk]);
			if (rk < N) simLaz[rk] = Composition.apply(simLaz[k], simLaz[rk]);
			simLaz[k] = Id;
		}
		return simDat;
	}

	public String toDetailedString() {
		return toDetailedString(1, 0, simulatePushAll());
	}

	private String toDetailedString(int k, int sp, S[] dat) {
		if (k >= N) return indent(sp) + dat[k];
		String s = "";
		s += toDetailedString(k << 1 | 1, sp + indent, dat);
		s += "\n";
		s += indent(sp) + dat[k];
		s += "\n";
		s += toDetailedString(k << 1 | 0, sp + indent, dat);
		return s;
	}

	private static String indent(int n) {
		StringBuilder sb = new StringBuilder();
		while (n --> 0) sb.append(' ');
		return sb.toString();
	}

	public String toSimpleString() {
		S[] dat = simulatePushAll();
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (int i = 0; i < N; i++) {
			sb.append(dat[i + N]);
			if (i < N - 1) sb.append(',').append(' ');
		}
		sb.append(']');
		return sb.toString();
	}
}
