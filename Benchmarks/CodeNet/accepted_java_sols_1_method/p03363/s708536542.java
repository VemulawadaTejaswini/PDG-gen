import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            long[] cumsum = new long[N + 1];
            HashMap<Long, Integer> invCumsum = new HashMap<>();
            invCumsum.put(0L, 1);
            long count = 0;
            for (int i = 0; i < N; i++) {
                cumsum[i + 1] = A[i] + cumsum[i];
                Integer count3 = invCumsum.get(cumsum[i + 1]);
                int count2 = count3 == null ? 0 : count3.intValue();
                count += count2;
                invCumsum.put(cumsum[i + 1], 1 + count2);
            }
            System.out.println(count);
        }
    }
}
