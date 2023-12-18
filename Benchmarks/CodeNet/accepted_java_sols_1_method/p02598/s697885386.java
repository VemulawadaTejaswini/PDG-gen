import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        str=br.readLine().split(" ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(str[i]);
        int l=1,r=(int)1e9;
        while(l<=r)
        {
            int mid=(l+r)/2;
            int req=0;
            for(int i=0;i<n;i++)
            req+=(arr[i]-1)/mid;
            if(req<=k)
            r=mid-1;
            else
            l=mid+1;
        }
        pw.println(r+1);
        pw.flush();
        pw.close();
    }
}