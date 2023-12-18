import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0 ; i < 4 ; i++) {
            String t = s.substring(i, i + 1);
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }
        if (map.size() == 2) {
            for (Integer integer : map.values()) {
                if (integer == 2) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                return;
            }
        } else {
            System.out.println("No");
        }
    }

}