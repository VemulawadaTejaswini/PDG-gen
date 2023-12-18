import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int ans = 0;

        if (a + b < c * 2) {
            ans = a * x + b * y;
        } else {
            int min = Math.min(x, y);
            ans = c * min * 2;
            x -= min;
            y -= min;
            if (a > c * 2) {
                ans += c * 2 * x;
            } else {
                ans += a * x;
            }

            if (b > c * 2) {
                ans += c * 2 * y;
            } else {
                ans += b * y;
            }
        }
        System.out.println(ans);
    }
}