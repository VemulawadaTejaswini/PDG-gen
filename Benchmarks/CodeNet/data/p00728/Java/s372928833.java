import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int scoreCount = sc.nextInt();
            if (scoreCount == 0) {
                break;
            }

            int[] scores = new int[scoreCount];
            for (int i = 0; i < scores.length; i++) {
                scores[i] = sc.nextInt();
            }

            Arrays.sort(scores);

            int sum = 0;
            for (int i = 1; i < scores.length - 1; i++) {
                sum += scores[i];
            }
            int ave = sum / (scores.length - 2);

            System.out.println(ave);
        }

        sc.close();
    }
}
