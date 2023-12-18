import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = 998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long a = sc.nextLong();
        double b = sc.nextDouble();
        long lb = Math.round(b*100);

        System.out.println(a*lb/100);
    }
}
