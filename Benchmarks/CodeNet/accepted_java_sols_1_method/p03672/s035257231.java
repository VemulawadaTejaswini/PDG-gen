import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int len = s.length();
        while (true) {
            s = s.substring(0, s.length() - 2);
            len -= 2;

            boolean ok = true;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(i + s.length() / 2)) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                System.out.println(len);
                return;
            }
        }
    }
}
