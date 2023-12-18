import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextDouble();
        }
        
        double d1 = 0, d2 = 0, d3 = 0, di = 0;
        for (int i = 0; i < n; i++) {
            double k = Math.abs(x[i] - y[i]);
            d1 += k;
            d2 += Math.pow(k, 2);
            d3 += Math.pow(k, 3);
            if (di < k) di = k;
        }
        
        d2 = Math.sqrt(d2);
        d3 = Math.pow(d3, 1.0 / 3.0);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(di);
    }
}
