import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int N;
    private static List<Integer> h = new ArrayList<>();

    static {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        for (int i = 0; i < N; i++) {
            h.add(Integer.parseInt(sc.next()));
        }
    }

    public static void main(String[] args) {
        System.out.println(rec(h));
    }

    private static int rec(List<Integer> l) {
        if (l == null || l.size() == 0) {
            return 0;
        }
        if (l.size() == 1) {
            return l.get(0);
        }
        int min = 101;

        for (int i : l) {
            min = Math.min(min, i);
        }

        int res = min;
        List<Integer> newL = new ArrayList<>();
        for (int i : l) {
            int v = i - min;
            if (v != 0) {
                newL.add(v);
            } else {
                res += rec(newL);
                newL = new ArrayList<>();
            }
        }

        if (!newL.isEmpty()) {
            res += rec(newL);
        }

        return res;
    }
}
