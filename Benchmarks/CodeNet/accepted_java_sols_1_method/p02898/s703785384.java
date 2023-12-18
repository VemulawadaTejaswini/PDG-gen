import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] h = new int[N];
            for (int i = 0; i < N; i++) {
                h[i] = in.nextInt();
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                if (h[i] >= K) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
