import java.util.*;

class SegTree<S> {
    final int MAX;

    final int N;
    final java.util.function.BinaryOperator<S> op;
    final S E;

    final S[] data;

    @SuppressWarnings("unchecked")
    public SegTree(int n, java.util.function.BinaryOperator<S> op, S e) {
        this.MAX = n;
        int k = 1;
        while (k < n) k <<= 1;
        this.N = k;
        this.E = e;
        this.op = op;
        this.data = (S[]) new Object[N << 1];
        java.util.Arrays.fill(data, E);
    }

    public SegTree(S[] dat, java.util.function.BinaryOperator<S> op, S e) {
        this(dat.length, op, e);
        build(dat);
    }

    private void build(S[] dat) {
        int l = dat.length;
        System.arraycopy(dat, 0, data, N, l);
        for (int i = N - 1; i > 0; i--) {
            data[i] = op.apply(data[i << 1 | 0], data[i << 1 | 1]);
        }
    }

    public void set(int p, S x) {
        exclusiveRangeCheck(p);
        data[p += N] = x;
        p >>= 1;
        while (p > 0) {
            data[p] = op.apply(data[p << 1 | 0], data[p << 1 | 1]);
            p >>= 1;
        }
    }

    public S get(int p) {
        exclusiveRangeCheck(p);
        return data[p + N];
    }

    public S prod(int l, int r) {
        if (l > r) {
            throw new IllegalArgumentException(
                String.format("Invalid range: [%d, %d)", l, r)
            );
        }
        inclusiveRangeCheck(l);
        inclusiveRangeCheck(r);
        S sumLeft = E;
        S sumRight = E;
        l += N; r += N;
        while (l < r) {
            if ((l & 1) == 1) sumLeft = op.apply(sumLeft, data[l++]);
            if ((r & 1) == 1) sumRight = op.apply(data[--r], sumRight);
            l >>= 1; r >>= 1;
        }
        return op.apply(sumLeft, sumRight);
    }

    public S allProd() {
        return data[1];
    }

    public int maxRight(int l, java.util.function.Predicate<S> f) {
        inclusiveRangeCheck(l);
        if (!f.test(E)) {
            throw new IllegalArgumentException("Identity element must satisfy the condition.");
        }
        if (l == MAX) return MAX;
        l += N;
        S sum = E;
        do {
            l >>= Integer.numberOfTrailingZeros(l);
            if (!f.test(op.apply(sum, data[l]))) {
                while (l < N) {
                    l = l << 1;
                    if (f.test(op.apply(sum, data[l]))) {
                        sum = op.apply(sum, data[l]);
                        l++;
                    }
                }
                return l - N;
            }
            sum = op.apply(sum, data[l]);
            l++;
        } while ((l & -l) != l);
        return MAX;
    }

    public int minLeft(int r, java.util.function.Predicate<S> f) {
        inclusiveRangeCheck(r);
        if (!f.test(E)) {
            throw new IllegalArgumentException("Identity element must satisfy the condition.");
        }
        if (r == 0) return 0;
        r += N;
        S sum = E;
        do {
            r--;
            while (r > 1 && (r & 1) == 1) r >>= 1;
            if (!f.test(op.apply(data[r], sum))) {
                while (r < N) {
                    r = r << 1 | 1;
                    if (f.test(op.apply(data[r], sum))) {
                        sum = op.apply(data[r], sum);
                        r--;
                    }
                }
                return r + 1 - N;
            }
            sum = op.apply(data[r], sum);
        } while ((r & -r) != r);
        return 0;
    }

    private void exclusiveRangeCheck(int p) {
        if (p < 0 || p >= MAX) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for the range [%d, %d).", p, 0, MAX)
            );
        }
    }

    private void inclusiveRangeCheck(int p) {
        if (p < 0 || p > MAX) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for the range [%d, %d].", p, 0, MAX)
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
        return toString(1, 0);
    }

    private String toString(int k, int sp) {
        if (k >= N) return indent(sp) + data[k];
        String s = "";
        s += toString(k << 1 | 1, sp + indent);
        s += "\n";
        s += indent(sp) + data[k];
        s += "\n";
        s += toString(k << 1 | 0, sp + indent);
        return s;
    }

    private static String indent(int n) {
        StringBuilder sb = new StringBuilder();
        while (n --> 0) sb.append(' ');
        return sb.toString();
    }
}
class ModIntFactory {
    private final ModArithmetic ma;
    private final int mod;

