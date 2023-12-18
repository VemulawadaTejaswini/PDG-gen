import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum += x;
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (map.containsKey(a)) {
                int x = map.get(a);
                sum += (long)(b - a) * x;
                map.remove(a);
                if (map.containsKey(b)) {
                    map.put(b, map.get(b) + x);
                } else {
                    map.put(b, x);
                }
            }
            sb.append(sum).append("\n");
        }
       System.out.print(sb);
    }
}