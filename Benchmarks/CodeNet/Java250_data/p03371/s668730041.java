import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int mx = Math.max(x, y);
        int mn = Math.min(x, y);

        int ans = 0;
        if (2 * c < a + b) {
            ans += 2 * c * mn;
        } else {
            System.out.println(a * x + b * y);
            return;
        }

        if (x > y) {
            if (a < 2 * c) {
                ans += (x - y) * a;
            } else {
                ans += (x - y) * 2 * c;
            }
        } else {
            if (b < 2 * c) {
                ans += (y - x) * b;
            } else {
                ans += (y - x) * 2 * c;
            }
        }

        System.out.println(ans);
    }
}