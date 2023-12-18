import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = 0;
        while(k==0){
            double sum = 0;
            double a2 = 0;
            double[] s;
            s = new double[1000];
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
           for(int i=0; i<n; ++i)
           {
               s[i] = sc.nextDouble();
           }
           for(int i=0; i<n; ++i){
               sum += s[i];
           }
           double average = sum/(double)n;
            for(int i =0; i<n; ++i){
                a2 += (s[i] - average)*(s[i] - average);
            }
            a2 = a2/(double)n;
            double a = Math.sqrt(a2);
            System.out.printf("%f\n", a);

        }
    }

}