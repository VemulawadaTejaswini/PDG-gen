import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Objects;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int num = in.nextInt();

            int bad_count = 0;

            Map<Pair, Long> map = new HashMap<>();

            for (int i = 0; i < num; i++) {
                long a = in.nextLong();
                long b = in.nextLong();

                if (a == 0 && b == 0) {
                    bad_count++;
                } else if (b == 0) {
                    Pair pair = new Pair(1l, 0l);
                    map.put(pair, map.getOrDefault(pair, 0L) + 1);
                } else if (a == 0) {
                    Pair pair = new Pair(0l, -1l);
                    map.put(pair, map.getOrDefault(pair, 0L) + 1);

                } else {
                    long g = gcd(Math.abs(a), Math.abs(b));
                    a = a / g;
                    b = b / g;
                    if (a < 0) {
                        a *= -1;
                        b *= -1;
                    }
                    Pair pair = new Pair(a, b);
                    map.put(pair, map.getOrDefault(pair, 0L) + 1);
                }
            }

            long ans = 1;

            while (!map.keySet().isEmpty()) {
                Pair key = map.entrySet().iterator().next().getKey();

                Pair pair;
                if (key.second < 0) {
                    pair = new Pair(-1 * key.second, key.first);
                } else {
                    pair = new Pair(key.second, -1 * key.first);
                }

                ans *= (pow(2, map.get(key)) - 1) + (pow(2, map.getOrDefault(pair, 0L)) - 1) + 1;
                ans %= 1000000007;

                map.remove(pair);
                map.remove(key);
            }
            ans = (ans + bad_count - 1) % 1000000007;

            out.append(String.valueOf(ans));
        }

        long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        long pow(long x, long n) {
            if (n == 0) {
                return 1;
            }
            long result = pow(x * x, n / 2);
            if (result % 2 == 1) {
                result = result * x;
            }
            return result;
        }

        class Pair implements Comparable<E.Pair> {
            public final Long first;
            public final Long second;

            Pair(Long first, Long second) {
                this.first = first;
                this.second = second;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Pair))
                    return false;
                Pair pair = (Pair) obj;
                return pair.first.equals(first) && pair.second.equals(second);
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(Pair o) {
                int res = Long.compare(first, o.first);
                return res != 0 ? res : Long.compare(second, o.second);
            }

        }

    }
}

