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
        int k=Integer.parseInt(str[1]);
        int arr[]=new int[n+1];
        for(int i=0;i<k;i++)
        {
            int s=Integer.parseInt(br.readLine());
            str=br.readLine().split(" ");
            for(int j=0;j<s;j++)
            arr[Integer.parseInt(str[j])]++;
        }
        int cntr=0;
        for(int i=1;i<=n;i++)
        if(arr[i]==0)
        cntr++;
        pw.println(cntr);
        pw.flush();
        pw.close();
    }
}