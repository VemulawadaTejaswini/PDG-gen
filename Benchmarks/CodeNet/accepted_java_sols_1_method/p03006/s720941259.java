import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (i != j) {
                    int p = x[i] - x[j];
                    int q = y[i] - y[j];
                    String s = p + "," + q;
                    if (map.containsKey(s)) {
                        map.put(s, map.get(s) + 1);
                    } else {
                        map.put(s, 1);
                    }
                }
            }
        }

        int max = 0;
        for (Integer num : map.values()) {
            max = Math.max(max, num);
        }

        System.out.println(n - max);
    }


}