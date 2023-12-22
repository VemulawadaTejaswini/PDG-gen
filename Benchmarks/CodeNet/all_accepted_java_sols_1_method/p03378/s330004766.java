import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int X = in.nextInt();
            int[] A = new int[M];
            for (int i = 0; i < M; i++) {
                A[i] = in.nextInt();
            }

            int[] costs = new int[N + 1];
            for (int i = 0; i < M; i++) {
                costs[A[i]]++;
            }

            int min = (int) 1e9;
            {
                int cost = 0;
                for (int x = X; x <= N; x++) {
                    cost += costs[x];
                }
                min = Math.min(min, cost);
            }
            {
                int cost = 0;
                for (int x = X; x >= 0; x--) {
                    cost += costs[x];
                }
                min = Math.min(min, cost);
            }

            System.out.println(min);
        }
    }
}
