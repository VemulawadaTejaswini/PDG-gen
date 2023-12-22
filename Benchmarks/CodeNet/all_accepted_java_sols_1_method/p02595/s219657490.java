import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();
        double[] x = new double[n];
        double[] y = new double[n];
        int ans = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
            double xx = x[i] * x[i];
            double yy = y[i] * y[i];
            double tmp = Math.sqrt(xx + yy) ;
            if(d >= tmp) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}