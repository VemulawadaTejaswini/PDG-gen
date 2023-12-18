import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int N = Integer.parseInt(sc.next());
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(sc.next());
            }

            // calc
            long sum = 0;
            for (int i = 1; i < N; i++) {
                long sub = A[i-1] - A[i];
                if (sub > 0) {
                    A[i] += sub;
                    sum += sub;
                }
            }
            System.out.println(sum);
        }
    }
}