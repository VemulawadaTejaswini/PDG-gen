
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                int sum = 0;
                if (n == 0) { break; }
                int[] scores = new int[n];
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = sc.nextInt();
                }
                double average = 0, variance = 0, y = 0;
                for (int i = 0; i < scores.length; i++) {
                    sum = sum + scores[i];
                }
                average = (double)sum / n;
                for (int i = 0; i < scores.length; i++) {
                    double x = Math.pow((scores[i] - average), 2);
                    y = x + y;
                }
                variance = y / n;
                System.out.println(Math.sqrt(variance));
            }
        }
    }
}

