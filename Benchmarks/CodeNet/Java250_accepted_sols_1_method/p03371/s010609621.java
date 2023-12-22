import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        long ans = 0;
        int min = Math.min(x, y);
        if (a + b > c * 2) {
            ans += c * 2 * min;
        } else {
            ans += min * a + min * b;
        }
        int sub = Math.abs(x - y);
        if (sub != 0) {
            if (x > y) {
                if (a > c * 2) {
                    ans += c * 2 * sub;
                } else {
                    ans += a * sub;
                }
            } else {
                if (b > c * 2) {
                    ans += c * 2 * sub;
                } else {
                    ans += b * sub;
                }
            }
        }
        System.out.println(ans);
    }
}