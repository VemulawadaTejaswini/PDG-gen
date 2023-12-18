import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int ax = 0;
        int bx = 0;
        int cx = 0;
        int ans = 0;

        for (int i = 0; i < 1001; i++) {
            if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
                ax = (b / 2) + (c / 2);
                bx = (a / 2) + (c / 2);
                cx = (a / 2) + (b / 2);
                a = ax;
                b = bx;
                c = cx;
                ans += 1;
            } else {
                break;
            }
        }
        if (ans >= 1000) {
            ans = -1;
        }
        System.out.print(ans);
    }
}