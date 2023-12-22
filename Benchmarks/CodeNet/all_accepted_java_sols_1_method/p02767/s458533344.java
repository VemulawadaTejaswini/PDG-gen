import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        if(sum%n==0)
        {
            int st=0;
            for(int i=0;i<n;i++)
            {
                st+=(int)Math.pow(arr[i]-sum/n,2);
            }
            System.out.println(st);
        }
        else
        {
            int av1=sum/n;
            int av2=sum/n+1;
            int st1=0,st2=0;
            for(int i=0;i<n;i++)
            {
                st1+=(int)Math.pow(arr[i]-av1,2);
                st2+=(int)Math.pow(arr[i]-av2,2);
            }
            System.out.println((int)Math.min(st1,st2));
        }
    }
}