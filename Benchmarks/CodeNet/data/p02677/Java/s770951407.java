import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        double hh = 2 * Math.PI * h / 12.0;
        hh += 2 * Math.PI * m / 720.0;
        double mm = 2 * Math.PI * m / 60.0;
        double hm = Math.abs(hh - mm);
        if (hm > Math.PI) {
            hm = 2 * Math.PI - hm;
        }
        double ans = Math.sqrt(a * a + b * b - 2.0 * a * b * Math.cos(hm));
        System.out.println(ans);
    }
}