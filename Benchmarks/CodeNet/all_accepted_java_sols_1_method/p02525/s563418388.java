import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sum = 0;
            double ave = 0.0, var = 0.0;
            int n = sc.nextInt();
            if (n == 0) break;
            int[] scores = new int[n];
            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
                sum += scores[i];
            }
            ave = (double)sum / n;
            for (int i = 0; i < n; i++) {
                var += Math.pow(Math.abs(scores[i] - ave), 2);
            }
            var /= n;
            System.out.printf("%.8f\n", Math.sqrt(var));
        }
    }
}