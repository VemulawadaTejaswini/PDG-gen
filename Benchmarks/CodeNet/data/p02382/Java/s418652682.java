import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        double[] x = new double[n];
        for(int i = 0; i < n; i++){
            x[i] = scan.nextDouble();
        }
        double[] y = new double[n];
        for(int i = 0; i < n; i++){
            y[i] = scan.nextDouble();
        }
        double d1 = 0, d2 = 0, d3 = 0;
        double max = 0;
        for(int i = 0; i < n; i++){
            if(x[i] - y[i] <= 0){
                d1 += (x[i] - y[i]) * -1;
                d3 += ((x[i] - y[i]) * (x[i] - y[i]) * (x[i] - y[i])) * -1;
            }else{
                d1 += x[i] - y[i];
                d3 += (x[i] - y[i]) * (x[i] - y[i]) * (x[i] - y[i]);
            }
            d2 += (x[i] - y[i]) * (x[i] - y[i]);
            if(max < x[i] - y[i]){
                max = x[i] - y [i];
            }
        }
        d2 = Math.sqrt(d2);
        d3 = Math.cbrt(d3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(max);
    }
}