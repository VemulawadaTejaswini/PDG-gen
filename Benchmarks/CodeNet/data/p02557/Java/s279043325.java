import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Collection;
import java.util.AbstractQueue;
import java.util.HashMap;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.AbstractCollection;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        int N;
        int[] A;
        int[] B;

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            N = in.Int();
            A = in.Int(N);
            B = in.Int(N);
            Map<Integer, Integer> ac = new HashMap<>();
            Map<Integer, Integer> bc = new HashMap<>();
            for (int i = 0; i < N; i++) {
                ac.merge(A[i], 1, Integer::sum);
                bc.merge(B[i], 1, Integer::sum);
            }
            for (Map.Entry<Integer, Integer> entry : ac.entrySet()) {
                int sum = entry.getValue() + bc.getOrDefault(entry.getKey(), 0);
                if (sum > N) {
                    out.println("No");
                    return;
                }
            }

            Comparator<F.Pair<Integer, Integer>> comparator = (o1, o2) -> {
                int c = Integer.compare(o2.k, o1.k);
                if (c == 0) c = Integer.compare(o1.v, o2.v);
                return c;
            };
            PriorityQueue<F.Pair<Integer, Integer>> queb = new PriorityQueue<>(comparator);
            PriorityQueue<F.Pair<Integer, Integer>> queb2 = new PriorityQueue<>(comparator);
            for (Map.Entry<Integer, Integer> entry : bc.entrySet()) {
                if (ac.containsKey(entry.getKey())) {
                    queb.add(new F.Pair<>(entry.getValue(), entry.getKey()));
                } else {
                    queb2.add(new F.Pair<>(entry.getValue(), entry.getKey()));
                }
            }

            List<Integer> ans = new ArrayList<>();
            F.Pair<Integer, Integer> pb = queb.remove();
            for (int i = 0; i < N; i++) {
                if (pb.v == A[i]) {
                    if (queb.isEmpty()) {
                        break;
                    }
                    F.Pair<Integer, Integer> temp = queb.poll();
                    queb.add(pb);
                    pb = temp;
                }
                ans.add(pb.v);
                pb.k--;
                if (pb.k <= 0) {
                    if (queb.isEmpty()) break;
                    pb = queb.remove();
                }
            }
            while (!queb2.isEmpty()) {
                F.Pair<Integer, Integer> pair = queb2.remove();
                for (int i = 0; i < pair.k; i++) {
                    ans.add(pair.v);
                }
            }
            out.println("Yes");
            out.println(ans.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }

        static class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<F.Pair<K, V>> {
            K k;
            V v;

            Pair(K k, V v) {
                this.k = k;
                this.v = v;
            }

            public int compareTo(F.Pair<K, V> o) {
                int c = this.k.compareTo(o.k);
                if (c == 0) c = this.v.compareTo(o.v);
                return c;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                F.Pair<?, ?> pair = (F.Pair<?, ?>) o;
                return Objects.equals(k, pair.k) &&
                        Objects.equals(v, pair.v);
            }

            public int hashCode() {
                return Objects.hash(k, v);
            }

        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

        public int[] Int(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Int();
            }
            return a;
        }

    }
}

