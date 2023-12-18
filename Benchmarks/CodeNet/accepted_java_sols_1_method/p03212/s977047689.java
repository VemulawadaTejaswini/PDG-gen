import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i < 300_000; i++) {
            boolean[] check = new boolean[4];
            int m = i;
            int d = 1;
            int num = 0;
            while (m > 0) {
                int r = m % 4;
                check[r] = true;
                if (r != 0) num += (2 * r + 1) * d;
                m /= 4;
                d *= 10;
            }
            if (!check[0] && check[1] && check[2] && check[3] && num <= n) ans++;
        }
        System.out.println(ans);
    }
}