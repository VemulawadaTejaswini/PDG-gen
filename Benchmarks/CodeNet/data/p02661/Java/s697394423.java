import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new Pair(scan.nextInt(), scan.nextInt()));
        }
        if (N % 2  == 1) {
            list.sort(new PairAComparator());
            long left = list.get(N / 2).A;
            list.sort(new PairBComparator());
            long right = list.get(N / 2).B;
            System.out.println(right - left + 1);
            return;
        }
        list.sort(new PairAComparator());
        long left = list.get(N / 2 - 1).A + list.get(N / 2).A;
        list.sort(new PairBComparator());
        long right = list.get(N / 2 - 1).B + list.get(N / 2).B;
        System.out.println(right - left + 1);
        return;
    }
    class Pair {
        long A;
        long B;
        Pair(long A, long B) {
            this.A = A;
            this.B = B;
        }
    }
    class PairAComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.A != o2.A) {
                return Long.compare(o1.A, o2.A);
            }
            return Long.compare(o1.B, o2.B);
        }
    }
    class PairBComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.B != o2.B) {
                return Long.compare(o1.B, o2.B);
            }
            return Long.compare(o1.A, o2.A);
        }
    }
}
