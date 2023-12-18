import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            boolean f1 = a.charAt(i) != b.charAt(i);
            boolean f2 = b.charAt(i) != c.charAt(i);
            boolean f3 = c.charAt(i) != a.charAt(i);
            if (f1 && f2 && f3) {
                ans += 2;
            } else if (f1 || f2 || f3) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}