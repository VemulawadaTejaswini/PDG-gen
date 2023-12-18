import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            long mod = (long) (1e9 + 7);

            long countAll = 1;
            for (int i = 0; i < N; i++) {
                countAll *= 10;
                countAll %= mod;
            }

            long count9 = 1;
            for (int i = 0; i < N; i++) {
                count9 *= 9;
                count9 %= mod;
            }

            long count8 = 1;
            for (int i = 0; i < N; i++) {
                count8 *= 8;
                count8 %= mod;
            }

            long res = countAll;
            res += -count9 + mod;
            res %= mod;
            res += -count9 + mod;
            res %= mod;
            res += count8;
            res %= mod;

            System.out.println(res);
        }
    }
}
