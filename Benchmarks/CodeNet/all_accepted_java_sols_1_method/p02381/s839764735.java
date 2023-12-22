import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            if (n == 0) break;

            double sum = 0, sumX = 0, m;
            double[] s = new double[n];

            for (int i = 0; i < n; i++) {
                s[i] = scan.nextDouble();
                sum += s[i];
            }

            m = sum / n;

            for (int i = 0; i < n; i++) {
                sumX += Math.pow((s[i] - m), 2) / n;
            }
            System.out.println(Math.sqrt(sumX));
        }
    }
}