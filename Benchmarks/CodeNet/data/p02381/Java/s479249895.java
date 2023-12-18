import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        int n;
        double sum = 0.0, m, v, t = 0.0;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            n = sc.nextInt();
            if(n == 0) break;
            double A[] = new double[n];
            for(int i =0; i<A.length; i++){
                A[i] = (double)sc.nextInt();
                sum += A[i];
            }
            m = sum / (double)A.length;
            for(int i = 0; i<A.length; i++){
                t += (A[i] - m) * (A[i] - m);
            }
            v = t / (double)A.length;
            System.out.println(Math.sqrt(v));
            sum = 0.0;
            t = 0.0;
        }
    }
}
