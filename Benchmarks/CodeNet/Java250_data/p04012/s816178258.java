import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// B - 美しい文字列 / Beautiful Strings
// https://atcoder.jp/contests/abc044/tasks/abc044_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] w = scanner.next().toCharArray();
        scanner.close();

        if (w.length % 2 == 1) {
            System.out.println("No");
            return;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : w) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Integer v : map.values()) {
            if (v % 2 != 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
