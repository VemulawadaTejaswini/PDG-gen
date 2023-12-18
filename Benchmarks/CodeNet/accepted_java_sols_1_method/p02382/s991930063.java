import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];
        double sum1 = 0.0;
        double sum2 = 0.0;
        double sum3 = 0.0;
        double sum4 = 0.0;
        for (int l=0; l < n; l++) {
            x[l] = sc.nextDouble();
        }
        for (int l=0; l < n; l++) {
            y[l] = sc.nextDouble();
        }
        sc.close();
        for (int l=0; l < n; l++) {
        	sum1 += Math.abs(x[l] - y[l]);
        	sum2 += Math.abs((x[l] - y[l]) * (x[l] - y[l]));
        	sum3 += Math.abs((x[l] - y[l]) * (x[l] - y[l]) * (x[l] - y[l]));
        	sum4 = Math.max(sum4, Math.abs(x[l] - y[l]));
        }
        System.out.println(Math.pow(sum1, 1.0));
        System.out.println(Math.sqrt(sum2));
        System.out.println(Math.cbrt(sum3));
        System.out.println(sum4);
    }
}
