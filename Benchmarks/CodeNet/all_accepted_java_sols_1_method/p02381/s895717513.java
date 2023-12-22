import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        while(true) {
            int n = stdIn.nextInt();
            if(n == 0) break;
            int[] scores = new int[n];
            double ave_sum = 0;
            
            for(int i = 0; i < scores.length; i++) {
                scores[i] = stdIn.nextInt();
                ave_sum += scores[i];
            }
            double average = ave_sum / scores.length;
            double variance = 0;

            for(int i = 0; i < scores.length; i++) {
                variance += ((scores[i] - average) * (scores[i] - average)) / scores.length;
            }

            System.out.println(Math.sqrt(variance));
        }
    }
}

