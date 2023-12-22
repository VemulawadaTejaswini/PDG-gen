import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, ++count);
        }
        Set<Character> cs = map.keySet();
        if (cs.size() != 2) {
            System.out.println("No");
            return;
        }
        for (int i : map.values()) {
            if (i != 2) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}