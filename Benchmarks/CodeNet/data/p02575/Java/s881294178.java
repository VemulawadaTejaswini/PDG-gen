import java.util.*;

public class Main {

    private static class Node {
        int x;
        long v;
        Node(int x, long v) {
            this.x = x;
            this.v = v;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        TreeMap<Integer, Long> M = new TreeMap<>();
        TreeSet<Node> S = new TreeSet<>((a, b) -> {
            if (a.v < b.v || (a.v == b.v && a.x < b.x)) return -1;
            if (a.v == b.v && a.x == b.x) return 0;
            return 1;
        });
        for (int i = 1; i <= m; i++) {
            M.put(i, 0L);
            S.add(new Node(i, 0L));
        }
        for (int i = 1; i <= n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            Integer fb = M.floorKey(b + 1);
            if (fb != null) {
                int x = fb.intValue();
                long tem = M.get(x) + b + 1 - x;
                if (x != b + 1 && b + 1 <= m) {
                    M.put(b + 1, tem);
                    S.add(new Node(b + 1, tem));
                }
            }
            while (true) {
                fb = M.floorKey(b);
                if (fb == null) break;
                int x = fb.intValue();
                long v = M.get(x);
                if (x < a) break;
                M.remove(x);
                S.remove(new Node(x, v));
            }
            System.out.println(S.size() == 0 ? -1 : S.first().v + i);
        }
    }
}
