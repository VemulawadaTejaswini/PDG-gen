import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            double[] s = new double[n];
            double total = 0;
            for(int i = 0; i < n;i++){
                s[i] = sc.nextDouble();
                total += s[i];
            }
            double m = total/n;
            double a = 0;
            for(int i = 0; i < n; i++){
                a += Math.pow(s[i]-m,2);
            }
            a /= n;
            System.out.printf("%.5f",Math.sqrt(a));
            System.out.println("");
        }
    }
}
