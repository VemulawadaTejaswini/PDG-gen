import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int scores[];
        while (true) {
            n = sc.nextInt();
            if (n == 0)
                break;
            scores = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
                sum += scores[i];
            }
            double average = 0, a = 0, variance = 0;
            average = (double) sum / n;
            for (int i = 0; i < n; i++) {
                 a += ((double) scores[i] - average) * ((double) scores[i] - average);
            }
            variance = a / n;
            System.out.printf("%.8f\n", Math.sqrt(variance));
        }
    }
}
