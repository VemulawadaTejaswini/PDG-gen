import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<N; i++) {
            a = sc.nextInt();
            map.put(a, map.containsKey(a) ? map.get(a) + 1 : 1);
            map.put(a+1, map.containsKey(a+1) ? map.get(a+1) + 1 : 1);
            map.put(a-1, map.containsKey(a-1) ? map.get(a-1) + 1 : 1);
        }
        int max = 0;
        for (Integer num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
            }
        }
        System.out.println(max);
    }
}