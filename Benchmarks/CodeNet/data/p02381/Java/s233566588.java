import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            int s[] = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = scanner.nextInt();
            }
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += s[i];
            }
            double mean = sum / n;
            double var = 0;
            for (int i = 0; i < n; i++) {
                var += Math.pow((s[i] - mean), 2);
            }
            var = var / n;
            double stddev = Math.sqrt(var);
            System.out.printf("%.8f\n", stddev);
        }
        scanner.close();
    }
}

