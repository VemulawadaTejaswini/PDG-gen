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
        Arrays.sort(arr);
        long ans=0;
        for(int i=n-1;i>0;i--)
        ans+=arr[i];
        pw.println(ans);
        pw.flush();
        pw.close();
    }
}