    public ModIntFactory(int mod) {
        this.ma = ModArithmetic.of(mod);
        this.mod = mod;
    }

    public ModInt create(long value) {
        if ((value %= mod) < 0) value += mod;
        if (ma instanceof ModArithmetic.ModArithmeticMontgomery) {
            return new ModInt(((ModArithmetic.ModArithmeticMontgomery) ma).generate(value));
        }
        return new ModInt((int) value);
    }

    class ModInt {
        private int value;
        private ModInt(int value) {
            this.value = value;
        }
        public int mod() {
            return mod;
        }
        public int value() {
            if (ma instanceof ModArithmetic.ModArithmeticMontgomery) {
                return ((ModArithmetic.ModArithmeticMontgomery) ma).reduce(value);
            }
            return value;
        }
        public ModInt add(ModInt mi) {
            return new ModInt(ma.add(value, mi.value));
        }
        public ModInt add(ModInt mi1, ModInt mi2) {
            return new ModInt(ma.add(value, mi1.value)).addAsg(mi2);
        }
        public ModInt add(ModInt mi1, ModInt mi2, ModInt mi3) {
            return new ModInt(ma.add(value, mi1.value)).addAsg(mi2).addAsg(mi3);
        }
        public ModInt add(ModInt mi1, ModInt mi2, ModInt mi3, ModInt mi4) {
            return new ModInt(ma.add(value, mi1.value)).addAsg(mi2).addAsg(mi3).addAsg(mi4);
        }
        public ModInt add(ModInt mi1, ModInt... mis) {
            ModInt mi = add(mi1);
            for (ModInt m : mis) mi.addAsg(m);
            return mi;
        }
        public ModInt add(long mi) {
            return new ModInt(ma.add(value, ma.remainder(mi)));
        }
        public ModInt sub(ModInt mi) {
            return new ModInt(ma.sub(value, mi.value));
        }
        public ModInt sub(long mi) {
            return new ModInt(ma.sub(value, ma.remainder(mi)));
        }
        public ModInt mul(ModInt mi) {
            return new ModInt(ma.mul(value, mi.value));
        }
        public ModInt mul(ModInt mi1, ModInt mi2) {
            return new ModInt(ma.mul(value, mi1.value)).mulAsg(mi2);
        }
        public ModInt mul(ModInt mi1, ModInt mi2, ModInt mi3) {
            return new ModInt(ma.mul(value, mi1.value)).mulAsg(mi2).mulAsg(mi3);
        }
        public ModInt mul(ModInt mi1, ModInt mi2, ModInt mi3, ModInt mi4) {
            return new ModInt(ma.mul(value, mi1.value)).mulAsg(mi2).mulAsg(mi3).mulAsg(mi4);
        }
        public ModInt mul(ModInt mi1, ModInt... mis) {
            ModInt mi = mul(mi1);
            for (ModInt m : mis) mi.mulAsg(m);
            return mi;
        }
        public ModInt mul(long mi) {
            return new ModInt(ma.mul(value, ma.remainder(mi)));
        }
        public ModInt div(ModInt mi) {
            return new ModInt(ma.div(value, mi.value));
        }
        public ModInt div(long mi) {
            return new ModInt(ma.div(value, ma.remainder(mi)));
        }
        public ModInt inv() {
            return new ModInt(ma.inv(value));
        }
        public ModInt pow(long b) {
            return new ModInt(ma.pow(value, b));
        }
        public ModInt addAsg(ModInt mi) {
            this.value = ma.add(value, mi.value);
            return this;
        }
        public ModInt addAsg(ModInt mi1, ModInt mi2) {
            return addAsg(mi1).addAsg(mi2);
        }
        public ModInt addAsg(ModInt mi1, ModInt mi2, ModInt mi3) {
            return addAsg(mi1).addAsg(mi2).addAsg(mi3);
        }
        public ModInt addAsg(ModInt mi1, ModInt mi2, ModInt mi3, ModInt mi4) {
            return addAsg(mi1).addAsg(mi2).addAsg(mi3).addAsg(mi4);
        }
        public ModInt addAsg(ModInt... mis) {
            for (ModInt m : mis) addAsg(m);
            return this;
        }
        public ModInt addAsg(long mi) {
            this.value = ma.add(value, ma.remainder(mi));
            return this;
        }
        public ModInt subAsg(ModInt mi) {
            this.value = ma.sub(value, mi.value);
            return this;
        }
        public ModInt subAsg(long mi) {
            this.value = ma.sub(value, ma.remainder(mi));
            return this;
        }
        public ModInt mulAsg(ModInt mi) {
            this.value = ma.mul(value, mi.value);
            return this;
        }
        public ModInt mulAsg(ModInt mi1, ModInt mi2) {
            return mulAsg(mi1).mulAsg(mi2);
        }
        public ModInt mulAsg(ModInt mi1, ModInt mi2, ModInt mi3) {
            return mulAsg(mi1).mulAsg(mi2).mulAsg(mi3);
        }
        public ModInt mulAsg(ModInt mi1, ModInt mi2, ModInt mi3, ModInt mi4) {
            return mulAsg(mi1).mulAsg(mi2).mulAsg(mi3).mulAsg(mi4);
        }
        public ModInt mulAsg(ModInt... mis) {
            for (ModInt m : mis) mulAsg(m);
            return this;
        }
        public ModInt mulAsg(long mi) {
            this.value = ma.mul(value, ma.remainder(mi));
            return this;
        }
        public ModInt divAsg(ModInt mi) {
            this.value = ma.div(value, mi.value);
            return this;
        }
        public ModInt divAsg(long mi) {
            this.value = ma.div(value, ma.remainder(mi));
            return this;
        }
        @Override
        public String toString() {
            return String.valueOf(value());
        }
        @Override
        public boolean equals(Object o) {
            if (o instanceof ModInt) {
                ModInt mi = (ModInt) o;
                return mod() == mi.mod() && value() == mi.value();
            }
            return false;
        }
        @Override
        public int hashCode() {
            return (1 * 37 + mod()) * 37 + value();
        }
    }

