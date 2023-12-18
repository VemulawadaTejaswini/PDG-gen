import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int n = scan.nextInt();
 
        double[] x = new double[n];
        for(int i = 0; i < n; i++) {
            x[i] = scan.nextDouble();
        }
  
        double[] y = new double[n];
        for(int i = 0; i < n; i++) {
            y[i] = scan.nextDouble();
        }
  
        double p1_sum = 0;
        double p2_sum = 0;
        double p3_sum = 0;
        double p4_max = 0;
        for(int i = 0; i < n; i++) {
            double diff = Math.abs(x[i] - y[i]);
            p1_sum += diff;
            p2_sum += Math.pow(diff, 2);
            p3_sum += Math.pow(diff, 3);
            if(diff > p4_max) {
                p4_max = diff;
            }
        }
  
        System.out.println(p1_sum);
        System.out.println(Math.sqrt(p2_sum));
        System.out.println(Math.cbrt(p3_sum));
        System.out.println(p4_max);
    }
}
