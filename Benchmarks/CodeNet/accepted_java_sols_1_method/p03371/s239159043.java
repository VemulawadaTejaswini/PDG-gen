import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int cost = Integer.MAX_VALUE;
        int n = Math.max(x, y);
        for (int i = 0; i <= n; ++i) {
            int X = x - i;
            int Y = y - i;
            if (x - i <= 0) X = 0;
            if (y - i <= 0) Y = 0;
            int tmp = (c * 2) * i + a * X + b * Y;
            cost = Math.min(tmp, cost);
        }
        System.out.println(cost);
    }
}