import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double num = Math.abs(30 * h - 5.5 * m);

        double cos = Math.cos(Math.toRadians(num));

        double ans = b * b + a * a - 2 * a * b * cos;

        System.out.println(Math.sqrt(ans));

        sc.close();
    }

}
