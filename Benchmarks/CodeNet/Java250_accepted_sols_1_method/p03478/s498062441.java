import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int x = i;
            while (true) {
                if (x / 10 != 0) {
                    sum += x % 10;
                    x /= 10;
                } else {
                    sum += x;
                    break;
                }
            }
            if (a <= sum && sum <= b) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}