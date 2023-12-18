import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        double h = x / (double)(a * a);
        double hh;
        double ans;
        if (h > (b / 2.0)) {
            h = b - h;
            hh = 2 * h * a / a;
            ans = Math.atan(hh / a);
            System.out.println(Math.toDegrees(ans));
        } else {
            hh = 2 * h * a / b;
            ans = Math.atan(hh / b);
            System.out.println(Math.toDegrees((Math.PI / 2.0) - ans));
        }
    }
}