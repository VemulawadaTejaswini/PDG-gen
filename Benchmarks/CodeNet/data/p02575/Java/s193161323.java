import java.util.*;

public class Main {

    static class Node{
        int x, v;
        Node(int x, int v) {
            this.x = x;
            this.v = v;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        TreeMap<Integer, Integer> M = new TreeMap<>();
        TreeSet<Node> S = new TreeSet<>((a, b) -> {
            if (a.v < b.v || (a.v == b.v && a.x < b.x)) return -1;
            if (a.v == b.v && a.x == b.x) return 0;
            return 1;
        });
        for (int i = 1; i <= m; i++) {
            M.put(i, 0);
            S.add(new Node(i, 0));
        }
        for (int i = 1; i <= n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int minV = M.getOrDefault(b + 1, Integer.MAX_VALUE);
            while (true) {
                Integer fb = M.floorKey(b);
                if (fb == null) break;
                int x = fb.intValue();
                int v = M.get(x);
                minV = Math.min(minV, v + b + 1 - x);
                if (x < a) break;
                M.remove(x);
                S.remove(new Node(x, v));
            }
            if (b + 1 <= m) {
                if (M.containsKey(b + 1)) {
                    M.remove(b + 1);
                    S.remove(new Node(b + 1, M.get(b + 1)));
                }
                if (minV != Integer.MAX_VALUE) {
                    M.put(b + 1, minV);
                    S.add(new Node(b + 1, minV));
                }
            }
            System.out.println(S.size() == 0 ? -1 : S.first().v + i);
        }
    }
}
