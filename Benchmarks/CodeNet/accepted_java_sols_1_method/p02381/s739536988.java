import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0)    break;
            double a;
            double[] s = new double[n];
            int sum=0;
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
                sum += s[i];
            }
            double m = (double)sum / n;
            double V=0;
            for(int i=0;i<n;i++){
                V += Math.pow((s[i] - m),2) / n;
            }

            System.out.println(Math.sqrt(V));
        }
    }
}
