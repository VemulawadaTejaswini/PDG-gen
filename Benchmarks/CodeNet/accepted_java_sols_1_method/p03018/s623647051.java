
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        long a = 0L;
        long bc = 0L;
        long count = 0;
        int i = 0;
        while (i < s.length()) {
            boolean isA = false;
            boolean isBc = false;
            while (i < s.length() && s.charAt(i) == 'A') {
                ++a;
                ++i;
                isA = true;
            }
            if (isA == false) {
                ++i;
                a = 0;
                continue;
            }
            bc = 0;
            while (i + 1 < s.length() && s.charAt(i) == 'B' && s.charAt(i + 1) == 'C') {
                ++bc;
                i += 2;
                isBc = true;
            }
            if (bc == 0) {
               // ++i;
                a = 0;
                continue;
            }
            count += bc * a;

        }
        System.out.println(count);
    }
}
