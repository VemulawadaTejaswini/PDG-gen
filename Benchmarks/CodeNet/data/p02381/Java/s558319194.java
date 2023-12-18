import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            int sum = 0;
            double a2 = 0;
            double a = 0;
            if(n == 0)
                break;
            int num[] = new int[n];
            for(int  i = 0 ; i < n ; i++)
            {
                num[i] = sc.nextInt();
                sum += num[i];
            }
            double ave = (double)sum / n;
            for(int i = 0 ; i < n ; i++)
                a2 += Math.pow(num[i] - ave,2);
            a2 /= (double)n;
            a = Math.pow(a2,0.5);
            System.out.println(a);
        }
    }
}
