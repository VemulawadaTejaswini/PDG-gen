
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[] A = new int[H];
        int[] B = new int[H];
        for (int i = 0; i < H; i++) {
            A[i] = scan.nextInt()-1;
            B[i] = scan.nextInt()-1;
        }
        PriorityQueue<Range> queue = new PriorityQueue<>();
        queue.add(new FlatRange(0, W-1, 0));
        for (int i = 1; i <= H; i++) {
            int current_left = A[i-1];
            int current_right = B[i-1];
            int ans = Integer.MAX_VALUE;
            PriorityQueue<Range> next = new PriorityQueue<>(new RangeComparator());
            while(!queue.isEmpty()) {
                Range range = queue.poll();
                if (current_left <= range.from && range.to <= current_right) {
                    continue;
                }
                if (range.to < current_left || current_right < range.from) {
                    ans = Math.min(ans, range.cost(range.from)+1);
                    next.add(this.increment(range, range.from, range.to));
                }
                if (range.from < current_left) {
                    ans = Math.min(ans, range.cost(range.from)+1);
                    range = increment(range, range.from, current_left - 1);
                    next.add(range);
                }
                if (current_right < range.to) {
                    ans = Math.min(ans, range.cost(current_right + 1) + 1);
                    range = increment(range, current_right + 1, range.to);
                    next.add(range);
                }
            }
            if (ans == Long.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(ans);
            }
        }
    }
    private Range increment(Range range, int from, int to) {
        if (range instanceof FlatRange) {
            FlatRange f = (FlatRange) range;
            return new FlatRange(from, to, f.cost + 1);
        }
        LinearRange l = (LinearRange) range;
        int cost = l.cost(from);
        return new LinearRange(from, to, cost);
    }
    abstract class Range {
        int from;
        int to;
        Range(int from, int to) {
            this.from = from;
            this.to = to;
        }
        abstract int cost(int x);
    }
    class FlatRange extends Range {
        int cost;
        FlatRange(int from, int to, int cost) {
            super(from, to);
            this.cost = cost;
        }
        int cost(int x) {
            if (x < from || to < x) {
                return Integer.MAX_VALUE;
            }
            return this.cost;
        }
    }
    class LinearRange extends Range {
        int from;
        int to;
        int min_cost;
        LinearRange(int from, int to, int min_cost) {
            super(from, to);
            this.min_cost = min_cost;
        }
        int cost(int x) {
            if (x < from || to < x) {
                return Integer.MAX_VALUE;
            }
            return this.min_cost + x - from;
        }
    }
    class RangeComparator implements Comparator<Range> {
        @Override
        public int compare(Range o1, Range o2) {
            if (o1.from != o2.from) {
                return Integer.compare(o1.from, o2.from);
            }
            return Integer.compare(o1.to, o2.to);
        }
    }
}
