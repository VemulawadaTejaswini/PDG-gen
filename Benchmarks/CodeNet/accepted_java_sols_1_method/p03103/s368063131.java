import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        SortedMap<Integer, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            long num = Long.parseLong(sc.next());
            map.merge(temp, num, (v1, v2) -> v1 + v2);
        }
        long ans = 0;
        for (int i = 0; i < m; i++) {
            int temp = map.firstKey();
            ans += temp;
            long num = map.get(temp) - 1;
            if (num == 0) {
                map.remove(temp);
            } else {
                map.put(temp, num);
            }

        }
        System.out.println(ans);
    }
}
