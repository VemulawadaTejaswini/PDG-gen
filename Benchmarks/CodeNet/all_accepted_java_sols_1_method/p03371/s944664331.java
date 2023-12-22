import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        long ans = 0;
        if((a + b) > 2 * c) {
            int m = Math.min(x, y);
            ans += m * 2 * c;
            x -= m;
            y -= m;
            if(x > 0 && a > 2 * c) {
                ans += x * 2 * c;
                y -= x;
            } else if(x > 0) ans += x * a;
            if(y > 0 && b > 2 * c) {
                ans += y * 2 * c;
                x -= y;
            } else if(y > 0) ans += y * b;
        }
        else if(a > 2 * c) {
            ans += x * a;
            y -= x;
            if(y > 0) ans += y * b;
        }
        else if(b > 2 * c) {
            ans += y * b;
            x -= y;
            if(x > 0) ans += x * a;
        }
        else ans += x * a + y * b;

        System.out.println(ans);
    }
}
