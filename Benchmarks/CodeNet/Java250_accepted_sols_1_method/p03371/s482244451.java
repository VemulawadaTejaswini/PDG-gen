import java.util.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int x = cin.nextInt();
        int y = cin.nextInt();
        int ans = 1000000000;
        for (int i = 0; i <= 2 * 100000; i += 2) {
            int nowx = x - i / 2;
            int nowy = y - i / 2;
            int cost = c * i;
            if (nowx > 0) cost += a * nowx;
            if (nowy > 0) cost += b * nowy;
            ans = Math.min(ans, cost);
        }
        out.println(ans);
    }
}
