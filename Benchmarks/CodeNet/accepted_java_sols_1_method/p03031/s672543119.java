import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; ++i) li.add(new ArrayList<>());

        for (int i = 0; i < m; ++i) {
            int num = sc.nextInt();
            for (int j = 0; j < num; ++j) {
                int s = sc.nextInt() - 1;
                li.get(i).add(s);
            }
        }

        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < m; ++i) p.add(sc.nextInt());

        int res = 0;
        for (int bit = 0; bit < (1<<n); ++bit) {
            int ok = 0;
            for (int i = 0; i < m; ++i) {
                int cnt = 0;
                for (Integer val : li.get(i)) {
                    if ((bit & (1<<val)) != 0) ++cnt;
                }
                if (cnt % 2 == p.get(i)) ++ok;
            }
            if (ok == m) ++res;
        }

        System.out.println(res);
    }
}