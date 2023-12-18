import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(str[i]);
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]!=arr[k]&&arr[i]!=arr[j]&&arr[j]!=arr[k])
                    {
                        if(arr[i]+arr[j]>arr[k]&&arr[k]+arr[j]>arr[i]&&arr[i]+arr[k]>arr[j])
                        cnt++;
                    }
                }
            }
        }
        pw.println(cnt);
        pw.flush();
        pw.close();
    }
}