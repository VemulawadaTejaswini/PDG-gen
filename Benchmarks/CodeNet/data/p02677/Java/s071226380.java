import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        int a = Integer.parseInt(A);
        String B = scan.next();
        int b = Integer.parseInt(B);
        String H = scan.next();
        int h = Integer.parseInt(H);
        String M = scan.next();
        int m = Integer.parseInt(M);

        double angle = Math.abs((30 * h + 0.5 * m) - 6 * m);
        double cos = Math.cos(Math.toRadians(angle));

        double ans;
        if (angle == 0) {
            ans = Math.abs(a - b);
        } else {
            ans = Math.sqrt((a * a) + (b * b) - (2 * a * b * cos));
        }

        System.out.println(ans);
    }
}