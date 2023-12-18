import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        double d = 0.0;
        
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            y[i] = sc.nextInt();
        }
        
        //p=1
        for(int i = 0; i < n; i++){
            d += Math.abs((double)x[i] - (double)y[i]);
        }
        System.out.println(d);
        
        //p=2
        d = 0.0;
        for(int i = 0; i < n; i++){
            d += Math.pow(Math.abs((double)x[i] - (double)y[i]), 2);
        }
        System.out.println(Math.sqrt(d));
        
        //p=3
        d = 0.0;
        for(int i = 0; i < n; i++){
            d += Math.pow(Math.abs((double)x[i] - (double)y[i]), 3);
        }
        System.out.println(Math.cbrt(d));
        
        //p=∞
        d = 0.0;
        for(int i = 0; i < n; i++){
            d = Math.max(d,Math.abs((double)x[i] - (double)y[i]));
        }
        System.out.println(d);
    }
}
