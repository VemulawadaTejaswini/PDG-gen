import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
      
        int n = Integer.parseInt(sc.next());
        TreeMap<String, Integer> map = new TreeMap<>();
        String str;
        Integer count;
        for (int i = 0; i < n; i++) {
            str = sc.next();
            if (map.containsKey(str)) {
                count = map.get(str) + 1;
            } else {
                count = 1;
            }
            map.put(str, count);
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        int max = 0;
        for (Map.Entry<String, Integer> e : set) {
            max = Math.max(e.getValue(), max);
        }
        for (Map.Entry<String, Integer> e : set) {
            if (e.getValue() == max) out.println(e.getKey());
        }

        out.flush();
    }
}