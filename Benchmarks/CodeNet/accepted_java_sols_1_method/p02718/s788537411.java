import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m = sc.nextDouble();
        double[] a = new double[n];
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        double ans = 0.0;
        double tmp = sum / (m * 4.0);
        for (int i = 0; i < n; i++) {
            if(a[i] >= tmp) ans++;
        }
        if(ans >= m) System.out.println("Yes");
        else System.out.println("No");
    }
}