import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        double[] x = new double[n];
        for(int i=0; i<n; i++){
            x[i] = sc.nextDouble();
        }
        double[] y = new double[n];
        for(int i=0; i<n; i++){
            y[i] = sc.nextDouble();
        }
        
        //p=1
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += Math.abs(x[i] - y[i]);
        }
        System.out.println(sum);
        
        //p=2
        sum = 0.0;
        for(int i=0; i<n; i++){
            sum += Math.pow(Math.abs(x[i] - y[i]),2);
        }
        sum = Math.sqrt(sum);
        System.out.println(sum);
        
        //p=3
        sum = 0.0;
        for(int i=0; i<n; i++){
            sum += Math.pow(Math.abs(x[i] - y[i]),3);
        }
        sum = Math.cbrt(sum);
        System.out.println(sum);
        
        //p=無限
        sum=0.0;
        for(int i=0; i<n; i++){
            sum = Math.max(sum,Math.abs(x[i] - y[i]));
        }
        System.out.println(sum);
    }

}

