import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int last = scanner.nextInt();
        long ans = 0;
        for (int i = 1; i < n; i++) {
            int v = scanner.nextInt();
            if (last > v) {
                ans += last - v;
            }
            last = Math.max(last, v);
        }

        System.out.println(ans);
    }
}