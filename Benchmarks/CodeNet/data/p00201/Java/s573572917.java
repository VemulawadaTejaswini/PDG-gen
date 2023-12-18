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
            for (int i = 0; i < m; i++) {
                String o = sc.next();
                int k = sc.nextInt();
                int sum = 0;
                for (int j = 0; j < k; j++) {
                    String name = sc.next();
                    if (price.containsKey(name))
                        sum += price.get(name);
                }
                price.put(o, Math.min(sum, price.get(o)));
            }
            String ord = sc.next();
            System.out.println(price.get(ord));
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}