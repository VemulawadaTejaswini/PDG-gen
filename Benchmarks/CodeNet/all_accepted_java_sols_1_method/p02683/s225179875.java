import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        int x=Integer.parseInt(str[2]);
        int arr[][]=new int[n][m+1];
        for(int i=0;i<n;i++)
        {
            str=br.readLine().split(" ");
            for(int j=0;j<=m;j++)
            arr[i][j]=Integer.parseInt(str[j]);
        }
        boolean b=true;
        for(int i=1;i<=m;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=arr[j][i];
            }
            if(sum<x)
            {
                b=false;
                break;
            }
        }
        if(b)
        {
            /*Arrays.sort(arr,new comp());
            int sum[]=new int[m];
            for(int i=1;i<=m;i++)
            {
                for(int j=0;j<n;j++)
                sum[i-1]+=arr[j][i];
            }
            int minind=0,minsum=sum[0];
            for(int i=1;i<m;i++)
            {
                if(minsum<sum[i])
                {
                    minind=i;
                    minsum=sum[i];
                }
            }
            boolean arr[]=new boolean[n];
            for(int i=n-1;i>=0;i--)
            {
                
            }*/
            int min=(int)(1e9);
            for(int i=0;i<(1<<n);i++)
            {
                int cost=0;
                int sum[]=new int[m];
                for(int j=0;j<n;j++)
                {
                    if((i&(1<<j))>0)
                    {
                        cost+=arr[j][0];
                        for(int k=1;k<=m;k++)
                        sum[k-1]+=arr[j][k];
                    }
                }
                boolean check=true;
                for(int j=0;j<m;j++)
                {
                    if(sum[j]<x)
                    {
                        check=false;
                        break;
                    }
                }
                if(check)
                min=Math.min(min,cost);
            }
            pw.println(min);
        }
        else
        pw.println(-1);
        pw.flush();
        pw.close();
    }
}