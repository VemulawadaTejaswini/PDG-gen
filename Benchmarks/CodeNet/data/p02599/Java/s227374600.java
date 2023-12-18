import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = 998244353;

    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        int Q = in.nextInt();
        int[] color = new int[N + 1];
        for (int i = 1; i <= N; i++)
            color[i] = in.nextInt();

        Map<Integer, List<Integer>> query = new HashMap<>();
        Map<Integer, List<Integer>> queryIdx = new HashMap<>();
        for (int i = 0; i < Q; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            query.computeIfAbsent(r, k -> new ArrayList<>()).add(l);
            queryIdx.computeIfAbsent(r, k -> new ArrayList<>()).add(i);
        }

        int[] res = new int[Q];
        int[] rightMost = new int[N + 1];
        BIT bit = new BIT(N);
        for (int r = 1; r <= N; r++) {
            int c = color[r];
            if (rightMost[c] > 0)
                bit.update(rightMost[c], -1);
            rightMost[c] = r;
            bit.update(r, 1);
            var ls = query.get(r);
            if (ls == null) continue;
            var qi = queryIdx.get(r);
            for (int i = 0; i < ls.size(); i++) {
                int l = ls.get(i);
                int idx = qi.get(i);
                res[idx] = bit.query(r) - bit.query(l - 1);
            }
        }
        for (int x : res)
            out.println(x);
    }

    static class Node implements Comparable<Node> {
        int left;
        int right;
        Node(int l, int r) {
            left = l;
            right = r;
        }

        public int compareTo(Node other) {
            if (this.left == other.left) {
                return Integer.compare(this.right, other.right);
            }
            return Integer.compare(other.left, this.left);
        }
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

class BIT {
    private int[] a;

    BIT(int n) {
        a = new int[n + 1];
    }

    public void update(int i, int delta) {
        int n = a.length;
        while (i < n) {
            a[i] += delta;
            i += i & -i;
        }
    }

    public int query(int i) {
        int res = 0;
        while (i > 0) {
            res += a[i];
            i -= i & -i;
        }
        return res;
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
