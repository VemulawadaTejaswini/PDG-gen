import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (map.containsKey(num)) {
                int tmp = map.get(num);
                tmp++;
                map.put(num, tmp);
            } else {
                map.put(num, 1);
            }
        }
        int count = 0;
        for (int key : map.keySet()) {
            int tmp = map.get(key);
            if (tmp < key) {
                count += tmp;
            } else {
                count += tmp - key;
            }
        }
        System.out.println(count);
    }
}
