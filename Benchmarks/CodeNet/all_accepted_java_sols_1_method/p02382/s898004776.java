import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            y[i] = sc.nextInt();
        }
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double max = 0;
        for(int i = 0; i < n; i++){
            double diff = x[i] - y[i];
            if(diff < 0){
                diff *= -1;
            }
            p1 += diff;
            p2 += diff * diff;
            p3 += diff * diff * diff;
            if(max < diff){
                max = diff;
            }
        }
        System.out.println(p1);
        System.out.println(Math.sqrt(p2));
        System.out.println(Math.cbrt(p3));
        System.out.println(max);
    }
}
