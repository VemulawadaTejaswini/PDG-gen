import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            y[i] = sc.nextInt();
        }
        int d1 = 0;
        double d2 = 0;
        double d3 = 0;
        int d_inf = 0;
        for(int i=0; i<n; i++){
            d1 += Math.abs(x[i]-y[i]);
            d2 += Math.pow(x[i]-y[i], 2);
            d3 += Math.abs(Math.pow(x[i]-y[i], 3));
            if(Math.abs(x[i]-y[i]) >= d_inf) d_inf = Math.abs(x[i]-y[i]);
        }
        d2 = Math.sqrt(d2);
        d3 = Math.cbrt(d3);
        System.out.println(d1);  
        System.out.println(d2);  
        System.out.println(d3);  
        System.out.println(d_inf);  
    }
}
