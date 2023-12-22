import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int likeAll = ((1 << M) - 1);
            for (int i = 0; i < N; i++) {
                int K = in.nextInt();
                int like = 0;
                for (int j = 0; j < K; j++) {
                    int A = in.nextInt() - 1;
                    like |= (1 << A);
                }
                likeAll &= like;
            }

            System.out.println(Integer.bitCount(likeAll));
        }
    }
}
