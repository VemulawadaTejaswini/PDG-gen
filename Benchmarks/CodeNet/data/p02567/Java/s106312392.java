import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var pw = new PrintWriter(System.out);
        final int N = Integer.parseInt(sc.next());
        final int Q = Integer.parseInt(sc.next());
        final var A = new Integer[N];
        Arrays.setAll(A, i -> Integer.parseInt(sc.next()));
        var t = new SegTree<Integer>(A, -1, Integer::max);
        for (int $ = 0; $ < Q; $++) {
            int query = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next());
            switch (query) {
                case 1:
                    t.set(a, b);
                    break;
                case 2:
                    pw.println(t.prod(a, b));
                    break;
                case 3:
                    pw.println(t.maxRight(a, x -> x < b) + 1);
                    break;
                default:
                    break;
            }
        }
        sc.close();
        pw.flush();
        pw.close();
    }
}

class SegTree<S> {
    final int MAX;

    final int N;
    final S E;
    final BinaryOperator<S> Op;

    final S[] Dat;

    @SuppressWarnings("unchecked")
    public SegTree(int n, S e, BinaryOperator<S> op) {
        this.MAX = n;
        int k = 1;
        while (k < n) k <<= 1;
        this.N = k;
        this.E = e;
        this.Op = op;
        this.Dat = (S[]) new Object[N << 1];
        Arrays.fill(Dat, E);
    }

    public SegTree(S[] dat, S e, BinaryOperator<S> op) {
        this(dat.length, e, op);
        build(dat);
    }

    private void build(S[] dat) {
        int l = dat.length;
        System.arraycopy(dat, 0, Dat, N, l);
        for (int i = N - 1; i > 0; i--) {
            Dat[i] = Op.apply(Dat[i << 1 | 0], Dat[i << 1 | 1]);
        }
    }

    public void set(int p, S x) {
        exclusiveRangeCheck(p);
        Dat[p += N] = x;
        p >>= 1;
        while (p > 0) {
            Dat[p] = Op.apply(Dat[p << 1 | 0], Dat[p << 1 | 1]);
            p >>= 1;
        }
    }

    public S get(int p) {
        exclusiveRangeCheck(p);
        return Dat[p + N];
    }

    public S prod(int l, int r) {
        if (l > r) {
            throw new IllegalArgumentException("TODO");
        }
        inclusiveRangeCheck(l);
        inclusiveRangeCheck(r);
        S sumLeft = E;
        S sumRight = E;
        l += N; r += N;
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

    public int maxRight(int l, Predicate<S> f) {
        inclusiveRangeCheck(l);
        if (!f.test(E)) {
            throw new IllegalArgumentException("TODO");
        }
        if (l == MAX) return MAX;
        l += N;
        S sum = E;
        do {
            l >>= Integer.numberOfTrailingZeros(l);
            if (!f.test(Op.apply(sum, Dat[l]))) {
                while (l < N) {
                    l = l << 1;
                    if (f.test(Op.apply(sum, Dat[l]))) {
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

    public int minLeft(int r, Predicate<S> f) {
        inclusiveRangeCheck(r);
        if (!f.test(E)) {
            throw new IllegalArgumentException("TODO");
        }
        if (r == 0) return 0;
        r += N;
        S sum = E;
        do {
            r--;
            while (r > 1 && (r & 1) == 1) r >>= 1;
            if (!f.test(Op.apply(Dat[r], sum))) {
                while (r < N) {
                    r = r << 1 | 1;
                    if (f.test(Op.apply(Dat[r], sum))) {
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