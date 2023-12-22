import java.util.Scanner;
public class Main{
    public static void main(String[] agrs){
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                int n = sc.nextInt();
                if(n == 0)
                    break;
                int num[] = new int[n];
                int count = 0;
                for(int i = 0 ; i < n ; i++)
                    num[i] = sc.nextInt();
                int sum = 0;
                double ave = 0;
                for(int i = 0 ; i < n ; i++)
                    sum += num[i];
                ave = (double)sum / n;
                for(int i = 0 ;i < n ; i++)
                    if(num[i] <= ave)
                        count++;
                System.out.println(count);
            }
    }
}
