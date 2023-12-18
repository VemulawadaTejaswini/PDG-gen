import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            if (n == 0)
                break;

            List<Integer> scores = new ArrayList<Integer>();
            for (int i = 0; i < n; i++)
                scores.add(scan.nextInt());

            double average = 0;
            for (int score : scores) {
                average += score;
            }
            average /= scores.size();

            double variance = 0.0;
            for (int score : scores) {
                variance += Math.pow(score - average, 2);
            }
            variance /= scores.size();

            double standardDeviation = Math.sqrt(variance);
            System.out.println(standardDeviation);
        }
    }
}