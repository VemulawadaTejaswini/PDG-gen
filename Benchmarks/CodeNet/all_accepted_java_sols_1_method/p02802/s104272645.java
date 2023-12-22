import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int penalty = 0;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            String result = sc.next();
            if ("AC".equals(result)) {
                set.add(x);
            } else {
                if (!set.contains(x)) {
                    if (map.containsKey(x)) {
                        map.put(x, map.get(x) + 1);
                    } else {
                        map.put(x, 1);
                    }
                }
            }
        }
        for (int x : set) {
            if (map.containsKey(x)) {
                penalty += map.get(x);
            }
        }
        System.out.println(set.size() + " " + penalty);
    }
}