import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double sum = 0;
        int n;
        double s = 0;
        double sum1 = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                n = sc.nextInt();
                if (n == 0) {
                    break;
                }
                int[] scores = new int[n];
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = sc.nextInt();
                    sum = sum + (double)scores[i];
                }

                double average = 0, variance = 0;
                average = sum / (double)n;

                for (int j = 0; j < scores.length; j++) {
                    sum1 = ((double)scores[j] - average) * ((double)scores[j] - average);
                    s = s + sum1;
                    variance = s / n;
                }

                System.out.println(Math.sqrt(variance));
                sum=0;
                s=0;
            }
        }
    }
}

