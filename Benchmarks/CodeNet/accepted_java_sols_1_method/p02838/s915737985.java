import java.util.*;

class Main {
    public static void main(String[] args) {
        final long MOD = 1_000_000_007L;
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        int B[] = new int[60];
        for (int i = 0; i < N; i++) {
            long A = Long.parseLong(sc.next());
            for (int j = 0; j < 60; j++) {
                B[j] += (int) (A % 2);
                A /= 2;
                if (A == 0)
                    break;
            }
        }
        sc.close();

        long sum = 0L;
        for (int j = 0; j < 60; j++) {
            sum += (long) B[j] * (N - B[j]) * Math.pow((double) 2, (double) j) % MOD;
            sum %= MOD;
        }
        System.out.println(sum);
    }
}