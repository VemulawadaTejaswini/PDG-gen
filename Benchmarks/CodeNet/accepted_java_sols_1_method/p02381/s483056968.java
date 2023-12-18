import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            double[] student = new double[n];
            double sum = 0, m = 0;
            if (n == 0) {
                break;
            }
            for (int i = 0; i < n; i++) {
                double s = sc.nextDouble();
                student[i] = s;
                sum += s;
            }
            m = sum / n;

            double sum2 = 0;
            for (int i = 0; i < n; i++) {
                student[i] = (student[i] - m) * (student[i] - m);
                sum2 += student[i];
            }

            double a = Math.sqrt(sum2 / n);
            System.out.println(a);
        }
    }
}
