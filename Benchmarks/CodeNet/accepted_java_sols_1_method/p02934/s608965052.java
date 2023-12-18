import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            BigDecimal n = new BigDecimal(1);
            BigDecimal d = new BigDecimal(0);

            for (int i = 0; i < N; i++) {
                n = n.multiply(new BigDecimal(A[i]));
            }

            for (int i = 0; i < N; i++) {
                d = d.add(n.divide(new BigDecimal(A[i])));
            }

            BigDecimal ans = n.divide(d, 20, BigDecimal.ROUND_HALF_DOWN);
            System.out.println(ans);
        }
    }

}
