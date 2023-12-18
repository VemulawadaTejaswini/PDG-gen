import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n, sum = 0;
        double ave, aveSum = 0;
        int score[];
        score = new int[1000];
        Scanner sc = new Scanner(System.in);

        while ((n = sc.nextInt()) != 0) {
            for (int i = 0; i < n; i++) {
                score[i] = sc.nextInt();
                sum += score[i];
            }
            ave = (double) sum / n;
            for (int i = 0; i < n; i++) {
                aveSum += (score[i] - ave) * (score[i] - ave);
            }
            System.out.printf("%f\n", sqrt(aveSum / n));
            sum = 0;
            aveSum = 0;
        }
    }
}