import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] c = new int[100000];
        for(int i=1;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                for(int k=0;k<=9;k++)
                {
                    c[i*10000+j*1000+k*100+j*10+i]=1;
                }
            }
        }
        int ans = 0;
        for(int i=a;i<=b;i++)
        {
            ans += c[i];
        }
        System.out.println(ans);
    }    
}