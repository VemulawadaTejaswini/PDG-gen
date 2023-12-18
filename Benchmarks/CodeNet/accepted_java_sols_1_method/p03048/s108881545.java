import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; r * i <= n; i++) {
            for (int j = 0; r * i + g * j <= n; j++) {
                if ((n - r * i - g * j) % b == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}