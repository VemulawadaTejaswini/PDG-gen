import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int q1 = q * 4;
        int q2 = q * 8;
        int h = sc.nextInt();
        int h1 = h * 2;
        int h2 = h * 4;
        int s = sc.nextInt();
        int s2 = s * 2;
        int d = sc.nextInt();
        int n = sc.nextInt();

        long res = 0;
        res += (long)(n/2) * Math.min(Math.min(q2,h2), Math.min(s2,d));

        if ( n % 2 != 0) {
            res += (long)Math.min(Math.min(q1, h1), s);
        }
        System.out.println(res);

    }
}