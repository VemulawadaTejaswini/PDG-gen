import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < m; ++i) arr.add(new ArrayList<>());

        for (int i = 0; i < m; ++i) {
            int k = sc.nextInt();
            for (int j = 0; j < k; ++j) {
                int a = sc.nextInt();
                arr.get(i).add(--a);
            }
        }

        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i < m; ++i) p.add(sc.nextInt());

        long res = 0;
        for (int bit = 0; bit < (1<<n); ++bit) {
            boolean ok = true;
            for (int i = 0; i < m; ++i) {
                int con = 0;
                for (Integer val : arr.get(i)) {
                    if ((bit & (1<<val)) != 0) ++con;
                }
                if (con % 2 != p.get(i)) ok = false;
            }
            if (ok) ++res;
        }
        System.out.println(res);
    }
}