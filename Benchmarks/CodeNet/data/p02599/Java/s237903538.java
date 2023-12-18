import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int Q = scan.nextInt();
        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            c[i] = scan.nextInt()-1;
        }
        SegmentTree<Integer>[] seg = new SegmentTree[N];
        for (int i = 0; i < N; i++) {
            seg[i] = new SegmentTree<>(N, 0, Integer::max);
        }
        for (int i = 0; i < N; i++) {
            seg[c[i]].update(i, 1);
        }
        for (int i = 0; i < Q; i++) {
            int l = scan.nextInt()-1;
            int r = scan.nextInt();
            int ans = 0;
            for (int j = 0; j < N; j++) {
                ans += seg[j].query(l, r);
            }
            System.out.println(ans);
        }
    }
    class SegmentTree<T> {
        int size;
        T initialValue;
        List<T> list;
        BiFunction<? super T, ? super T, ? extends T> biFunction;
        SegmentTree(int n, T initialValue, BiFunction<? super T, ? super T, ? extends T> biFunction) {
            int size = 1;
            while (size < n) {
                size *= 2;
            }
            this.size = size;
            List<T> list = new ArrayList<T>();
            for (int i = 0; i < size * 2; i++) {
                list.add(initialValue);
            }
            this.list = list;
            this.initialValue = initialValue;
            this.biFunction = biFunction;
        }
        void update(int index, T value) {
            index += this.size - 1;
            list.set(index, value);
            while (0 < index) {
                index = (index - 1) / 2;
                list.set(index, biFunction.apply(list.get(2 * index + 1), list.get(2 * index + 2)));
            }
        }
        T query(int start, int end) {
            return query(start, end, 0, 0, this.size);
        }
        T query(int start, int end, int index, int left, int right) {
            if (right <= start || end <= left) {
                return this.initialValue;
            }
            if (start <= left && right <= end) {
                return list.get(index);
            }
            T value_left = query(start, end, index * 2 + 1, left, (left + right) / 2);
            T value_right = query(start, end, index * 2 + 2, (left + right) / 2, right);
            return biFunction.apply(value_left, value_right);
        }
    }
}
