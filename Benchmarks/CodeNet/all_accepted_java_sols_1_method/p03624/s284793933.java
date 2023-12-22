import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Map<Character, Integer> map = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            map.put(i, 0);
        }

        for (char c : str.toCharArray()) {
            map.put(c, map.get(c) + 1);
        }

        Optional<Character> ans = map.entrySet().stream()
                .filter(a -> a.getValue() == 0)
                .map(a -> a.getKey())
                .findFirst();

        if (ans.isPresent()) {
            System.out.println(ans.get());
        } else {
            System.out.println("None");
        }
    }
}
