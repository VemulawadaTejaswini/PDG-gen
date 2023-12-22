import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            scores = new int[n];
            int sum = 0;
            for (int i = 0; i < scores.length; i++) {
                scores[i] = sc.nextInt();
                sum += scores[i];
            }
            double average = 0, variance = 0;
            average = (double) sum / scores.length;
            for (int i = 0; i < scores.length; i++) {
                variance += (scores[i] - average) * (scores[i] - average);
            }
            variance = variance / n;
            System.out.println(Math.sqrt(variance));
 
        }
    }
}