import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String t : s) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }
        int min = 0;
        for (Entry<String, Integer> entry : map.entrySet()) {
            min = Math.max(min, entry.getValue());
        }
        Set<String> set = new TreeSet<>();
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) set.add(entry.getKey());
        }
        for (String t : set) {
            System.out.println(t);
        }
    }

}