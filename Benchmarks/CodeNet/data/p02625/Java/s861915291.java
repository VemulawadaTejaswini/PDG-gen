import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    static FastScanner sc = new FastScanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        var fac = new ModIntFactory(1000000007);
        var sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        var f = new ModIntFactory.ModInt[m + 1];
        f[0] = fac.create(1);
        for (int i = 1; i <= m; i++) {
            f[i] = f[i - 1].mul(fac.create(i));
        }
        var finv = new ModIntFactory.ModInt[m + 1];
        finv[m] = f[m].inv();
        for (int i = m; i > 0; i--) {
            finv[i - 1] = finv[i].mul(fac.create(i));
        }
        var ans = fac.create(0);
        for (int k = 0; k <= n; k++) {
            var s = f[m - n + k].mul(finv[n - k]).mul(finv[k]);
            if (((n - k) & 1) == 0) {
                ans = ans.add(s);
            } else {
                ans = ans.sub(s);
            }
        }
        ans = ans.mul(f[n]).mul(f[m]).mul(finv[m - n]).mul(finv[m - n]);
        sb.append(ans.value);
        pw.write(sb.toString());
        pw.flush();
        pw.close();
    }

    interface ModArithmetic {
        public int mod();
        public int add(int a, int b);
        public int sub(int a, int b);
        public int mul(int a, int b);
        public int div(int a, int b);
        public int inv(int a);
        public int pow(int a, long b);
    
        public static ModArithmetic of(int mod) {
            if (mod <= 0) {
                throw new IllegalArgumentException();
            } else if (mod == 1) {
                return new ModArithmetic1();
            } else if (mod == 2) {
                return new ModArithmetic2();
            } else if (mod == 1000000007) {
                return new ModArithmetic1000000007();
            } else if (mod == 998244353) {
                return new ModArithmetic998244353();
            } else if ((mod & 1) == 1) {
                return new ModArithmeticMontgomery(mod);
            } else {
                return new ModArithmeticBarrett(mod);
            }
        }
    
        static final class ModArithmetic1 implements ModArithmetic {
            public int mod() {return 1;}
            public int add(int a, int b) {return 0;}
            public int sub(int a, int b) {return 0;}
            public int mul(int a, int b) {return 0;}
            public int div(int a, int b) {throw new ArithmeticException("divide by zero");}
            public int inv(int a) {throw new ArithmeticException("divide by zero");}
            public int pow(int a, long b) {return 0;}
        }
        static final class ModArithmetic2 implements ModArithmetic {
            public int mod() {return 2;}
            public int add(int a, int b) {return a ^ b;}
            public int sub(int a, int b) {return a ^ b;}
            public int mul(int a, int b) {return a & b;}
            public int div(int a, int b) {
                if (b == 0) throw new ArithmeticException("divide by zero");
                return a;
            }
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
            final int mod = 998244353;
            public int mod() {
                return mod;
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
                if (b == 0) throw new ArithmeticException("divide by zero");
                return a;
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
                long pow2 = a, idx = 1;
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
            final int mod = 1000000007;
            public int mod() {
                return mod;
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
                if (b == 0) throw new ArithmeticException("divide by zero");
                return a;
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
                long pow2 = a, idx = 1;
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
            public ModArithmeticMontgomery(int mod) {
                super(mod);
            }
            @Override
            public int mul(int a, int b) {throw new UnsupportedOperationException();}
            @Override
            public int div(int a, int b) {throw new UnsupportedOperationException();}
            @Override
            public int inv(int a) {throw new UnsupportedOperationException();}
            @Override
            public int pow(int a, long b) {throw new UnsupportedOperationException();}
        }
        static final class ModArithmeticBarrett extends ModArithmeticDynamic {
            final long mh;
            final long ml;
            ModArithmeticBarrett(int mod) {
                super(mod);
                // m = floor(2^64/mod)
                // 2^64 = p*mod + q, 2^32 = a*mod + b
                // => (a*mod + b)^2 = p*mod + q
                // => p = a^2 + 2ab*mod + floor(b^2/mod)
                long p32 = 0x1_0000_0000l;
                long a = p32 / mod;
                long b = p32 % mod;
                long m = a * a * mod + 2 * a * b + (b * b) / mod;
                mh = m >>> 32;
                ml = m & 0xffff_ffffl;
            }
            private int reduce(long x) {
                long z = (x & 0xffff_ffffl) * ml;
                z = (x & 0xffff_ffffl) * mh + (x >>> 32) * ml + (z >>> 32);
                z = (x >>> 32) * mh + (z >>> 32);
                x -= z * mod;
                return (int) (x < mod ? x : x - mod);
            }
            @Override
            public int mul(int a, int b) {
                return reduce((long) a * (long) b);
            }
            @Override
            public int pow(int a, long b) {
                if (b < 0) throw new ArithmeticException("negative power");
                long res = 1;
                long pow2 = a, idx = 1;
                while (b > 0) {
                    long lsb = b & -b;
                    for (; lsb != idx; idx <<= 1) {
                        pow2 = reduce(pow2 * pow2);
                    }
                    res = reduce(res * pow2);
                    b ^= lsb;
                }
                return (int) res;
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
            public int div(int a, int b) {
                if (b == 0) throw new ArithmeticException("divide by zero");
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
                long pow2 = a, idx = 1;
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
    }
    
    static class ModIntFactory {
        final ModArithmetic ma;
    
        public ModIntFactory(int mod) {
            this.ma = ModArithmetic.of(mod);
        }
    
        public ModInt create(long value) {
            return new ModInt((int) (value % ma.mod()));
        }
    
        class ModInt {
            int value;
            ModInt(int value) {
                this.value = value;
            }
            public ModInt add(ModInt mi) {
                return new ModInt(ma.add(value, mi.value));
            }
            public ModInt sub(ModInt mi) {
                return new ModInt(ma.sub(value, mi.value));
            }
            public ModInt mul(ModInt mi) {
                return new ModInt(ma.mul(value, mi.value));
            }
            public ModInt div(ModInt mi) {
                return new ModInt(ma.div(value, mi.value));
            }
            public ModInt inv() {
                return new ModInt(ma.inv(value));
            }
            public ModInt pow(long b) {
                return new ModInt(ma.pow(value, b));
            }
        }
    }
    
    static class FastScanner {
        private final InputStream in;
        private final byte[] buf = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        public FastScanner(InputStream in) {this.in = in;}
        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            ptr = 0;
            try {buflen = in.read(buf);}
            catch (final IOException e) {e.printStackTrace();}
            return buflen > 0;
        }
        private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
        public boolean hasNext() {
            while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
            return hasNextByte();
        }
        private StringBuilder nextSequence() {
            if (!hasNext()) throw new NoSuchElementException();
            final StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
            return sb;
        }
        public String next() {
            return nextSequence().toString();
        }
        public String next(int len) {
            return new String(nextChars(len));
        }
        public char[] nextChars() {
            final StringBuilder sb = nextSequence();
            int l = sb.length();
            char[] dst = new char[l];
            sb.getChars(0, l, dst, 0);
            return dst;
        }
        public char[] nextChars(int len) {
            if (!hasNext()) throw new NoSuchElementException();
            char[] s = new char[len];
            int i = 0;
            int b = readByte();
            while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
            if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
            return s;
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {minus = true; b = readByte();}
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') n = n * 10 + b - '0';
                else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {return Math.toIntExact(nextLong());}
        public double nextDouble() {return Double.parseDouble(next());}
    }

    static int[] nextInts(int n) {
        var dat = new int[n];
        Arrays.setAll(dat, i -> sc.nextInt());
        return dat;
    }

    static long[] nextLongs(int n) {
        var dat = new long[n];
        Arrays.setAll(dat, i -> sc.nextLong());
        return dat;
    }
}
