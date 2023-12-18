import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            sum += a;
            map.merge(a, 1, Integer::sum);
        }
        int q = Integer.parseInt(sc.next());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            if (map.containsKey(b)) {
                int num = map.get(b);
                sum += (c - b) * num;
                int cnt = map.remove(b);
                map.merge(c, cnt, Integer::sum);
            }
            sb.append(sum);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}