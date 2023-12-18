import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = k;
        for (int i = 1; i < n; i++) {
            ans *= k - 1;
        }
        System.out.println(ans);
    }
}