import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> m = new HashSet<>();
        boolean ok = false;
        for (int i = 0; i < s.length(); i++) {
            m.add(s.charAt(i));
        }
        if (m.size() == 2) {
            int counter = 0;
            char c = s.charAt(0);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    counter++;
                }
            }
            if (counter == 2) {
                ok = true;
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}