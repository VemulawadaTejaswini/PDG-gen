import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        if (2 * c < a && 2 * c < b) {
            int p = Math.max(x, y);
            ans = 2 * p * c;
        } else if (2 * c < a) {
            int p = Math.max(0, y - x);
            ans = 2 * x * c + b * p;
        } else if (2 * c < b) {
            int p = Math.max(0, x - y);
            ans = 2 * y * c + a * p;
        } else if (2 * c < a + b) {
            if (x < y) {
                ans += 2 * x * c;
                ans += (y - x) * b;
            } else {
                ans += 2 * y * c;
                ans += (x - y) * a;
            }
        } else {
            ans = a * x + b * y;
        }
        System.out.println(ans);
    }
}
