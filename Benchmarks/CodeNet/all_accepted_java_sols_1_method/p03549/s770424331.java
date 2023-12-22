import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();

            int NminusM = N - M;

            int timePer1submission = 1900 * M + 100 * NminusM;
            int bunbo = 1 << M;

            double sum = timePer1submission;
            for (double probability = (1.0 - 1.0 / bunbo); probability >= 1e-99; probability *= (1.0 - 1.0 / bunbo)) {
                sum += timePer1submission * probability;
            }

            System.out.println("" + ((int) (sum + 1e-9)));
        }
    }
}
