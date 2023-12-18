import java.io.*;
import java.util.*;

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

class Convolution {
    /**
     * Find a primitive root.
     *
     * @param m A prime number.
     * @return Primitive root.
     */
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
        while (x % 2 == 0) x /= 2;
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
        for (int g = 2; ; g++) {
            boolean ok = true;
            for (int i = 0; i < cnt; i++) {
                if (pow(g, (m - 1) / divs[i], m) == 1) {
                    ok = false;
                    break;
                }
            }
            if (ok) return g;
        }
    }

    /**
     * Power.
     *
     * @param x Parameter x.
     * @param n Parameter n.
     * @param m Mod.
     * @return n-th power of x mod m.
     */
    private static long pow(long x, long n, int m) {
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

    /**
     * Ceil of power 2.
     *
     * @param n Value.
     * @return Ceil of power 2.
     */
    private static int ceilPow2(int n) {
        int x = 0;
        while ((1L << x) < n) x++;
        return x;
    }

    /**
     * Garner's algorithm.
     *
     * @param c    Mod convolution results.
     * @param mods Mods.
     * @return Result.
     */
    private static long garner(long[] c, int[] mods) {
        int n = c.length + 1;
        long[] cnst = new long[n];
        long[] coef = new long[n];
        java.util.Arrays.fill(coef, 1);
        for (int i = 0; i < n - 1; i++) {
            int m1 = mods[i];
            long v = (c[i] - cnst[i] + m1) % m1;
            v = v * pow(coef[i], m1 - 2, m1) % m1;

            for (int j = i + 1; j < n; j++) {
                long m2 = mods[j];
                cnst[j] = (cnst[j] + coef[j] * v) % m2;
                coef[j] = (coef[j] * m1) % m2;
            }
        }
        return cnst[n - 1];
    }

    /**
     * Pre-calculation for NTT.
     *
     * @param mod NTT Prime.
     * @param g   Primitive root of mod.
     * @return Pre-calculation table.
     */
    private static long[] sumE(int mod, int g) {
        long[] sum_e = new long[30];
        long[] es = new long[30];
        long[] ies = new long[30];
        int cnt2 = Integer.numberOfTrailingZeros(mod - 1);
        long e = pow(g, (mod - 1) >> cnt2, mod);
        long ie = pow(e, mod - 2, mod);
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

    /**
     * Pre-calculation for inverse NTT.
     *
     * @param mod Mod.
     * @param g   Primitive root of mod.
     * @return Pre-calculation table.
     */
    private static long[] sumIE(int mod, int g) {
        long[] sum_ie = new long[30];
        long[] es = new long[30];
        long[] ies = new long[30];

        int cnt2 = Integer.numberOfTrailingZeros(mod - 1);
        long e = pow(g, (mod - 1) >> cnt2, mod);
        long ie = pow(e, mod - 2, mod);
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

    /**
     * Inverse NTT.
     *
     * @param a     Target array.
     * @param sumIE Pre-calculation table.
     * @param mod   NTT Prime.
     */
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

    /**
     * Inverse NTT.
     *
     * @param a    Target array.
     * @param sumE Pre-calculation table.
     * @param mod  NTT Prime.
     */
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

    /**
     * Convolution.
     *
     * @param a   Target array 1.
     * @param b   Target array 2.
     * @param mod NTT Prime.
     * @return Answer.
     */
    public static long[] convolution(long[] a, long[] b, int mod) {
        int n = a.length;
        int m = b.length;
        if (n == 0 || m == 0) return new long[0];

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
        a = java.util.Arrays.copyOf(a, n + m - 1);

        long iz = pow(z, mod - 2, mod);
        for (int i = 0; i < n + m - 1; i++) a[i] = a[i] * iz % mod;
        return a;
    }

    /**
     * Convolution.
     *
     * @param a   Target array 1.
     * @param b   Target array 2.
     * @param mod Any mod.
     * @return Answer.
     */
    public static long[] convolutionLL(long[] a, long[] b, int mod) {
        int n = a.length;
        int m = b.length;
        if (n == 0 || m == 0) return new long[0];

        int mod1 = 754974721;
        int mod2 = 167772161;
        int mod3 = 469762049;

        long[] c1 = convolution(a, b, mod1);
        long[] c2 = convolution(a, b, mod2);
        long[] c3 = convolution(a, b, mod3);

        int retSize = c1.length;
        long[] ret = new long[retSize];
        int[] mods = {mod1, mod2, mod3, mod};
        for (int i = 0; i < retSize; ++i) {
            ret[i] = garner(new long[]{c1[i], c2[i], c3[i]}, mods);
        }
        return ret;
    }

    /**
     * Convolution by ModInt.
     *
     * @param a Target array 1.
     * @param b Target array 2.
     * @return Answer.
     */
    public static java.util.List<ModIntFactory.ModInt> convolution(
            java.util.List<ModIntFactory.ModInt> a,
            java.util.List<ModIntFactory.ModInt> b
    ) {
        int mod = a.get(0).mod();
        long[] va = a.stream().mapToLong(ModIntFactory.ModInt::value).toArray();
        long[] vb = b.stream().mapToLong(ModIntFactory.ModInt::value).toArray();
        long[] c = convolutionLL(va, vb, mod);

        ModIntFactory factory = new ModIntFactory(mod);
        return java.util.Arrays.stream(c).mapToObj(factory::create).collect(java.util.stream.Collectors.toList());
    }

    /**
     * Naive convolution. (Complexity is O(N^2)!!)
     *
     * @param a   Target array 1.
     * @param b   Target array 2.
     * @param mod Mod.
     * @return Answer.
     */
    public static long[] convolutionNaive(long[] a, long[] b, int mod) {
        int n = a.length;
        int m = b.length;
        int k = n + m - 1;
        long[] ret = new long[k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ret[i + j] += a[i] * b[j] % mod;
                ret[i + j] %= mod;
            }
        }
        return ret;
    }
}

public class Main {
	static void solve() {
		int n = ni(), m = ni();
		int mod = 998244353;
		var a = nla(n);
		var b = nla(m);
		long[] res = Convolution.convolution(a, b, mod);
		for(int i=0;i<=n-1 + m-1; i++) {
			out.print(res[i] + " ");
		}
	}	
	
	//constants
	static final int inf = Integer.MAX_VALUE / 2;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE / 3;
	static final long mod = (long) 1e9 + 7;
	static final int[] dx = { -1, 0, 1, 0 }, dy = { 0, -1, 0, 1 }, dx8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final double eps = 1e-10;
	
	//libraries
	static long[] cum(int a[]) {
		long[] cum = new long[a.length + 1];
		for(int i=0;i<a.length;i++) cum[i+1] = cum[i] + a[i];
		return cum;
	}
	static long[] cum(long a[]) {
		long[] cum = new long[a.length + 1];
		for(int i=0;i<a.length;i++) cum[i+1] = cum[i] + a[i];
		return cum;
	}
	static void reverse(int ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(long ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(double ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(char ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			char t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static String getReverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	static <T> void reverse(T[] ar) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			T t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static int[] concat(int x, int arr[]) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}
	static int[] concat(int arr[], int x) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static long[] concat(long x, long arr[]) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}
	static long[] concat(long arr[], long x) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static char[] concat(char x, char arr[]) {
		char ret[] = new char[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static char[] concat(char arr[], char x) {
		char ret[] = new char[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static int max(int x, int y) {
		return Math.max(x, y);
	}
	static int min(int x, int y) {
		return Math.min(x, y);
	}
	static int max(int x, int y, int z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static int min(int x, int y, int z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static long max(long x, long y) {
		return Math.max(x, y);
	}
	static long min(long x, long y) {
		return Math.min(x, y);
	}
	static long max(long x, long y, long z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static long min(long x, long y, long z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static double max(double x, double y) {
		return Math.max(x, y);
	}
	static double min(double x, double y) {
		return Math.min(x, y);
	}
	static double max(double x, double y, double z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static double min(double x, double y, double z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static void sort(int[] ar) {
		Arrays.sort(ar);
	}
	static void sort(long[] ar) {
		Arrays.sort(ar);
	}
	static void sort(double[] ar) {
		Arrays.sort(ar);
	}
	static void sort(char[] ar) {
		Arrays.sort(ar);
	}
	static void rsort(int[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(long[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(double[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(char[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			char tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void fill(int arr[], int x) {
		Arrays.fill(arr, x);
	}
	static void fill(long arr[], long x) {
		Arrays.fill(arr, x);
	}
	static void fill(boolean arr[], boolean x) {
		Arrays.fill(arr, x);
	}
	static void fill(double arr[], double x) {
		Arrays.fill(arr, x);
	}
	static void fill(int arr[][], int x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(long arr[][], long x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(double arr[][], double x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(boolean arr[][], boolean x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	//MOD culc
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}
	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}
	//input
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	private static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}
	private static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}
	private static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}
	@SuppressWarnings("unused")
	private static double nd() {
		return Double.parseDouble(ns());
	}
	@SuppressWarnings("unused")
	private static char nc() {
		return (char) skip();
	}
	private static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	@SuppressWarnings("unused")
	private static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}
	@SuppressWarnings("unused")
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	@SuppressWarnings("unused")
	private static long[] nla(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
	@SuppressWarnings("unused")
	private static int[][] na(int n, int m){
		int[][] res = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = ni();
			}
		}
		return res;
	}
	@SuppressWarnings("unused")
	private static long[][] nla(int n, int m){
		long[][] res = new long[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = nl();
			}
		}
		return res;
	}
	private static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	private static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
}