    private interface ModArithmetic {
        public int mod();
        public int remainder(long value);
        public int add(int a, int b);
        public int sub(int a, int b);
        public int mul(int a, int b);
        public default int div(int a, int b) {
            return mul(a, inv(b));
        }
        public int inv(int a);
        public int pow(int a, long b);
    
        public static ModArithmetic of(int mod) {
            if (mod <= 0) {
                throw new IllegalArgumentException();
            } else if (mod == 1) {
                return new ModArithmetic1();
            } else if (mod == 2) {
                return new ModArithmetic2();
            } else if (mod == 998244353) {
                return new ModArithmetic998244353();
            } else if (mod == 1000000007) {
                return new ModArithmetic1000000007();
            } else if ((mod & 1) == 1) {
                return new ModArithmeticMontgomery(mod);
            } else {
                return new ModArithmeticBarrett(mod);
            }
        }
    
        static final class ModArithmetic1 implements ModArithmetic {
            public int mod() {return 1;}
            public int remainder(long value) {return 0;}
            public int add(int a, int b) {return 0;}
            public int sub(int a, int b) {return 0;}
            public int mul(int a, int b) {return 0;}
            public int inv(int a) {throw new ArithmeticException("divide by zero");}
            public int pow(int a, long b) {return 0;}
        }
        static final class ModArithmetic2 implements ModArithmetic {
            public int mod() {return 2;}
            public int remainder(long value) {return (int) (value & 1);}
            public int add(int a, int b) {return a ^ b;}
            public int sub(int a, int b) {return a ^ b;}
            public int mul(int a, int b) {return a & b;}
            public int inv(int a) {
                if (a == 0) throw new ArithmeticException("divide by zero");
                return a;
            }
            public int pow(int a, long b) {
                if (b == 0) return 1;
                return a;
            }
        }
        static final class ModArithmetic998244353 implements ModArithmetic {
            private final int mod = 998244353;
            public int mod() {
                return mod;
            }
            public int remainder(long value) {
                return (int) ((value %= mod) < 0 ? value + mod : value);
            }
            public int add(int a, int b) {
                int res = a + b;
                return res >= mod ? res - mod : res;
            }
            public int sub(int a, int b) {
                int res = a - b;
                return res < 0 ? res + mod : res;
            }
            public int mul(int a, int b) {
                return (int) (((long) a * b) % mod);
            }
            public int inv(int a) {
                int b = mod;
                long u = 1, v = 0;
                while (b >= 1) {
                    long t = a / b;
                    a -= t * b;
                    int tmp1 = a; a = b; b = tmp1;
                    u -= t * v;
                    long tmp2 = u; u = v; v = tmp2;
                }
                u %= mod;
                if (a != 1) {
                    throw new ArithmeticException("divide by zero");
                }
                return (int) (u < 0 ? u + mod : u);
            }
            public int pow(int a, long b) {
                if (b < 0) throw new ArithmeticException("negative power");
                long res = 1;
                long pow2 = a;
                long idx = 1;
                while (b > 0) {
                    long lsb = b & -b;
                    for (; lsb != idx; idx <<= 1) {
                        pow2 = (pow2 * pow2) % mod;
                    }
                    res = (res * pow2) % mod;
                    b ^= lsb;
                }
                return (int) res;
            }
        }
        static final class ModArithmetic1000000007 implements ModArithmetic {
            private final int mod = 1000000007;
            public int mod() {
                return mod;
            }
            public int remainder(long value) {
                return (int) ((value %= mod) < 0 ? value + mod : value);
            }
            public int add(int a, int b) {
                int res = a + b;
                return res >= mod ? res - mod : res;
            }
            public int sub(int a, int b) {
                int res = a - b;
                return res < 0 ? res + mod : res;
            }
            public int mul(int a, int b) {
                return (int) (((long) a * b) % mod);
            }
            public int div(int a, int b) {
                return mul(a, inv(b));
            }
            public int inv(int a) {
                int b = mod;
                long u = 1, v = 0;
                while (b >= 1) {
                    long t = a / b;
                    a -= t * b;
                    int tmp1 = a; a = b; b = tmp1;
                    u -= t * v;
                    long tmp2 = u; u = v; v = tmp2;
                }
                u %= mod;
                if (a != 1) {
                    throw new ArithmeticException("divide by zero");
                }
                return (int) (u < 0 ? u + mod : u);
            }
            public int pow(int a, long b) {
                if (b < 0) throw new ArithmeticException("negative power");
                long res = 1;
                long pow2 = a;
                long idx = 1;
                while (b > 0) {
                    long lsb = b & -b;
                    for (; lsb != idx; idx <<= 1) {
                        pow2 = (pow2 * pow2) % mod;
                    }
                    res = (res * pow2) % mod;
                    b ^= lsb;
                }
                return (int) res;
            }
        }
        static final class ModArithmeticMontgomery extends ModArithmeticDynamic {
            private final long negInv;
            private final long r2, r3;
    
