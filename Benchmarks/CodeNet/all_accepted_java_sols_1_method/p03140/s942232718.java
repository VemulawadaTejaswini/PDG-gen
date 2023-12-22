
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        int num = 0;
        for (int i = 0; i < n; ++i) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            char c3 = c.charAt(i);
            if (c1 == c2 && c2 == c3) {
                continue;
            } else if (c1 == c2 || c2 == c3 || c1 == c3) {
                ++num;
            } else {
                num += 2;
            }
        }
        System.out.println(num);
    }
}
