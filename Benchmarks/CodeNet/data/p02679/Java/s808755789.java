import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = (int)1e9 + 7; //998244353;

    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        Map<Pair<Long, Long>, Integer> set = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long a = in.nextLong(), b = in.nextLong();
            long gcd = gcd(a, b);
            if (gcd != 0) {
                a /= gcd;
                b /= gcd;
            }
            Pair p;
            // make sure b >= 0
            if (a != 0 && b == 0)
                p = new Pair(1L, 0L);
            else if (a == 0 && b != 0)
                p = new Pair(0L, 1L);
            else if (b < 0)
                p = new Pair(-a, -b);
            else
                p = new Pair(a, b);
            set.merge(p, 1, Integer::sum);
        }

        int[] pow2 = new int[N + 1];
        pow2[0] = 1;
        for (int i = 1; i <= N; i++)
            pow2[i] = pow2[i - 1] * 2 % MOD;

        Pair<Long, Long> p0 = new Pair<>(0L, 0L);
        int count0 = set.getOrDefault(p0, 0);
        set.remove(p0);

        long ans = 1;
        for (Pair<Long, Long> p : new ArrayList<>(set.keySet())) {
            Pair<Long, Long> other; // bad pairs to p
            // make sure other.b >= 0
            if (p.a < 0L)
                other = new Pair<>(p.b, -p.a);
            else if (p.a == 0L)
                other = new Pair<>(1L, 0L);
            else
                other = new Pair<>(-p.b, p.a);
            int x0 = set.getOrDefault(p, 0);
            int x1 = set.getOrDefault(other, 0);
            ans *= (pow2[x0] + pow2[x1] - 1); // - 1 to remove the extra empty set
            ans %= MOD;

            set.remove(p);
            set.remove(other);
        }

        // - 1 to remove empty et
        ans = (ans + count0 - 1 + MOD) % MOD;

        out.println(ans);

    }

    private int pow(int x, int p) {
        long res = 1, a = x;
        while (p > 0) {
            if (p % 2 == 1)
                res = res * a % MOD;

            a = a * a % MOD;
            p /= 2;
        }
        return (int)res;
    }

    private long gcd(long a, long b) {
        while (true) {
            if (b == 0) return a;
            long tmp = a;
            a = b;
            b = tmp % b;
        }
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        Main sol = new Main(in, out);

        out.close();
    }
}

// Pair
class Pair<T extends Comparable<? super T>, U extends Comparable<? super U>> implements Comparable<Pair<T, U>> {
    T a;
    U b;
    Pair() { }
    Pair(T a, U b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() { return "("+a.toString()+", "+b.toString()+")"; }

    @Override
    public int hashCode() { return Objects.hash(a, b); }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Pair that = (Pair) obj;
        if(this.a.getClass() != that.a.getClass()) return false;
        if(this.b.getClass() != that.b.getClass()) return false;
        if(!this.a.equals(that.a)) return false;
        if(!this.b.equals(that.b)) return false;
        return true;
    }

    @Override
    public int compareTo(Pair<T, U> that) {
        int c = (this.a).compareTo(that.a);
        if(c == 0) c = (this.b).compareTo(that.b);
        return c;
    }
}


class FastScanner{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream)
    {
        this.stream = stream;
    }

    int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c)
    {
        return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
    }

    boolean isEndline(int c)
    {
        return c=='\n'||c=='\r'||c==-1;
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String next(){
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isSpaceChar(c));
        return res.toString();
    }

    String nextLine(){
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isEndline(c));
        return res.toString();
    }
}
