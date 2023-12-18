import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashMap;
import java.io.IOException;
import java.util.Deque;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Objects;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int T = in.Int();
            Set<A.Pair<Long, Long>> col = new HashSet<>();
            Set<A.Pair<Long, Long>> col2 = new HashSet<>();
            HashMap<Long, Long> map = new HashMap<>();
            for (int t = 0; t < T; t++) {
                long N = in.Long();
                long A = in.Long();
                long B = in.Long();
                long C = in.Long();
                long D = in.Long();

                map.clear();
                col.clear();
                col.add(new A.Pair<>(D, 1L));
                Deque<A.Pair<Long, Long>> que2 = new ArrayDeque<>();
                PriorityQueue<A.Pair<Long, Long>> que = new PriorityQueue<>((o1, o2) -> Long.compare(o1.v, o2.v));
                que.add(new A.Pair<>(N, 0L));
                long ans = 1L << 60;
                long[] mul = new long[]{2, 3, 5};
                long[] cost = new long[]{A, B, C};
                while (!que.isEmpty()) {
                    A.Pair<Long, Long> q = que.poll();
                    long pos = q.k;
                    long cos = q.v;
                    if (map.containsKey(pos) && map.get(pos) <= cos) {
                        continue;
                    }
                    map.put(pos, cos);
                    double b = cos + (double) pos * D;
                    if (b < Long.MAX_VALUE) {
                        que.add(new A.Pair<>(0L, (long) b));
                    }
                    for (int i = 0; i < 3; i++) {
                        long mod = pos % mul[i];
                        if (mod == 0) {
                            long p = pos / mul[i];
                            long c = cos + cost[i];
                            que.add(new A.Pair<>(p, c));
                        } else {
                            A.Pair<Long, Long> e = new A.Pair<>((pos - mod) / mul[i], cos + cost[i] + mod * D);
                            que.add(e);
                            A.Pair<Long, Long> e1 = new A.Pair<>((pos + (mul[i] - mod)) / mul[i], cos + cost[i] + (mul[i] - mod) * D);
                            que.add(e1);
                        }
                    }
                }

//            for (Pair<Long, Long> e : col) {
//                long temp = e.k + Math.abs(N - e.v) * D;
//                ans = Math.min(ans, temp);
//            }
                out.println(map.get(0L));
            }
        }

        static class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<A.Pair<K, V>> {
            K k;
            V v;

            Pair(K k, V v) {
                this.k = k;
                this.v = v;
            }

            public int compareTo(A.Pair<K, V> o) {
                int c = this.k.compareTo(o.k);
                if (c == 0) c = this.v.compareTo(o.v);
                return c;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                A.Pair<?, ?> pair = (A.Pair<?, ?>) o;
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

        public long Long() {
            return Long.parseLong(next());
        }

    }
}

