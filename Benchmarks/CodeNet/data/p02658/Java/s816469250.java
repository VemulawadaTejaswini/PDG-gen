import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] A = new long[N];
        for (int i = 0; i < N ;i++) {
            A[i] = sc.nextLong();
            if (A[i] == 0) {
                System.out.println(0);
                return;
            }
        }

        BigInteger ans = BigInteger.ONE;
        for (int i = 0; i < N ;i++) {
            ans = ans.multiply(BigInteger.valueOf(A[i]));
            if (BigInteger.valueOf(1000000000000000000L).compareTo(ans) == -1) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(ans);
    }
}