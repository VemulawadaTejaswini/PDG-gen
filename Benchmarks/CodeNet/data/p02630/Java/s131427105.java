import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        long sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            } else {
                map.put(a[i], 1);
            }
        }
        int q = sc.nextInt();
        int[][] bc = new int[q][2];

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int cnt = map.get(b);
            sum -= b * cnt;
            sum += c * cnt;
            map.remove((Integer)b);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+cnt);
            } else {
                map.put(c, 1);
            }
            sb.append(sum + "\n");
//            System.out.print(map);
        }

        System.out.print(sb.toString());






    }
}
