import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            Integer x = map.get(a);
            if (x == null) {
                map.put(a, 1);
            } else {
                map.put(a, x.intValue() + 1);
            }
            sum += a;
        }

        int q = sc.nextInt();
        int[] b = new int[q];
        int[] c = new int[q];
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            Integer x = map.get(b[i]);
            if (x != null) {
                Integer y = map.get(c[i]);
                if (y == null) {
                    y = 0;
                    map.put(c[i], x.intValue());
                } else {
                    map.put(c[i], x.intValue() + y.intValue());
                }
                map.remove(b[i]);
                sum += (c[i] - b[i]) * x.intValue();
            }
            System.out.println(sum);
        }
    }
}
