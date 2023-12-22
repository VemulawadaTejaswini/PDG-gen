import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();
        String s = std.next();
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put('A', 'a');
        mapping.put('B', 'b');
        mapping.put('C', 'c');

        for (int i = 0; i < n; i++) {
            Character c = s.charAt(i);
            if (i == k - 1) {
                sb.append(mapping.get(c));
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
