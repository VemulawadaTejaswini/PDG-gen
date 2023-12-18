/*
    Author: Anthony Ngene
    Created: 03/08/2020 - 03:25
*/

import java.io.*;
import java.util.*;

public class Main {
    // If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough. - Oprah Winfrey
    public static void main(String[] args) throws IOException {
        in = new FastScanner();

        int n = in.intNext(), queries = in.intNext();
        int[] answers = new int[queries];
        int[] arr = in.nextIntArray(n);
        Tuple3[] qs = new Tuple3[queries];
        int block = (int)Math.floor(Math.sqrt(n));
//        out.println(block);
        for (int q = 0; q < queries; q++) {
            int s = in.intNext()-1;
            int e = in.intNext()-1;
            qs[q] = new Tuple3(s / block, e, q, s);
        }
        Arrays.sort(qs);
//        out.println(Arrays.toString(qs));
        int ans = 1;
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < n; i++) counts.put(i, 0);
        int s = -1;
        int e  = 0;
        counts.put(arr[0], 1);
        for (Tuple3 tuple : qs) {
            if (e < tuple.b){
                e++;
                while (e <= tuple.b) {
                    counts.merge(arr[e], 1, Integer::sum);
                    if (counts.get(arr[e]) == 1) ans++;
                    e++;
                }
                e--;
            } else if (e > tuple.b) {
                while (e > tuple.b) {
                    counts.merge(arr[e], -1, Integer::sum);
                    if (counts.get(arr[e]) == 0) ans--;
                    e--;
                }
            }
//            out.pp(counts, ans);

            if (s < tuple.s-1) {
                s++;
                while (s <= tuple.s-1) {
                    if (s > -1) {
                        counts.merge(arr[s], -1, Integer::sum);
                        if (counts.get(arr[s]) == 0) ans--;
                    }
                    s++;
                }
                s--;
            } else if (s > tuple.s-1) {
                while (s > tuple.s-1) {
                    counts.merge(arr[s], 1, Integer::sum);
                    if (counts.get(arr[s]) == 1) ans++;
                    s--;
                }
            }
//            out.pp(counts, ans);
//            out.pp(tuple, ans, s, e);
//            out.println("=======");
            answers[(int)tuple.c] = ans;
        }
//        u.print(answers);
        for (int num: answers) out.println(num);

        out.close();
    }

    static class Tuple3 implements Comparable<Tuple3> {
        long a;
        long b;
        long c;
        long s;

        public Tuple3(long block, long end, int idx,  long start) {
            this.a = block;
            this.b = end;
            this.c = idx;
            this.s = start;
        }

        public long getA() {
            return a;
        }

        public long getB() {
            return b;
        }

        public long getVertex() {
            return b;
        }

        public int compareTo(Tuple3 other) {
            if (this.a == other.a) {
                if (this.b == other.b) return Long.compare(this.c, other.c);
                return Long.compare(this.b, other.b);
            }
            return Long.compare(this.a, other.a);
        }

        @Override
        public int hashCode() {
            return Arrays.deepHashCode(new Long[]{a, b, c});
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Tuple3)) return false;
            Tuple3 pairo = (Tuple3) o;
            return (this.a == pairo.a && this.b == pairo.b && this.c == pairo.c);
        }

        @Override
        public String toString() {
            return String.format("%d - %d (%d)  ", this.s, this.b, this.c);
        }
    }

private static final FastWriter out = new FastWriter();
private static FastScanner in;
static ArrayList<Integer>[] adj;
private static long e97 = (long)1e9 + 7;
static class FastWriter {
    private static final int IO_BUFFERS = 128 * 1024;
    private final StringBuilder out;
    public FastWriter() {
        out = new StringBuilder(IO_BUFFERS);
    }
    public FastWriter p(Object object) {
        out.append(object);
        return this;
    }
    public FastWriter p(String format, Object... args) {
        out.append(String.format(format, args));
        return this;
    }
    public FastWriter pp(Object... args) {
        for (Object ob : args) {
            out.append(ob).append(" ");
        }
        out.append("\n");
        return this;
    }
    public FastWriter println(Object object) {
        out.append(object).append("\n");
        return this;
    }
    public void toFile(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(out.toString());
        writer.close();
    }
    public void close() throws IOException {
        System.out.print(out);
    }
}
static class FastScanner {
    private InputStream sin = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(){}
    public FastScanner(String filename) throws FileNotFoundException {
        File file = new File(filename);
        sin = new FileInputStream(file);
    }
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = sin.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long longNext() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b) || b == ':'){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int intNext() {
        long nl = longNext();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double doubleNext() { return Double.parseDouble(next());}
    public long[] nextLongArray(final int n){
        final long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = longNext();
        return a;
    }
    public int[] nextIntArray(final int n){
        final int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = intNext();
        return a;
    }
    public ArrayList<Integer>[] getAdj(int n) {
        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        return adj;
    }

    public ArrayList<Integer>[] adjacencyList(int n, int m) throws IOException {
        adj = getAdj(n);
        for (int i = 0; i < m; i++) {
            int a = intNext(), b = intNext();
            adj[a].add(b);
            adj[b].add(a);
        }
        return adj;
    }
}
}
