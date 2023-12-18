import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), ans = 0;
        for (int i = 0, max = 0, h; i < n; i++) {
            if (max <= (h = scanner.nextInt())) {
                ans++;
                max = h;
            }
        }
        System.out.println(ans);
    }
}