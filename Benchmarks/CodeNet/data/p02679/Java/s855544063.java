import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

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

            Map<Pair<Integer, Integer>, Integer> map = new HashMap<>();

            for (int i = 0; i < num; i++) {
                int a = in.nextInt();
                int b = in.nextInt();

                if (a == 0 && b == 0) {
                    bad_count++;
                } else if (b == 0) {
                    Pair pair = new Pair(1, 0);
                    map.put(pair, map.get(pair) == null ? 1 : map.get(pair) + 1);
                } else if (a == 0) {
                    Pair pair = new Pair(0, -1);
                    map.put(pair, map.get(pair) == null ? 1 : map.get(pair) + 1);

                } else {
                    int g = gcd(a, b);
                    a = a / g;
                    b = b / g;
                    if (a < 0) {
                        a *= -1;
                        b *= -1;
                    }
                    Pair pair = new Pair(a, b);
                    map.put(pair, map.get(pair) == null ? 1 : map.get(pair) + 1);
                }
            }

            int ans = 1;

            while (!map.keySet().isEmpty()) {
                Pair<Integer, Integer> key = map.entrySet().iterator().next().getKey();

                Pair pair;
                if (key.second < 0) {
                    pair = new Pair(-1 * key.second, key.first);
                } else {
                    pair = new Pair(key.second, -1 * key.first);
                }
                int pair_c = 0;
                if (map.containsKey(pair)) {
                    pair_c = map.get(pair);
                    map.remove(pair);
                }
                ans *= ((int) Math.pow(2, map.get(key)) - 1) + ((int) (Math.pow(2, pair_c)) - 1) + 1;
                ans %= 1000000007;

                map.remove(key);
            }
            ans = (ans + bad_count - 1) % 1000000007;

            out.append(String.valueOf(ans));


        }

        int gcd(int i, int j) {
            int x, y;
            if (i > j) {
                x = i;
                y = j;
            } else {
                x = j;
                y = i;
            }
            int tmp;
            while ((tmp = x % y) != 0) {
                x = y;
                y = tmp;
            }
            return y;
        }

        class Pair<F, S> {
            public final F first;
            public final S second;

            Pair(F first, S second) {
                this.first = first;
                this.second = second;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Pair))
                    return false;
                Pair pair = (Pair) obj;
                return (first.equals(pair.first) && second.equals(pair.second));
            }

            public int hashCode() {
                return first.hashCode() ^ second.hashCode();
            }

        }

    }
}

