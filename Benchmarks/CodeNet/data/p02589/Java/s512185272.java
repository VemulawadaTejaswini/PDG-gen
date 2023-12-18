import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.util.HashSet;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Writer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        BFirstSecond solver = new BFirstSecond();
        solver.solve(1, in, out);
        out.close();
    }

    static class BFirstSecond {
        private static final int MOD = 999999937;
        private static final int BASE = 9973;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            //*
            int n = in.ints();
            char[][] s = new char[n][];
            for (int i = 0; i < n; i++) s[i] = in.chars();
            //*/
        /*
        int n = 200000;
        char[][] s = new char[n][];
        for (int i = 0; i < n; i++) {
            s[i] = make(3 + (int) (Math.random() * 7));
        }
        //*/
        /*
        int n = 20000, totallen = 0;
        char[][] s = new char[n][];
        for (int i = 0; i < n; i++) {
            int len = 30 + (int) (Math.random() * 70);
            s[i] = make(len);
            totallen += len;
        }
        System.out.println("TOTAL LEN = " + totallen);
        //*/


            IntroSort.sort(s, Comparator.comparing(a -> a.length));
            List<HashMap<BFirstSecond.Substring, Integer>> table = new ArrayList<>();
            for (int i = 0; i < 26; i++) table.add(new HashMap<>());
            long ans = 0;
            //long hashing = 0, merging = 0;
            HashSet<Integer> chrs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int m = s[i].length;
                //long t1 = System.currentTimeMillis();

                BFirstSecond.Substring[] subs = new BFirstSecond.Substring[m];
                //long hash = 0;
                long hash = 0;
                for (int j = m - 1; j >= 0; j--) {
                    subs[j] = new BFirstSecond.Substring(j + 1, s[i], (int) hash);
                    hash = (hash * BASE + s[i][j]) % MOD;
                }

                //long t2 = System.currentTimeMillis();

                chrs.clear();
                for (int j = 0; j < m; j++) {
                    chrs.add(s[i][j] - 'a');
                    for (int k : chrs) {
                        ans += table.get(k).getOrDefault(subs[j], 0);
                    }
                }
                table.get(s[i][0] - 'a').merge(subs[0], 1, Integer::sum);
            
            /*
            long t3 = System.currentTimeMillis();
            hashing += t2 - t1;
            merging += t3 - t2;*/
            }
            //System.out.println("H" + hashing + " M" + merging);
            //System.out.println(table);
            out.ans(ans).ln();
        }

        private static final class Substring {
            int s;
            int len;
            char[] original;
            int hash;

            Substring(int s, char[] original, int hash) {
                this.s = s;
                this.len = original.length - s;
                this.original = original;
                this.hash = hash;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                BFirstSecond.Substring substring = (BFirstSecond.Substring) o;
                //if (!Arrays.equals(hash, substring.hash)) return false;
                return Arrays.equals(original, s, original.length, substring.original, substring.s, substring.original.length);
            }

            public int hashCode() {
                return hash;
            }

            public String toString() {
                return String.valueOf(original).substring(s);
            }

        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static <T> void swap(T[] a, int x, int y) {
            T t = a[x];
            a[x] = a[y];
            a[y] = t;
        }

    }

    static interface Verified {
    }

    static class InsertionSort {
        private InsertionSort() {
        }

        static <T> void sort(T[] a, int low, int high, Comparator<? super T> comparator) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low && comparator.compare(a[j - 1], a[j]) > 0; j--) {
                    ArrayUtil.swap(a, j - 1, j);
                }
            }
        }

    }

    static final class BitMath {
        private BitMath() {
        }

        public static int count(int v) {
            return Integer.bitCount(v);
        }

        public static int msb(int v) {
            if (v == 0) {
                throw new IllegalArgumentException("Bit not found");
            }
            v |= (v >> 1);
            v |= (v >> 2);
            v |= (v >> 4);
            v |= (v >> 8);
            v |= (v >> 16);
            return count(v) - 1;
        }

    }

    static class QuickSort {
        private QuickSort() {
        }

        private static <T> void med(T[] a, int low, int x, int y, int z, Comparator<? super T> comparator) {
            if (comparator.compare(a[z], a[x]) < 0) {
                ArrayUtil.swap(a, low, x);
            } else if (comparator.compare(a[y], a[z]) < 0) {
                ArrayUtil.swap(a, low, y);
            } else {
                ArrayUtil.swap(a, low, z);
            }
        }

        static <T> int step(T[] a, int low, int high, Comparator<? super T> comparator) {
            int x = low + 1, y = low + (high - low) / 2, z = high - 1;
            if (comparator.compare(a[x], a[y]) < 0) {
                med(a, low, x, y, z, comparator);
            } else {
                med(a, low, y, x, z, comparator);
            }

            int lb = low + 1, ub = high;
            while (true) {
                while (comparator.compare(a[lb], a[low]) < 0) {
                    lb++;
                }
                ub--;
                while (comparator.compare(a[low], a[ub]) < 0) {
                    ub--;
                }
                if (lb >= ub) {
                    return lb;
                }
                ArrayUtil.swap(a, lb, ub);
                lb++;
            }
        }

    }

    static class IntroSort {
        private static int INSERTIONSORT_THRESHOLD = 16;

        private IntroSort() {
        }

        static <T> void sort(T[] a, int low, int high, int maxDepth, Comparator<T> comparator) {
            while (high - low > INSERTIONSORT_THRESHOLD) {
                if (maxDepth-- == 0) {
                    HeapSort.sort(a, low, high, comparator);
                    return;
                }
                int cut = QuickSort.step(a, low, high, comparator);
                sort(a, cut, high, maxDepth, comparator);
                high = cut;
            }
            InsertionSort.sort(a, low, high, comparator);
        }

        public static <T> void sort(T[] a, Comparator<T> comparator) {
            if (a.length <= INSERTIONSORT_THRESHOLD) {
                InsertionSort.sort(a, 0, a.length, comparator);
            } else {
                sort(a, 0, a.length, 2 * BitMath.msb(a.length), comparator);
            }
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class HeapSort {
        private HeapSort() {
        }

        private static <T> void heapfy(T[] a, int low, int high, int i, T val, Comparator<? super T> comparator) {
            int child = 2 * i - low + 1;
            while (child < high) {
                if (child + 1 < high && comparator.compare(a[child], a[child + 1]) < 0) {
                    child++;
                }
                if (comparator.compare(val, a[child]) >= 0) {
                    break;
                }
                a[i] = a[child];
                i = child;
                child = 2 * i - low + 1;
            }
            a[i] = val;
        }

        static <T> void sort(T[] a, int low, int high, Comparator<T> comparator) {
            for (int p = (high + low) / 2 - 1; p >= low; p--) {
                heapfy(a, low, high, p, a[p], comparator);
            }
            while (high > low) {
                high--;
                T pval = a[high];
                a[high] = a[low];
                heapfy(a, low, high, low, pval, comparator);
            }
        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public char[] chars() {
            return string().toCharArray();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

