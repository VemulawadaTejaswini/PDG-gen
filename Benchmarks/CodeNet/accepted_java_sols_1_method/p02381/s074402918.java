import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0.0;

        while (true) {
            int n = scan.nextInt();
            int sum = 0;
            int[] students = new int[n];
            if (n == 0) break;

            for (int i = 0; i < n; i++) {
                int s = scan.nextInt();
                students[i] = s;
                sum += s;
            }
            double m = (double)sum / n;
            double sum2 = 0.0;
            for (int i = 0; i < n; i++) {
                sum2 += Math.pow(students[i] - m, 2);
            }
            a = Math.sqrt(sum2 / n);
            System.out.println(a);
        }
    }
}