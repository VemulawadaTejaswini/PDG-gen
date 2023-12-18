import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main {
    static final long mod = 998244353;
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var pw = new PrintWriter(System.out);
        final int N = Integer.parseInt(sc.next());
        final int Q = Integer.parseInt(sc.next());
        final var A = new S[N];
        Arrays.setAll(A, i -> new S(Long.parseLong(sc.next()), 1));
        var t = new LazySegTree<S, F>(A, S::op, S.E, Main::map, F::composite, F.I);
        for (int i = 0; i < Q; i++) {
            int query = Integer.parseInt(sc.next());
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            if (query == 0) {
                int a = Integer.parseInt(sc.next());
                int b = Integer.parseInt(sc.next());
                t.apply(l, r, new F(a, b));
            } else {
                pw.println(t.prod(l, r));
            }
        }
        sc.close();
        pw.flush();
        pw.close();
    }

    static long add(long u, long v) {
        long s = u + v;
        return s >= mod ? s - mod : s;
    }

    static S map(F f, S s) {
        return new S((f.a * s.sum + f.b * s.size) % mod, s.size);
    }

    static class S {
        static final S E = new S(0, 0);
        long sum;
        int size;
        public S (long s, int size) {
            this.sum = s;
            this.size = size;
        }
        public static S op(S l, S r) {
            return new S(add(l.sum, r.sum), l.size + r.size);
        }
        public String toString() {
            return String.valueOf(sum);
        }
    }

    static class F {
        static final F I = new F(1, 0);
        long a, b;
        public F (long a, long b) {
            this.a = a; this.b = b;
        }
        public static F composite(F f, F g) {
            return new F((f.a * g.a) % mod, (f.a * g.b + f.b) % mod);
        }
    }

    static class LazySegTree<S, F> {
        final int MAX;
    
        final int N;
        final int Log;
        final BinaryOperator<S> Op;
        final S E;
        final BiFunction<F, S, S> Mapping;
        final BinaryOperator<F> Composition;
        final F Id;
    
        final S[] Dat;
        final F[] Laz;
    
        @SuppressWarnings("unchecked")
        public LazySegTree(int n, BinaryOperator<S> op, S e, BiFunction<F, S, S> mapping, BinaryOperator<F> composition, F id) {
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
            Arrays.fill(Dat, E);
            Arrays.fill(Laz, Id);
        }
    
        public LazySegTree(S[] dat, BinaryOperator<S> op, S e, BiFunction<F, S, S> mapping, BinaryOperator<F> composition, F id) {
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
    
        private void allApply(int k, F f) {
            Dat[k] = Mapping.apply(f, Dat[k]);
            if (k < N) Laz[k] = Composition.apply(f, Laz[k]);
        }
    
        private void push(int k) {
            if (Laz[k] == Id) return;
            allApply(k << 1 | 0, Laz[k]);
            allApply(k << 1 | 1, Laz[k]);
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
                throw new IllegalArgumentException("TODO");
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
            Dat[p] = Mapping.apply(f, get(p));
            updateFrom(p + N);
        }
    
        public void apply(int l, int r, F f) {
            if (l > r) {
                throw new IllegalArgumentException("TODO");
            }
            inclusiveRangeCheck(l);
            inclusiveRangeCheck(r);
            if (l == r) return;
            l += N; r += N;
            pushTo(l, r);
            for (int l2 = l, r2 = r; l2 < r2;) {
                if ((l2 & 1) == 1) allApply(l2++, f);
                if ((r2 & 1) == 1) allApply(--r2, f);
                l2 >>= 1; r2 >>= 1;
            }
            updateFrom(l, r);
        }
    
        public int maxRight(int l, Predicate<S> g) {
            inclusiveRangeCheck(l);
            if (!g.test(E)) {
                throw new IllegalArgumentException("TODO");
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
    
        public int minLeft(int r, Predicate<S> g) {
            inclusiveRangeCheck(r);
            if (!g.test(E)) {
                throw new IllegalArgumentException("TODO");
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
                    "TODO"
                );
            }
        }
    
        private void inclusiveRangeCheck(int p) {
            if (p < 0 || p > MAX) {
                throw new IndexOutOfBoundsException(
                    "TODO"
                );
            }
        }
    }
}
