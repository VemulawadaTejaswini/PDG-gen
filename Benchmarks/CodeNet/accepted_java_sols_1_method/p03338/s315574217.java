import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Map<Character, Integer> map =new HashMap<>();
        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, ++count);
        }

        Set<Character> set = new HashSet<>();
        int max = 0;
        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, --count);
            set.add(c);
            
            int tmp = 0;
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() == 0) continue;
                if (set.contains(e.getKey())) tmp++;
            }

            max = Math.max(max, tmp);
        }

        System.out.println(max);
    }
}