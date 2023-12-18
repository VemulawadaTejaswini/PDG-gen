import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }

        int minSum = 1000000000;
        int sum = 0;

        for (int P = 0; P <= 100; P++) {
            for (int i = 0; i < N; i++) {
                sum += Math.pow(X[i] - (P + 1), 2);
            }
            minSum = Math.min(minSum, sum);
            sum = 0;
        }

        System.out.println(minSum);

    }
}
