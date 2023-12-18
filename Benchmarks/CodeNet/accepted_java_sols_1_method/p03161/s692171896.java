import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] =new int[n];
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            res[i]=Integer.MAX_VALUE;
        }
        res[0]=0;
        for(int i=1;i<n;i++)
        {
            for(int j=i-k;j<i;j++)
            {
                if(j>=0) 
                res[i]=Math.min(Math.abs(arr[i]-arr[j])+res[j],res[i]);
            }
        }
        System.out.println(res[n-1]);
    }
}