import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            long l = 0;
            for (int i = 2; i < N; i++) {
                l ^= A[i];
            }

            long solution = 0;
            int score = Long.bitCount((A[0] - solution) ^ (A[1] + solution) ^ l);

            long bestSolution = A[0];
            int bestScore = 100;

            for (int it = 0; it < 2e7; ++it) {
                double temperature = 1.0 / (it + 1);

                int shift = it % 63;
                long bit = 1L << shift;

                solution ^= bit;

                if (solution >= A[0]) {
                    solution ^= bit;
                    continue;
                }

                int deltaScore = Long.bitCount((A[0] - solution) ^ (A[1] + solution) ^ l) - score;
                if (Math.random() < Math.exp(-deltaScore * temperature)) {
                    score += deltaScore;
                    if (score < bestScore || (score == bestScore && solution < bestSolution)) {
                        bestScore = score;
                        bestSolution = solution;
                    }
                } else {
                    solution ^= bit;
                }
            }

            if (bestScore > 0) {
                System.out.println(-1);
            } else {
                System.out.println(bestSolution);
            }
        }
    }
}
