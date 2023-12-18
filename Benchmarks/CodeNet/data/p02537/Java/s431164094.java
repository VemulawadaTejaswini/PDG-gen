
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int MAX_A = 300000;
        SegmentTree st = new SegmentTree(MAX_A);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() - 1;
            int maxLength = (int) st.getMax(Math.max(0, a - k), Math.min(MAX_A - 1, a + k) + 1) + 1;
            st.set(a, maxLength);
//            System.err.println(maxLength);
            ans = Math.max(maxLength, ans);
        }

        System.out.println(ans);
        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

class SegmentTree {

    int size;
    long[] array; // ルートがインデックス0とする

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public SegmentTree(int n) {
        size = 1;
        while (size < n) {
            size = size * 2;
        }
        array = new long[2 * size - 1];
        Arrays.fill(array, Long.MIN_VALUE);
    }

    // インデックスiに値xをセットする
    public void set(int i, long x) {
        int current = size + i - 1;
        array[current] = x;
        while (true) {
            int parent = (current - 1) / 2;
            array[parent] = Math.max(array[2 * parent + 1], array[2 * parent + 2]);
            current = parent;
            if (current == 0) break;
        }
    }

    // 半開区間 [a, b) の最大値を返す
    public long getMax(int a, int b) {
        return query(a, b, 0, 0, size);
    }

    long query(int a, int b, int k, int l, int r) {
        // またく交差しない場合
        if (r <= a || b <= l) return Long.MIN_VALUE;
        // 完全に含む場合
        if (a <= l && r <= b) return array[k];

        long vl = query(a, b, 2 * k + 1, l, (l + r) / 2);
        long vr = query(a, b, 2 * k + 2, (l + r) / 2, r);
        return Math.max(vl, vr);
    }
}
