import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            long[] H = new long[N];
            for (int i = 0; i < N; i++) {
                H[i] = sc.nextLong();
            }

            Arrays.sort(H);

            long ans = 0;

            for (int i = 0; i < N - K; i++) {
                ans += H[i];
            }

            System.out.println(ans);
        }
    }

}
