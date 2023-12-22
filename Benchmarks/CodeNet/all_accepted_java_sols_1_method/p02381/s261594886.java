import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        for(;;){
            int n = scan.nextInt();
            double sum = 0;
            double m = 0;
            if(n == 0)break;
            double[] s = new double[n];
            for(int i = 0; i < n; i++){
                s[i] = scan.nextDouble();
                sum += s[i];
            }
            m = (double)sum / n;
            double a = 0;
            for(int i = 0; i < n; i++){
                a += (s[i] - m) * (s[i] - m);
            }
            double ans = Math.sqrt(a / n);
            if(ans >= 0){
                System.out.println(ans);
            }
        }

    }
}