import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        long[] y = new long[m];
        Map<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextLong();
            map.put(y[i], i);
        }

        String[] ans = new String[m];
        int[] cnt = new int[n];
        Iterator<Long> it = map.keySet().iterator();
        while (it.hasNext()) {
            int i = map.get(it.next());
            cnt[p[i] - 1]++;
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%06d", p[i]));
            sb.append(String.format("%06d", cnt[p[i] - 1]));
            ans[i] = sb.toString();
        }
        for (int i = 0; i < m; i++) {
            System.out.println(ans[i]);
        }
    }

}
