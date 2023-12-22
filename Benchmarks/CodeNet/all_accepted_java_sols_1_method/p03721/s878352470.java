import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        long[] b = new long[n];
        Map<Integer, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextLong();
            map.put(a[i], map.getOrDefault(a[i], 0L) + b[i]);
        }
        long sum = 0;
        for (Integer key : map.keySet()) {
            sum += map.get(key);
            if (sum >= k) {
                System.out.println(key);
                return;
            }
        }
    }

}
