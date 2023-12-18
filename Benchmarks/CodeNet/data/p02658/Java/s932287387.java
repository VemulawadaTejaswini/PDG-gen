import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[] A = new long[N];
        BigInteger prod = BigInteger.valueOf(1);
        BigInteger l = BigInteger.valueOf(1000000000);
        l = l.multiply(BigInteger.valueOf(1000000000));
        boolean b = true;
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(s.next());
            prod = prod.multiply(BigInteger.valueOf(A[i]));
            if (l.compareTo(prod) < 0) b = false;
        }
        if (!b) System.out.print(-1);
        else System.out.print(prod);
    }
}