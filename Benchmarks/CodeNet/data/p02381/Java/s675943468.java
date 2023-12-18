import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int[]s = new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
                sum += s[i];
            }
            double x=0;
            for(int i=0;i<n;i++){
                x += (s[i]-((double)sum/n))*(s[i]-((double)sum/n));
            }
            double a=Math.sqrt(x/n);
            System.out.printf("%.8f\n",a);
        }
    }

}
