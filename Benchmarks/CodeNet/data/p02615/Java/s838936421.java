import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = s.nextLong();
        }

        Arrays.sort(A);
        long n  = 0;
        for (int i = 1; i < N; i++) {
            n += A[i];
        }

        System.out.println(n);
    }
}