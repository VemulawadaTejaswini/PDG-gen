
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // main
        Scanner sc = new Scanner(System.in);
        int N = nextInt(sc);
        int K = nextInt(sc);

        show(calc(N, K));
    }

    private static double calc(int N, int K) {
        double answer = 0;

        for (int i = 1; i <= N; i++) {
            double prob = 1d / N;
            int now = i;

            while (now < K) {
                now = now * 2;
                prob = prob * 0.5;
            }
            answer = answer + prob;
        }

        return answer;
    }

    private static void show(double answer) {
        System.out.println(answer);
    }

    private static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
}
