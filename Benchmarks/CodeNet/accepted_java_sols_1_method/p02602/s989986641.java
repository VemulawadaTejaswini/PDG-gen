import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        //int t=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        int arr[]=new int[n];
        str=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(str[i]);
        for(int i=k;i<n;i++)
        {
            if(arr[i]>arr[i-k])
            pw.println("Yes");
            else
            pw.println("No");
        }
        pw.flush();
        pw.close();
    }
}