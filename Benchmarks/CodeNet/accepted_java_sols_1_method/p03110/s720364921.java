import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> A = new ArrayList<Double>();
        ArrayList<Double> B = new ArrayList<Double>();
        int N = sc.nextInt();
        // int D = sc.nextInt();
        double ans = 0;
        for (int i = 0; i < N; i++) {
            ans += sc.nextDouble() * (sc.next().equals("JPY") ? 1.0 : 380000.0);
        }
        System.out.println(ans);
    }
}