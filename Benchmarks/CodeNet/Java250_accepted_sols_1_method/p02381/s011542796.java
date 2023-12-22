import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int s[] = new int[n];
            int sum = 0;
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
                sum = sum+s[i];
            }
            double ave = (double)sum/n;
            double a2 = 0;
            for(int i=0;i<n;i++){
                a2 = a2+(s[i]-ave)*(s[i]-ave);
            }
            a2 = a2/n;
            double a = Math.pow(a2, 0.5);
            System.out.println(a);
        }
        sc.close();
    }
}
