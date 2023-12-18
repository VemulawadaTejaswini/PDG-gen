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
        ArrayList<Integer> A = new ArrayList<Integer>();
        int N = sc.nextInt();
        int D = sc.nextInt();
        long ans = 1;
        for (int i = D; i < N; i += D * 2 + 1) {
            if (i + D + 1 < N)
                ans++;
        }
        System.out.println(ans);
    }
}