import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            } else {
                map.put(tmp, 1);
                list.add(tmp);
            }
        }
        long count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) < list.get(i)) {
                count += map.get(list.get(i));
            } else {
                count += map.get(list.get(i)) - list.get(i);
            }
        }
        System.out.println(count);
    }
}