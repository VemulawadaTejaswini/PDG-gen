import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Task solve = new Task();
        solve.solve(in, out);
        out.close();
    }

    static class Task {
        public void solve(InputReader in, PrintWriter out) {
//            int T = in.nextInt();
//            while (T-- > 0) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                boolean flag = true;
                if (a == b && b == c) flag = false;
                if (a != b && b != c && a != c) flag = false;
                out.println(flag ? "Yes" : "No");
//            }
        }

        public int lowerBound(long[] a, long x) {
            int l = 0, r = a.length - 1, mid = (l + r) / 2;
            while (l <= r) {
                if (a[mid] >= x) r = mid;
                else l = mid + 1;
                if (l == r) {
                    if (a[l] >= x) return l;
                    else return l + 1;
                }
                mid = (l + r) / 2;
            }
            return l;
        }

        public int upperBound(long[] a, long x) {
            int l = 0, r = a.length - 1, mid = (l + r) / 2;
            while (l <= r) {
                if (a[mid] <= x) l = mid + 1;
                else r = mid;
                if (l == r) {
                    if (a[l] > x) return l;
                    else return l + 1;
                }
                mid = (l + r) / 2;
            }
            return l;
        }

        private void perm(int[] a, int cur, List<Integer> tmp, List<List<Integer>> list) {
            if (cur == a.length) {
                List<Integer> res = new ArrayList<>();
                res.addAll(tmp);
                list.add(res);
                return;
            }
            for (int i = cur; i < a.length; ++i) {
                swap(a, i, cur);
                tmp.add(a[cur]);
                perm(a, cur + 1, tmp, list);
                tmp.remove(tmp.size() - 1);
                swap(a, i, cur);
            }
        }

        public void swap(int[] a, int i, int j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }

    public static class P {
        int x, y;
        P() {}
        P(int u, int v) { x = u; y = v; }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}