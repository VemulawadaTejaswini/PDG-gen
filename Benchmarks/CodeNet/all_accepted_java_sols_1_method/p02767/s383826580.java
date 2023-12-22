import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
            sum+=a[i];
        }
        int p = sum/n;
        int ans1=0;
        int ans2=0;
        for(int i=0; i<n; i++)
        {
            ans1+=Math.pow((a[i]-p),2);
            ans2+=Math.pow((a[i]-p-1),2);
        }
        if(ans1<ans2)
        System.out.println(ans1);
        else System.out.println(ans2);
    }
}