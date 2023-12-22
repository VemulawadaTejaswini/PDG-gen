import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                if (n == 0) {
                    break;
                }
                int[] scores = new int[n];
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = sc.nextInt();
                }
                double average, variance;

                double sum = 0;
                for (int i = 0; i < scores.length; i++) {
                    sum += scores[i];
                }
                average = sum / n;

                double sum_variance = 0;
                double a = 0;
                for (int i = 0; i < scores.length; i++) {
                    a = (scores[i] - average) * (scores[i] - average);
                    sum_variance += a;
                }
                variance = sum_variance / n;
                System.out.println(Math.sqrt(variance));

            }
        }
    }
}
