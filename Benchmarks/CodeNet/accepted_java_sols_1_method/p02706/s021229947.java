import java.lang.*;
import java.util.*;
public class Main 
{
    ///atcoder
    public static void main(final String args[]) 
    {
        final Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a,sum=0;
        for(int i=0;i<m;i++)
        {
            a=s.nextInt();
            sum=sum+a;
        }
        if(sum<=n)
        {
            System.out.println(n-sum);
        }
        else
        {
            System.out.println("-1");
        }
    }
}