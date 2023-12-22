import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0l) + 1);
        }
        long sum = 0;
        for (Integer key : map.keySet()) {
            long val = map.get(key);
            sum += (val * (val - 1)) / 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(sum - map.get(a[i]) + 1);
        }
    }

}
