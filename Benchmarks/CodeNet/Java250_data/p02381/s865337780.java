import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            double[] s = new double[n];
            for (int i = 0; i < s.length; i++) {
                s[i] = sc.nextDouble();
            }
            System.out.printf("%.8f\n",Math.sqrt(variance(s)));
        }
        sc.close();
    }

    public static double sum(double[] s) {
        double sum = 0.0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i];
        }
        return sum;
    }

    public static double average(double[] s) {
        return sum(s) / (double)s.length;
    }

    public static double variance(double[] s) {
        double sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += (s[i] - average(s)) * (s[i] - average(s));
        }
        return sum / (double)s.length;
    }
}
