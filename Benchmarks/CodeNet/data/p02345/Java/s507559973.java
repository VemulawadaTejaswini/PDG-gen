
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int q = Integer.parseInt(scan.next());

        SegTree st = new SegTree(n);

        for (int i = 0; i < q; i++) {
            int com = Integer.parseInt(scan.next());
            int x = Integer.parseInt(scan.next());
            int y = Integer.parseInt(scan.next());
            if (com == 0) {
                st.update(x, y);
            } else {
                System.out.println(st.find(x, y + 1));
            }
        }
        scan.close();
    }

    static class SegTree {
        int size = 1;
        int[] node;

        public SegTree(int n) {
            while (size < n) {
                size *= 2;
            }
            node = new int[2 * size];
            for (int i = 0; i < 2 * size; i++) {
                node[i] = Integer.MAX_VALUE;
            }
        }

        public void update(int i, int x) {
            int index = i + size - 1;
            node[index] = x;
            while (index > 0) {
                index = (index - 1) / 2;
                node[index] = Math.min(node[2 * index + 1], node[2 * index + 2]);
            }
        }

        public int find(int s, int t) {
            return find(s, t, 0, 0, size);
        }

        private int find(int s, int t, int i, int left, int right) {
            if (t <= left || right <= s) {
                return Integer.MAX_VALUE;
            }
            if (s <= left && right <= t) {
                return node[i];
            }

            int l = find(s, t, 2 * i + 1, left, (left + right) / 2);
            int r = find(s, t, 2 * i + 2, (left + right) / 2, right);
            return Math.min(l, r);
        }
    }

}

