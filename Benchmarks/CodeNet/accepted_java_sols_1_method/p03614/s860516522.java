import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int c = 0;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (scanner.nextInt() != i) {
                ans += (c + 1) / 2;
                c = -1;
            }
            c++;
        }
        System.out.println(ans + (c + 1) / 2);
    }
}