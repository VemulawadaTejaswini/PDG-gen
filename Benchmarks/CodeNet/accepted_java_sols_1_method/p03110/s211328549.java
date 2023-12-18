
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double ans = 0;
        double btc = 380000.0;

        for (int i = 0; i < N; i++) {
            double x = sc.nextDouble();
            String u = sc.next();

            if(u.equals("BTC")){
                ans += x * btc;
            } else {
                ans += x;
            }
        }

        out.println(ans);
    }
}
