import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                y[i] = scan.nextInt();
            }
            double dis1 = 0,dis2 = 0, dis3 = 0, ans = Math.abs(x[0] - y[0]);
            int dt;
            for (int i = 0; i < n; i++) {
                dt = Math.abs(x[i] - y[i]);
                dis1 += dt;
                dis2 += Math.pow(dt, 2);
                dis3 += Math.pow(dt, 3);
                if (ans < dt)ans = dt;
            }
            DecimalFormat f = new DecimalFormat("0.000000");
            System.out.println( f.format(dis1) + "\n" + f.format(Math.sqrt(dis2))+ "\n" + f.format(Math.cbrt(dis3))+ "\n" + f.format(ans));
             
         
    }
 
}  

