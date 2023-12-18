

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
    public static class Solver {
        private final int N;
        private final long W;
        private final List<Long> values;
        private final List<Long> weights;

        public Solver(int N, long W, List<Long> values, List<Long> weights) {
            this.N = N;
            this.W = W;
            this.values = values;
            this.weights = weights;
        }

        public long solve() {
            int n1 = N >> 1;
            int n2 = N - n1;
            List<VW> g1 = getCombs(n1, values, weights);
            List<VW> g2 = getCombs(n2, values.subList(n1, N), weights.subList(n1, N));
            g1 = sortAndRemove(g1);
            g2 = sortAndRemove(g2);
            long res = 0L;
            for (VW vw : g1) {
                long w = W - vw.weight;
                long v = vw.value;
                if (w < 0) {
                    continue;
                }
                int idx = Collections.binarySearch(g2, new VW(-1, w));
                if (idx < 0) {
                    idx = -idx - 1;
                    idx = idx - 1;
                    if (idx < 0) {
                        continue;
                    }
                }
                assert g2.get(idx).weight <= w;
                res = Math.max(res, v + g2.get(idx).value);
            }
            return res;
        }

        private List<VW> getCombs(int n, List<Long> values, List<Long> weights) {
            List<VW> ret = new ArrayList<>();
            for (int i = 0; i < 1 << n; ++i) {
                long v = 0L;
                long w = 0L;
                for (int j = 0; j < n; ++j) {
                    if (0x1 == ((i >> j) & 0x1)) {
                        v += values.get(j);
                        w += weights.get(j);
                    }
                }
                ret.add(new VW(v, w));
            }
            return ret;
        }

        private List<VW> sortAndRemove(List<VW> vws) {
            Collections.sort(vws);
            List<VW> ret = new ArrayList<>();
            VW prev = null;
            for (VW vw : vws) {
                if (null == prev || vw.value > prev.value) {
                    prev = vw;
                    ret.add(vw);
                }
            }
            return ret;
        }

        private static class VW implements Comparable<VW> {
            private final long value;
            private final long weight;
            private VW(long value, long weight) {
                this.value = value;
                this.weight = weight;
            }

            @Override
            public int compareTo(VW o) {
                return Long.compare(weight, o.weight);
            }

            @Override
            public String toString() {
                return String.format("[v:%d,w:%d]", value, weight);
            }
        }
    }

    private static final Pattern SPLIT = Pattern.compile("\\s");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> NW = Stream.of(SPLIT.split(scanner.nextLine())).map(Long::valueOf)
                .collect(Collectors.toList());
        final int N = (int)(long)(NW.get(0));
        final long W = NW.get(1);
        List<Long> values = new ArrayList<>();
        List<Long> weights = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            List<Long> collect = Stream.of(SPLIT.split(scanner.nextLine())).map(Long::valueOf).collect(Collectors.toList());
            values.add(collect.get(0));
            weights.add(collect.get(1));
        }
        System.out.println(new Solver(N, W, values, weights).solve());
    }
}