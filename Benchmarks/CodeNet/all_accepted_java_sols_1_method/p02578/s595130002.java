import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        long arr[]=new long[n];
        String str[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        arr[i]=Long.parseLong(str[i]);
        long sum=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]-arr[i]>0)
            {
                sum=sum+arr[i-1]-arr[i];
                arr[i]=arr[i-1];
            }
        }
        pw.println(sum);
        pw.flush();
        pw.close();
    }
}