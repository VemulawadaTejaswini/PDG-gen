import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            Map<String, Long> price = new HashMap<String, Long>();
            String[] item = new String[n];
            for (int i = 0; i < n; i++) {
                item[i] = sc.next();
                price.put(item[i], sc.nextLong());
            }
            int m = sc.nextInt();
            Map<String, String[]> rs = new HashMap<String, String[]>();
            for (int i = 0; i < m; i++) {
                String o = sc.next();
                int k = sc.nextInt();
                String[] list = new String[k];
                for (int j = 0; j < k; j++) {
                    list[j] = sc.next();
                }
                rs.put(o, list);
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!rs.containsKey(item[j])) {
                        continue;
                    }
                    String list[] = rs.get(item[j]);
                    long sum = 0;
                    for (int k = 0; k < list.length; k++) {
                        sum += price.get(list[k]);
                    }
                    price.put(item[j], Math.min(price.get(item[j]), sum));
                }
            }
            String ord = sc.next();
            System.out.println(price.get(ord));
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}