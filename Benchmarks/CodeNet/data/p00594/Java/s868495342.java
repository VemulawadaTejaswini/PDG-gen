import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            Map<String, Integer> hash = new HashMap<String, Integer>();
            String ans = "NO COLOR";
            for (int i = 0; i < n; i++) {
                String k = sc.next();
                if (hash.containsKey(k)) {
                    hash.put(k, hash.get(k) + 1);
                    if (hash.get(k) > n / 2) {
                        ans = k;
                        break;
                    }
                } else
                    hash.put(k, 0);
            }
            System.out.println(ans);
        }
    }
}