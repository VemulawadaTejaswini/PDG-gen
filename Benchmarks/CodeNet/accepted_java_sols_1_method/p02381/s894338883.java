import java.util.Scanner;

/**
 * StandardDeviation
 */
public class Main{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                if (n == 0) {
                    break;
                }

                int[] scores = new int[n];
                int sum = 0;
                double average = 0, variance = 0, sum_a = 0;

                for (int i = 0; i < scores.length; i++) {
                    scores[i] = sc.nextInt();
                    sum += scores[i];
                }
                average = (double) sum / scores.length;
                for (int i = 0; i < scores.length; i++) {
                    sum_a += (scores[i] - average) * (scores[i] - average);
                }
                variance = (double) sum_a / scores.length;

                System.out.println(Math.sqrt(variance));
            }
        }
    }
}
