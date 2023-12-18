import java.util.*;

import static java.lang.Math.ceil;
import static java.lang.Math.min;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long E = sc.nextLong();

        long minTrans = min(A, min(B, min(C, min(D, E))));
        if (minTrans >= N) {
            System.out.println(5);
            return;
        }

        long bottle = (long) ceil(N / (double)minTrans);
        System.out.println(5 + bottle - 1);
    }
}
