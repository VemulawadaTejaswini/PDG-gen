import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = sc.nextInt();
            }

            int ans = Integer.MAX_VALUE;
            for (int p = 1; p <= 100; p++) {
                int sum = 0;
                for (int i = 0; i < N; i++) {
                    sum += (X[i] - p) * (X[i] - p);
                }

                if (sum < ans) {
                    ans = sum;
                }
            }

            System.out.println(ans);
        }
    }

}
