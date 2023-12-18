import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            int D = sc.nextInt();
            if (d.containsKey(D)) {
                d.put(D, d.get(D) + 1);
            } else {
                d.put(D, 1);
            }
        }
        int m = sc.nextInt();
        Map<Integer, Integer> t = new HashMap<>();
        for (int i = 0 ; i < m ; i++) {
            int D = sc.nextInt();
            if (t.containsKey(D)) {
                t.put(D, t.get(D) + 1);
            } else {
                t.put(D, 1);
            }
        }

        for (Integer num : t.keySet()) {
            if (d.containsKey(num) && d.get(num) >= t.get(num)) {

            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}