import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int k = in.nextInt();
        // permutation (0-indexed)
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt() - 1;
        }
        int[] c = in.nextIntArray(n);

        class Cycle {
            private List<Integer> indices;
            private long[] maxCounts;

            public Cycle(List<Integer> indices, long[] maxCounts) {
                this.indices = indices;
                this.maxCounts = maxCounts;
            }

            private long valueOf(long k) {
                // q loops
                long q = k / indices.size();
                long r = k % indices.size();
//                out.println("q: " + q + ", r: " + r);

                long ans = 0;
                long loopSum = indices.stream().mapToLong(idx -> c[idx]).sum();
//                out.println("loop sum: " + loopSum);

                long max = Long.MIN_VALUE;
                // maximum score after 0 <= x <= r moves (loop expected)
                if (q > 0) {
                    // including 0 because loop allowed
                    for (int x = 0; x <= r; x++) {
                        // add at least 1 loop sum
                        max = Math.max(max, maxCounts[x] + loopSum);
                    }
//                    out.println("loop score: " + max);
                }
                // maximum score after 1 <= x <= k moves (no loop)
                for (int x = 1; x <= Math.min(maxCounts.length - 1, k); x++) {
//                    out.println("no loop of length " + x + ": " + maxCounts[x]);
                    max = Math.max(max, maxCounts[x]);
                }
//                out.println("no loop score: " + max);

                ans += max;
                // loop only if it is rewarding
                if (loopSum > 0 && q > 0) ans += loopSum * (q - 1);

//                out.println("returning " + ans);
                return ans;
            }
        }

        List<Cycle> cycles = new ArrayList<>();

        // list up permutation's cycles
        {
            int nextIdx = 0;
            boolean[] visited = new boolean[n];
            while (nextIdx < n) {
//                out.println("Checking idx " + nextIdx);
//                out.flush();
                if (visited[nextIdx]) {
                    nextIdx++;
                    continue;
                }

                List<Integer> cycleIndices = new ArrayList<>();
                while (!visited[nextIdx]) {
                    visited[nextIdx] = true;
                    cycleIndices.add(nextIdx);
                    nextIdx = p[nextIdx];
                }
                // calculate max counts for each K value
//                out.println("calculating max counts...");
                long[] maxCounts = new long[cycleIndices.size()];
                long[] nextCounts = new long[cycleIndices.size()];
                long[] beforeCounts = new long[cycleIndices.size()];
                for (int length = 1; length < cycleIndices.size(); length++) {
                    for (int start = 0; start < cycleIndices.size(); start++) {
                        int startIdx = cycleIndices.get(start);
                        nextCounts[start] = length == 1
                                ? c[startIdx]
                                : c[startIdx] + beforeCounts[(start + 1) % cycleIndices.size()];
                    }
                    maxCounts[length] = Arrays.stream(nextCounts).max().getAsLong();
//                    out.println("length " + length + ", counts: " + Arrays.toString(nextCounts));
                    beforeCounts = nextCounts;
                    nextCounts = new long[cycleIndices.size()];
                }
//                out.println("one cycle done (size " + cycleIndices.size() + ", starting from " + cycleIndices.get(0) + ")");
//                out.println("indices: " + cycleIndices);
//                out.println("counts: " + Arrays.toString(cycleIndices.stream().mapToInt(idx -> c[idx]).toArray()));
//                out.println("max counts: " + Arrays.toString(maxCounts));
//                out.flush();

                cycles.add(new Cycle(cycleIndices, maxCounts));
                nextIdx++;
            };
        }

//        out.println("num of cycles: " + cycles.size());
//        out.flush();
        long ans = Long.MIN_VALUE;
        for (Cycle cycle : cycles) {
            ans = Math.max(ans, cycle.valueOf(k));
        }
        out.println(ans);
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
