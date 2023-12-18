import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<String, Integer> map = new TreeMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            map.merge(s, 1, Integer::sum);
            max = Math.max(max, map.get(s));
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue().equals(max)) {
                sb.append(e.getKey());
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}