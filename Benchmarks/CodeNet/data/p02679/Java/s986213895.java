import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        long [] a = new long[n];
        long [] b = new long[n];
        long mod = (long) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }
        Map<Fraction, Integer> map = new HashMap<>();
        Fraction [] check = new Fraction[n];
        for (int i = 0; i < n; i++) {
            int sign;
            if (a[i] > 0 && b[i] > 0 || a[i] < 0 && b[i] < 0) sign = -1; else sign = 1;
            Fraction f;
            if (a[i] == 0 && b[i] == 0) f = new Fraction(0, 0, 1);
            else if (a[i] == 0) f = new Fraction(0, 1, 1);
            else if (b[i] == 0) f = new Fraction(1, 0, 1);
            else f = new Fraction(Math.abs(a[i]), Math.abs(b[i]), sign);
            map.put(f, map.getOrDefault(f, 0) + 1);
            check[i] = f;
        }
        long ans = 1;
        Set<Fraction> considered = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Fraction f = check[i]; Fraction nf;
            if (f.n == 0 && f.d == 0) continue;
            if (f.n == 0 && f.d == 1 && f.sign == 1) nf = new Fraction(1, 0, 1);
            else if (f.n == 1 && f.d == 0 && f.sign == 1) nf = new Fraction(0, 1, 1);
            else nf = new Fraction(f.d, f.n, f.sign * -1);
            if (considered.contains(f) || considered.contains(nf)) continue;
            int sz = map.get(f); int nsz = map.getOrDefault(nf, 0);
            long pow = (pow(2, sz, mod) + pow(2, nsz, mod) - 1) % mod;
            ans = (ans * pow) % mod;
            considered.add(f); considered.add(nf);
        }
        ans = (ans + map.getOrDefault(new Fraction(0, 0, 1), 0)) % mod;
        // empty set
        ans = (ans - 1) % mod;
        if (ans < 0) ans += mod;
        out.println(ans);
        out.close();
    }


    static long pow(long b, int e, long mod) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1)
                ans = ans * b % mod;
            e >>= 1;
            b = b * b % mod;
        }
        return ans;
    }


    static class Fraction {
        long n; long d; int sign;
        Fraction(long n, long d, int sign) {
            if (n == 0 && d == 0 && sign == 1) {
                this.n = n; this.d = d; this.sign = sign;
                return;
            }
            long gcd = gcd(n, d);
            this.n = n / gcd; this.d = d / gcd; this.sign = sign;
        }

        void reduce() {
            long gcd = gcd(n, d);
            n = n / gcd; d = d / gcd;
        }

        Fraction add(Fraction f) {
            if (n == 0) return new Fraction(f.n, f.d, f.sign);
            if (f.n == 0) return new Fraction(n, d, sign);
            long nd = d * f.d;
            long nn = f.d * n * sign + f.n * d * f.sign;
            int ns = (nn > 0) ? 1 : -1;
            Fraction ret = new Fraction(Math.abs(nn), nd, ns);
            ret.reduce();
            return ret;
        }

        Fraction sub(Fraction f) {
            if (f.n == 0) return new Fraction(n, d, sign);
            if (n == 0) {
                return new Fraction(f.n, f.d, f.sign * -1);
            }
            long nd = d * f.d;
            long nn = f.d * n * sign - f.n * d * f.sign;
            int ns = (nn > 0) ? 1 : -1;
            Fraction ret = new Fraction(Math.abs(nn), nd, ns);
            ret.reduce();
            return ret;
        }

        Fraction mul(Fraction f) {
            if (f.n == 0 || n == 0) return new Fraction(0, d, 1);
            long nd = d * f.d;
            long nn = n * f.n;
            int ns = sign * f.sign;
            Fraction ret = new Fraction(nn, nd, ns);
            ret.reduce();
            return ret;
        }

        Fraction div(Fraction f) {
            if (n == 0) return new Fraction(0, d, 1);
            long nd = d * f.n;
            long nn = f.d * n;
            int ns = sign * f.sign;
            Fraction ret = new Fraction(nn, nd, ns);
            ret.reduce();
            return ret;
        }

        static Fraction abs(Fraction f) {
            return new Fraction(f.n, f.d, 1);
        }

        static int compare(Fraction a, Fraction b) {
            if (a.sign < b.sign) return -1;
            if (b.sign < a.sign) return 1;
            if (a.n == b.n && b.d == a.d) return 0;
            else return Long.compare(a.n, b.n);
        }

        public String toString() {
            String ret = "";
            if (sign < 0) ret += "-";
            ret += n + "/" + d;
            return ret;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Fraction fraction = (Fraction) o;
            return n == fraction.n &&
                    d == fraction.d &&
                    sign == fraction.sign;
        }

        @Override
        public int hashCode() {
            return Objects.hash(n, d, sign);
        }
    }

    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}