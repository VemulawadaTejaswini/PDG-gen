import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] a = new double[n];
        double res = 1;
        double tmp = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
            res *= a[i];
        }
        for (int i = 0; i < n; i++) {
            tmp += res / a[i];
        }

        System.out.println(res / tmp);
    }
}

