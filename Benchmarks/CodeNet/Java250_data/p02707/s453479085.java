import java.lang.*;
import java.util.*;
public class Main 
{
    ///atcoder
    public static void main(final String args[]) 
    {
        final Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            a[i]=0;
        }
        int k;
        for(int i=0;i<n-1;i++)
        {
            k=s.nextInt();
            a[k]++;
        }
        for(int i=1;i<n+1;i++)
        {
            System.out.println(a[i]);
        }
    }
}