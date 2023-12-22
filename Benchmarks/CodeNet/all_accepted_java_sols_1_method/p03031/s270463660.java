import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] s = new int[M];
            for (int i = 0; i < M; i++) {
                int k = in.nextInt();
                for (int j = 0; j < k; j++) {
                    s[i] |= (1 << (in.nextInt() - 1));
                }
            }
            int[] p = new int[M];
            for (int i = 0; i < M; i++) {
                p[i] = in.nextInt();
            }

            int count = 0;
            for (int mask = 0; mask < (1 << N); mask++) {
                boolean ok = true;
                for (int i = 0; i < M; i++) {
                    int bit = s[i] & mask;
                    if (Integer.bitCount(bit) % 2 == p[i]) {
                    } else {
                        ok = !true;
                    }
                }
                if (ok) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
