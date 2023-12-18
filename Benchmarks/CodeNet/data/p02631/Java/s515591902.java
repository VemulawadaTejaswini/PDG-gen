import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String ars[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        long arr[]=new long[n];
        long xor=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=Long.parseLong(str[i]);
            xor^=arr[i];
        }
        for(int i=0;i<n;i++)
        pw.print((xor^arr[i])+" ");
        pw.flush();
        pw.close();
    }
}