import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0L) + 1);
            sum += a[i];
        }
        int q = sc.nextInt();
        int[] b = new int[q];
        int[] c = new int[q];
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            if (!map.containsKey(b[i])) {
                map.put(b[i], 0L);
            }
            long bcnt = map.get(b[i]);
            if (!map.containsKey(c[i])) {
                map.put(c[i], 0L);
            }
            long ccnt = map.get(c[i]);
            map.put(b[i], 0L);
            map.put(c[i], ccnt + bcnt);
            sum += c[i] * bcnt - b[i] * bcnt;
            System.out.println(sum);
        }

    }

}