            private ModArithmeticMontgomery(int mod) {
                super(mod);
                long inv = 0;
                long s = 1, t = 0;
                for (int i = 0; i < 32; i++) {
                    if ((t & 1) == 0) {
                        t += mod;
                        inv += s;
                    }
                    t >>= 1;
                    s <<= 1;
                }
                long r = (1l << 32) % mod;
                this.negInv = inv;
                this.r2 = (r * r) % mod;
                this.r3 = (r2 * r) % mod;
            }
            private int generate(long x) {
                return reduce(x * r2);
            }
            private int reduce(long x) {
                x = (x + ((x * negInv) & 0xffff_ffffl) * mod) >>> 32;
                return (int) (x < mod ? x : x - mod);
            }
            @Override
            public int remainder(long value) {
                return generate((value %= mod) < 0 ? value + mod : value);
            }
            @Override
            public int mul(int a, int b) {
                return reduce((long) a * b);
            }
            @Override
            public int inv(int a) {
                a = super.inv(a);
                return reduce(a * r3);
            }
            @Override
            public int pow(int a, long b) {
                return generate(super.pow(a, b));
            }
        }
        static final class ModArithmeticBarrett extends ModArithmeticDynamic {
            private static final long mask = 0xffff_ffffl;
            private final long mh;
            private final long ml;
            private ModArithmeticBarrett(int mod) {
                super(mod);
                /**
                 * m = floor(2^64/mod)
                 * 2^64 = p*mod + q, 2^32 = a*mod + b
                 * => (a*mod + b)^2 = p*mod + q
                 * => p = mod*a^2 + 2ab + floor(b^2/mod)
                 */
                long a = (1l << 32) / mod;
                long b = (1l << 32) % mod;
                long m = a * a * mod + 2 * a * b + (b * b) / mod;
                mh = m >>> 32;
                ml = m & mask;
            }
            private int reduce(long x) {
                long z = (x & mask) * ml;
                z = (x & mask) * mh + (x >>> 32) * ml + (z >>> 32);
                z = (x >>> 32) * mh + (z >>> 32);
                x -= z * mod;
                return (int) (x < mod ? x : x - mod);
            }
            @Override
            public int remainder(long value) {
                return (int) ((value %= mod) < 0 ? value + mod : value);
            }
            @Override
            public int mul(int a, int b) {
                return reduce((long) a * b);
            }
        }
        static class ModArithmeticDynamic implements ModArithmetic {
            final int mod;
            public ModArithmeticDynamic(int mod) {
                this.mod = mod;
            }
            public int mod() {
                return mod;
            }
            public int remainder(long value) {
                return (int) ((value %= mod) < 0 ? value + mod : value);
            }
            public int add(int a, int b) {
                int sum = a + b;
                return sum >= mod ? sum - mod : sum;
            }
            public int sub(int a, int b) {
                int sum = a - b;
                return sum < 0 ? sum + mod : sum;
            }
            public int mul(int a, int b) {
                return (int) (((long) a * b) % mod);
            }
            public int inv(int a) {
                int b = mod;
                long u = 1, v = 0;
                while (b >= 1) {
                    long t = a / b;
                    a -= t * b;
                    int tmp1 = a; a = b; b = tmp1;
                    u -= t * v;
                    long tmp2 = u; u = v; v = tmp2;
                }
                u %= mod;
                if (a != 1) {
                    throw new ArithmeticException("divide by zero");
                }
                return (int) (u < 0 ? u + mod : u);
            }
            public int pow(int a, long b) {
                if (b < 0) throw new ArithmeticException("negative power");
                int res = 1;
                int pow2 = a;
                long idx = 1;
                while (b > 0) {
                    long lsb = b & -b;
                    for (; lsb != idx; idx <<= 1) {
                        pow2 = mul(pow2, pow2);
                    }
                    res = mul(res, pow2);
                    b ^= lsb;
                }
                return res;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] L = new int[K], R = new int[K];
        for(int k=0; k<K; k++){
            L[k] = sc.nextInt();
            R[k] = sc.nextInt();
        }

        final ModIntFactory mf = new ModIntFactory(998244353);

        SegTree<ModIntFactory.ModInt> seg = new SegTree<>(2*N+10, ModIntFactory.ModInt::add, mf.create(0));
        seg.set(0, mf.create(1));
        seg.set(1, mf.create(-1));
        //seg.prod(0, i) == dp[i]

        for(int n=1; n<N; n++){
            for(int k=0; k<K; k++){
                ModIntFactory.ModInt dpn = seg.prod(0, n); 
                seg.set(n+L[k]-1, seg.get(n+L[k]-1).add(dpn));
                seg.set(n+R[k], seg.get(n+R[k]).sub(dpn));
            }
        }
        System.out.println(seg.prod(0, N));
    }
}