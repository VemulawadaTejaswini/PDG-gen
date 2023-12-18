import java.util.Scanner;

public class Main{
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

            int sum = 0;
            double average = 0, variance = 0;

            for (int i = 0; i < scores.length; i++) {
                sum = sum + scores[i];
            }
            average = (double)sum/scores.length;

            double hensa=0;
            for (int i = 0; i < scores.length; i++) {
                hensa = hensa + (scores[i] - average)*(scores[i] - average);
            }

            variance = hensa/scores.length;
            // … 平均値averageと，分散varianceを計算しよう …
            System.out.println(Math.sqrt(variance));
            }
            }
        
    }
}
