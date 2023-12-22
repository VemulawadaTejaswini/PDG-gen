import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            if (scanner.nextInt() > x) {
                System.out.println(Math.min(i, m - i));
                return;
            }
        }
    }
}