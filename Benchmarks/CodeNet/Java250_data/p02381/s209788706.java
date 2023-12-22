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
                    double average = 0, variance = 0;

                    double sum1 = 0, sum2 = 0;
                    for (int i = 0; i < scores.length; i++) {
                        sum1 += scores[i];
                    }
                    average = sum1 / scores.length;
                    for (int i = 0; i < scores.length; i++) {
                        sum2 += Math.pow(scores[i] - average, 2);
                    }
                    variance = sum2 / scores.length;
                    System.out.println(Math.sqrt(variance));
                }
            }
        }
    }
 

