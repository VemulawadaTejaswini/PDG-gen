import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int p = 0;
        int size = s.length();
        while (p <= size) {
            String s2 = s.substring(p, size) + s.substring(0,p);
            p++;
            if (s2.equals(t)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}