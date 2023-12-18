import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int score = 0;
        double sum = 0.0;
        double average = 0.0;
        double variance = 0.0;
        double stddev = 0.0;

        while (true) {
            n = scanner.nextInt();
            if ( n == 0) {
                break;
            }
            sum = 0.0;
            variance = 0.0;

            int[] scores = new int[n];
            
            for (int i = 0; i < n; i++) {
                scores[i] = scanner.nextInt();
                sum += scores[i];
            }
            average = sum / n;

            variance = 0;
            for (int i = 0; i < n; i++) {
                variance += Math.pow(scores[i]-average, 2);
            }
            variance /= n;
            stddev = Math.sqrt(variance);

            System.out.println(stddev);
        }
    }
}