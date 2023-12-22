import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] W = new int[N];
            for (int i = 0; i < N; i++) {
                W[i] = in.nextInt();
            }

            int min = (int) 1e9;
            for (int T = 0; T < N; T++) {
                int s1 = 0;
                for (int i = 0; i < T; i++) {
                    s1 += W[i];
                }
                int s2 = 0;
                for (int i = T; i < N; i++) {
                    s2 += W[i];
                }
                min = Math.min(min, Math.abs(s1 - s2));
            }

            System.out.println(min);
        }
    }
}
