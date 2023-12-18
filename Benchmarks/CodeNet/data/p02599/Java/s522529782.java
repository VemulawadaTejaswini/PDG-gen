import java.util.*;

public class Main {

    static class BIT {
        int size;
        int[] c;
        BIT(int size) {
            this.size = size;
            c = new int[size + 1];
        }

        void add(int x, int v) {
            for (; x <= size; x += x & (-x)) c[x] += v;
        }

        int get(int x) {
            int ans = 0;
            for (; x > 0; x -= x & (-x)) ans += c[x];
            return ans;
        }
    }
    static class Node {
        int s, e, index;
        Node(int s, int e, int index) {
            this.s = s;
            this.e = e;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = scan.nextInt();
        List<Node> list = new ArrayList();
        for (int i = 0; i < k; i++) {
            int s = scan.nextInt();
            int e = scan.nextInt();
            list.add(new Node(s, e, i));
        }
        Collections.sort(list, (e1, e2) -> Integer.compare(e1.e, e2.e));

        BIT bit = new BIT(n);
        Map<Integer, Integer> M = new HashMap();
        int[] ans = new int[k];
        int pos = 1;
        for (int i = 0; i < k; i++) {
            Node cur = list.get(i);
            while (pos <= n && pos <= cur.e) {
                int v = a[pos];
                if (M.containsKey(v)) bit.add(M.get(v), -1);
                M.put(v, pos);
                bit.add(pos, 1);
                pos++;
            }
            ans[cur.index] = bit.get(cur.e) - bit.get(cur.s - 1);
        }
        for (int i = 0; i < k; i++) System.out.println(ans[i]);
    }
}
