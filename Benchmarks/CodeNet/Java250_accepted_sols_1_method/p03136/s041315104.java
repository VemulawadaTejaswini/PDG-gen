import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int large=0;
        int sum=0;
        while(n-->0)
        {
            int a=sc.nextInt();
            sum+=a;
            if(a>large)
                large=a;
        }
        sum-=large;
        if(large<sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}