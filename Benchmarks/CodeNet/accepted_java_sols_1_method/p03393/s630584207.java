import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder(s);
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 'a');
                if (set.contains(c)) {
                    continue;
                }
                sb.append(c);
                System.out.println(sb);
                return;
            }
        }

        for (int i = 0; i < 26; i++) {
            char c = sb.charAt(sb.length() - 1);
            set.remove(c);
            sb.delete(sb.length() - 1, sb.length());
            for (int j = c - 'a' + 1; j < 26; j++) {
                char ch = (char) (j + 'a');
                if (set.contains(ch)) {
                    continue;
                }
                sb.append(ch);
                System.out.println(sb);
                return;
            }
        }
        System.out.println(-1);
    }

}
